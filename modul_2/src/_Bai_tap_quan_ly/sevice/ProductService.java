package _Bai_tap_quan_ly.sevice;

import _Bai_tap_quan_ly.Model.AuthenticProduct;
import _Bai_tap_quan_ly.Model.HandProduct;
import _Bai_tap_quan_ly.Model.Product;
import _Bai_tap_quan_ly.exeption.NotFoundProductException;
import _Bai_tap_quan_ly.util.FileHelper;

import java.util.ArrayList;
import java.util.List;

public class ProductService {
    private List<Product> products =new ArrayList<>();
    private FileHelper fileHelper = new FileHelper();
    private static final String path ="src/_Bai_tap_quan_ly/data/product.csv";

    public ProductService(){
       products = toProduct(path);
    }

    public void add(Product product){
        int lastId =0;
        if (products.size()>0){
            lastId = products.get(products.size()-1).getId();
        }

        product.setId(lastId + 1);
        products.add(product);

        fileHelper.write(path, products);
    }
    public List<Product> getAll() {
       return products;
    }
    public void delete(int id) throws NotFoundProductException{
        boolean check = false;

       int size = products.size();
        for (int i = 0; i < size; i++) {
            if (products.get(i).getId() == id){
                products.remove(i);
                check=true;
                break;
            }
        }
        if (check){
            fileHelper.write(path,products);
        }else {
            throw new NotFoundProductException("ID is not exits");
        }

    }
    public List<Product> searchByName(String name){
        List<Product> result = new ArrayList<>();

        int size = products.size();
        for (int i = 0; i < size; i++) {
            if (products.get(i).getName().contains(name)){
                result.add(products.get(i));
            }
        }
        return result;
    }

    private List<Product> toProduct(String path){
        List<Product> result = new ArrayList<>();

        List<String> stringList = fileHelper.read(path);

        for (int i = 0; i < stringList.size(); i++) {
            String[] tpm = stringList.get(i).split(",");
            int id = Integer.parseInt(tpm[0]);
            String name = tpm[1];
            double price = Double.parseDouble(tpm[2]);
            String manufacturer = tpm[3];

            if (tpm.length>5){
                String country = tpm[4];
                String status = tpm[5];
                HandProduct handProduct = new HandProduct(id,name,price,manufacturer,country, status);
                result.add(handProduct);
            }else {
                int expried_period_year = Integer.parseInt(tpm[4]);
                AuthenticProduct authenticProduct = new AuthenticProduct(id,name,price,manufacturer,expried_period_year);
                result.add(authenticProduct);
            }
        }
        return result;
    }
}
