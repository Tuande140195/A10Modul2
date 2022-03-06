package baitapquanly1.main;

import baitapquanly1.product.Oto;
import baitapquanly1.product.PhuongTien;
import baitapquanly1.product.XeTai;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;
import java.util.Scanner;

public class Main {
    private static  Scanner scanner = new Scanner(System.in);
    private static PhuongTien phuongTien;
    private static Oto oto;

    public static void main(String[] args) {

        while (true) {

            System.out.println("CHƯƠNG TRÌNH QUẢN LÝ PHƯƠNG TIỆN GIAO THÔNG");
            System.out.println("Chọn chức năng:");
            System.out.println("1.Thêm mới phương tiện\n2.Hiển thị phương tiện\n3.Xóa phương tiện\n4.Thoát");
            int choose;
            do {
                System.out.println("Mời bạn chọn chức năng:");
                choose = Integer.parseInt(scanner.nextLine());
            } while (choose < 1 || choose > 4);

            switch (choose) {
                case 1:
                    add();
                    break;
                case 2:
                    delete();
                    break;
                case 3:
                    display();
                    break;
                case 4:
                    System.out.println("Bạn đã thoát chương trình!!");
                    System.exit(0);
                    break;
            }
        }

    }

    private static void add(){
        System.out.println("Bạn muốn thêm phương tiện nào:\n1.Thêm xe tải,\n2.Thêm oto,\n3.Thêm xe máy,");
        int choose;
        do {
            choose = Integer.parseInt(scanner.nextLine());
        }while (choose<1||choose>3);

        System.out.println("Biển kiểm soát:");
        String Bien_kiem_soat = scanner.nextLine();
        System.out.println("Hãng sản xuất:");
        String Ten_hang = scanner.nextLine();
        System.out.println("Năm sản xuất:");
        int Nam_sx = Integer.parseInt(scanner.nextLine());
        System.out.println("Tên chủ sở hữu:");
        String Ten_chu_so_huu = scanner.nextLine();


        if (choose==1){
            System.out.println("Mời bạn nhập tải trọng");
            int Trong_tai = Integer.parseInt(scanner.nextLine());
            phuongTien = new XeTai(Bien_kiem_soat,Ten_hang,Nam_sx,Ten_chu_so_huu, Trong_tai);

        }else if (choose==2){
            System.out.println("Mời bạn chọn kiểu xe:\n1.Xe khách\n 2. Xe du lịch");
            choose = Integer.parseInt(scanner.nextLine());

            if (choose==1){
                System.out.println("Bạn chọn xe khách");

            }else {
                System.out.println("Bạn chọn xe du lịch");

            }
            System.out.println("Mời bạn nhập số chỗ ngồi:");
            int so_cho_ngoi = Integer.parseInt(scanner.nextLine());

        }else {
            System.out.println("Mời bạn nhập công suất:");
            int cong_suat = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("Bạn đã thêm mới thành công");
    }
    private static void delete(){

    }
    private static void display(){

    }
}
