package _7_Abstrac_class_Interface.Ex.trien_khai_interface_colorable_cho_cac_lop_hinh_hoc;


import _7_Abstrac_class_Interface.Ex.hinh.Circle;
import _7_Abstrac_class_Interface.Ex.hinh.Rectangle;
import _7_Abstrac_class_Interface.Ex.hinh.Shape;
import _7_Abstrac_class_Interface.Ex.hinh.Square;

public class main {
    public static void main(String[] args) {
        Shape[] shape = new Shape[3];
        shape[0]= new Square("Blue",true,2.5);
        shape[1] = new Circle(3.0);
        shape[2] = new Rectangle(4.0,2.0,"Red",false);

        for (int i = 0; i < shape.length; i++) {
            System.out.print(" the area is: ");
            if (shape[i] instanceof Circle){
                System.out.println(((Circle)shape[i]).getArea());;
            }
            else if (shape[i] instanceof Rectangle){
                System.out.println(((Rectangle)shape[i]).getArea());
            }
            else if (shape[i] instanceof Colorable){
                ((Square) shape[i]).howToColor();
            }
        }
    }
}
