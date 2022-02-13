package _7_Abstrac_class_Interface.Ex.trien_khai_interface_Resizeable_cho_cac_lop_hinh_hoc;


import _7_Abstrac_class_Interface.Ex.hinh.Circle;
import _7_Abstrac_class_Interface.Ex.hinh.Rectangle;
import _7_Abstrac_class_Interface.Ex.hinh.Shape;
import _7_Abstrac_class_Interface.Ex.hinh.Square;

public class Main {
    public static void main(String[] args) {
        Shape[] shape = new Shape[3];
        shape[0]= new Circle(3.0);
        shape[1]= new Rectangle(5.0,3.0,"blue",false);
        shape[2]= new Square("blue",true,2.0);
        for (int i = 0; i < shape.length; i++) {
            System.out.println(shape[i].toString());
        }
        ((Circle)shape[0]).resize(50);
        ((Rectangle)shape[1]).resize(50);
        ((Square)shape[2]).resize(50);
        for (int i = 0; i < shape.length; i++) {
            System.out.println(shape[i].toString());
        }
    }
}
