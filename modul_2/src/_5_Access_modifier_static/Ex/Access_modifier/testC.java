package _5_Access_modifier_static.Ex.Access_modifier;

public class testC {
    public static void main(String[] args) {
        Circle cr1 = new Circle();
        Circle cr2 = new Circle(6.0);
        System.out.println("Circle 1 {"+"radius: "+cr1.getRadius()+" and color: "+cr1.getColor()+"}");
        System.out.println("Circle 2 {"+"radius: "+cr2.getRadius()+" and color: "+cr2.getColor()+"}");
    }
}

