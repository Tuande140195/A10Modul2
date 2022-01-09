package _2_Array.Ex;

import java.util.Scanner;

public class gia_tri_nho_nhat {
    public static void main(String[] args) {
        int[] Arr = new int[5];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập các giá trị của mảng:");
        for (int i = 0; i< Arr.length; i++){
            System.out.println("phần tử thứ: "+(i+1)+" của mảng là:");
            Arr[i]= scanner.nextInt();
        }
        int min = Arr[0];
        for (int j = 1; j< Arr.length;j++){
            if (Arr[j]<min){
                min= Arr[j];
            }
        }
        System.out.println("Phần tử nhỏ nhất của mảng là:"+ min);
    }
}
