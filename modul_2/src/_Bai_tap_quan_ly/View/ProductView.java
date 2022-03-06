package _Bai_tap_quan_ly.View;

import _Bai_tap_quan_ly.Controller.ProductController;
import _Bai_tap_quan_ly.Model.AuthenticProduct;
import _Bai_tap_quan_ly.Model.HandProduct;
import _Bai_tap_quan_ly.Model.Product;
import _Bai_tap_quan_ly.exeption.NotFoundProductException;

import java.util.List;
import java.util.Scanner;

public class ProductView {
    private static  Scanner scanner = new Scanner(System.in);
    private static ProductController productController = new ProductController();

    public static void main(String[] args) {
while (true){

    System.out.println("___Product Menu___");
    System.out.println("1.Add\n2.Delete\n3.Display\n4.Search\n5.Exit");
    int choose = getchoose(1,5);


    switch (choose){
        case 1:
            add();
            break;
        case 2:
            delete();
            break;
        case 3:
            display();
            break;
        case 4:
            search();
            break;
        case 5:
            System.out.println("Your Exit!!");
            System.exit(0);
            break;

    }

       }
    }

    private static void add(){
        System.out.println("Do you want to add hand(1) or authentic(2) product");
        int choose= getchoose(1,2);


        System.out.printf("Name:");
        String name = scanner.nextLine();
        System.out.printf("Price:");
        double price = Double.parseDouble(scanner.nextLine());
        System.out.printf("Manufacture:");
        String manufacture = scanner.nextLine();

        Product product;

        if (choose==1){
            System.out.printf("Country:");
            String country = scanner.nextLine();
            System.out.printf("Status:");
            String status = scanner.nextLine();

            product = new HandProduct(0, name,price,manufacture,country,status );
        }
        else {
            System.out.printf("Exprired period by year:");
            int exprired_period_year = Integer.parseInt(scanner.nextLine());
            product =new AuthenticProduct(0, name, price,manufacture,exprired_period_year);

        }
        productController.add(product);
        System.out.println("created successfully");
    }

    private static void delete(){
         display();
         boolean check = false;
         do {
             System.out.println("Input your id to delete:");
             int id = Integer.parseInt(scanner.nextLine());
             try {
                 productController.delete(id);
             }catch (NotFoundProductException e){
                        check = true;
             }
         }while (check);

        System.out.println("delete successfully!!");
    }
    private static void display(){
       List<Product>  productList= productController.getAll();
        showProduct(productList);
    }
    private static void search(){
        System.out.println("Input name to search");
        String name = scanner.nextLine();
        List<Product> products = productController.searchByName(name);
       showProduct(products);
    }
    private static void showProduct(List<Product> products){
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i) instanceof HandProduct){
            System.out.println(((HandProduct)products.get(i)).showInfo());
        }else {
                System.out.println(((AuthenticProduct)products.get(i)).showInfo());

            }
        }
    }
    private static int getchoose(int from, int start){
        int choose;
        do {
            System.out.println("Input your choice:");
            choose = Integer.parseInt(scanner.nextLine());
        }while (choose<from|| choose >start);
        return choose;
    }

}
