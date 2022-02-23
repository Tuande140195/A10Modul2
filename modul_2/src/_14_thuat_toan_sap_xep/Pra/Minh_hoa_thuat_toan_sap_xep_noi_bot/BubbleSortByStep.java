package _14_thuat_toan_sap_xep.Pra.Minh_hoa_thuat_toan_sap_xep_noi_bot;

import java.util.Scanner;

public class BubbleSortByStep {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào n phần tử: n = ");
        int size = Integer.parseInt(scanner.nextLine());
        int[] list = new int[size];
        System.out.println("Có" + list.length + " giá trị:");
        for (int i = 0; i < list.length; i++) {
            list[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("Các phần tử của danh sách:");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + "\t");
        }
        System.out.println("\nBắt đầu sắp xếp...");
        bubbleSortByStep(list);

    }

    public static void bubbleSortByStep(int[] list) {
        boolean needNextPass = true;
        for (int k = 1; k < list.length && needNextPass; k++) {
            needNextPass = false;
            for (int i = 0; i < list.length - k; i++) {
                if (list[i] > list[i + 1]) {

                    System.out.println("Đổi " + list[i] + " với " + list[i + 1]);
                    int temp = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = temp;

                    needNextPass = true;
                }
            }
            if (needNextPass == false) {
                System.out.println("Mảng đã được sắp xếp và không cần chuyển tiếp");
                break;
            }
            System.out.print("danh sách sau " + k + " lần sắp xếp: ");
            for (int j = 0; j < list.length; j++) {
                System.out.print(list[j] + "\t");
            }
            System.out.println();
        }
    }
}