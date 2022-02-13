package _12_Java_Collection_Framework.Ex.luyen_tap_su_dung_ArrayList_va_LinkedList.Model.repository;

import _12_Java_Collection_Framework.Ex.luyen_tap_su_dung_ArrayList_va_LinkedList.Model.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository implements IProductRepository{
    public static List<Product> products = new ArrayList<>();


    @Override
    public List<Product> getAll() {
        return  products;
    }
}
