package _1_introduction_to_java.Ex;

import java.util.Scanner;

public class hien_thi_loi_chao {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên của bạn:");
        String name = scanner.nextLine();
        System.out.println("Hello "+name );
    }
}
