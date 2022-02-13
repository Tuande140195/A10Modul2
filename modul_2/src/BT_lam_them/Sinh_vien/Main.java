package BT_lam_them.Sinh_vien;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StudentList studentList = new StudentList();
        Scanner scanner = new Scanner(System.in);
        int choice;
        while (true) {
            System.out.println("Mời bạn chọn chức năng thực hiện.");
            System.out.println("1. Thêm Học sinh");
            System.out.println("2. Hiển thị học sinh có điểm trung bình trên 15");
            System.out.println("3.Exit");
            System.out.println("choose: ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Nhập số lượng sinh viên bạn muốn");
                    int n =Integer.parseInt(scanner.nextLine());
                    for (int i = 0; i<n; i++) {
                        studentList.add();
                    }
                    break;
                case 2:
                    System.out.println("Danh sách sinh viên có điểm tổng lớn hơn 15 :");
                    studentList.display();
                    break;
                case 3:
                    System.exit(0);
            }
        }
    }
}
