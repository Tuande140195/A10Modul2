package _6_ke_thua.ex.Lop_Ci_Lop_Cy;

public class Cylinder extends Circle {
    private double height;

    public Cylinder() {
    }

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }
    public double getVolume(){
        return getArea()*height;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + height +
                '}'+" with a subclass "+super.toString();
    }

    public static void main(String[] args) {
        Cylinder cyl = new Cylinder(3.4,"blue",7.0);
        System.out.println(cyl.toString());
        System.out.println("area of circle for cylinder = "+cyl.getArea());
        System.out.println("volume of cylinder = "+cyl.getVolume());
    }
}