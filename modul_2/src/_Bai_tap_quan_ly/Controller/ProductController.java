package _Bai_tap_quan_ly.Controller;

import _Bai_tap_quan_ly.Model.Product;
import _Bai_tap_quan_ly.exeption.NotFoundProductException;
import _Bai_tap_quan_ly.sevice.ProductService;

import java.util.List;

public class ProductController {
    private ProductService productService = new ProductService();
    public void add(Product product){
        productService.add(product);
    }
    public void delete(int id) throws NotFoundProductException {
        productService.delete(id);
    }
    public List<Product> getAll(){
return productService.getAll();
    }
    public List<Product> searchByName(String name){
return productService.searchByName(name);
    }
}
