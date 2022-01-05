package _3_Loop.Pra;

import java.text.DecimalFormat;
import java.util.Scanner;

public class tinh_tien_lai {
    public static void main(String[] args) {
double money = 1.0;
int month = 1;
double interestRate = 1.0;
        Scanner input = new Scanner(System.in);

        System.out.println("Sos tiền bạn muốn gửi:");
        money = input.nextDouble();

        System.out.println("Nhập số tháng gửi:");
        month = input.nextInt();

        System.out.println("Nhập lãi suất:");
        interestRate = input.nextDouble();

        double total =0;
        for (int i=0; i<month; i++){
            total += money * (interestRate/100)/12 ;

        }
        DecimalFormat df = new DecimalFormat("#.000");
        System.out.println("Lãi suất: "+ df.format(total));
    }
}
