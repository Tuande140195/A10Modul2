package _5_Access_modifier_static.Ex.Access_modifier;

public class Circle {
    private double radius = 1.0;
    private String color = "red";

    public Circle(){

    }
    public Circle(double radius){
        this.radius= radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    String getColor() {
        return color;
    }

}
