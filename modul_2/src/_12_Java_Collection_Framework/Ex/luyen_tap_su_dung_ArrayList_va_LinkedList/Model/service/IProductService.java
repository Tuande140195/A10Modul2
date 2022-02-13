package _12_Java_Collection_Framework.Ex.luyen_tap_su_dung_ArrayList_va_LinkedList.Model.service;

import _12_Java_Collection_Framework.Ex.luyen_tap_su_dung_ArrayList_va_LinkedList.Model.model.Product;

import java.util.List;

public interface IProductService<E> {
    void add();
    void display();
    void update(int id);
    void delete(int id);
    List<Product> search(String name);
    void sort(int choice);

}
