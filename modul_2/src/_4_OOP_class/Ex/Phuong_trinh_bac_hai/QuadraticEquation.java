package _4_OOP_class.Ex.Phuong_trinh_bac_hai;

import java.util.Scanner;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation(){

    }
    public QuadraticEquation(double a, double b, double c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    public double input(){
        double number;
        Scanner scanner = new Scanner(System.in);
        number = Double.parseDouble(scanner.nextLine());
        return number;
    }
    void inputPT() {
        System.out.println("Moi ban nhap phuong trinh can giai: ");
        System.out.println("a: ");a=input();
        System.out.println("b: ");b=input();
        System.out.println("c: ");c=input();
    }
    void SolveTheEquation(){
        if (a==0){
            if (b!=0){
                double x;
                 x= -c/b;
                 x=Math.round(x*100.0)/100.0;
                System.out.println("Nghiệm của pt là: "+x);
            }else{
                System.out.println("Phương trình vô nghiệm");
            }
        }else{
            {
                double delta = b * b - 4 * a * c;
                if (delta < 0) {
                    System.out.println("Phuong trinh vo nghiem!");
                } else if (delta == 0) {
                    double x;
                    x = (-b) / (2 * a);
                    System.out.println("Phuong trinh co nghiem kep: ");
                    System.out.println("x= " + Math.round(x * 100.0) / 100.0);
                } else {
                    double x1;
                    double x2;
                    x1 = (-b + Math.sqrt(delta)) / (2 * a);
                    x2 = (-b - Math.sqrt(delta)) / (2 * a);
                    System.out.println("Phuong trinh co nghiem phan biet: ");
                    System.out.println("x1: " + Math.ceil(x1 * 100.0) / 100.0);
                    System.out.println("x2: " + Math.round(x2 * 100.0) / 100.0);
                }
            }
        }
    }

}
