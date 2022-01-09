package _2_Array.Ex;

import java.util.Scanner;

public class ptu_lon_nhat_cua_ma_tran {
    public static void main(String[] args) {
        int[][] Arr= new int[2][4];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập các phần tử cho ma trận: ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("A[" + i + "]["+ j + "] = ");
                Arr[i][j] = scanner.nextInt();
            }
        }

        int max = Arr[0][0];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                if (max < Arr[i][j]) {
                    max = Arr[i][j];
                }
            }
        }

        System.out.println("Phần tử lớn nhất trong ma trận = " + max);
    }
}
