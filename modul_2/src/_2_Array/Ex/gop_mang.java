package _2_Array.Ex;

import java.util.Scanner;

public class gop_mang {
    public static void main(String[] args) {
        int[] Arr1 = new int[4];
        int[] Arr2 = new int [5];
        int[] Arr3 = new int [Arr1.length+Arr2.length];
        Scanner scanner= new Scanner(System.in);

        System.out.println("Mời nhập Mảng 1:");
        for (int i = 0; i<Arr1.length;i++){
            System.out.println("Nhập phần tử thứ "+(i+1)+"\n");
            Arr1[i] = scanner.nextInt();
        }
        System.out.println("Mời nhập Mảng 2:");
        for (int i = 0; i<Arr2.length;i++){
            System.out.println("Nhập phần tử thứ "+(i+1)+"\n");
            Arr2[i] = scanner.nextInt();
        }

        System.out.println("Mảng 1 của bạn là: ");
        for (int i=0;i<Arr1.length;i++){
            System.out.print(Arr1[i]+" ");
            Arr3[i]= Arr1[i];
        }
        System.out.println("\n Mảng 2 của bạn là: ");
        for (int i=0;i<Arr2.length;i++){
            System.out.print(Arr2[i]+" ");
            Arr3[i+Arr1.length]= Arr2[i];
        }
        System.out.println("\n Mảng 3 của bạn là:");
        for (int i=0;i<Arr3.length;i++){
            System.out.print(Arr3[i]+" ");

        }

    }
}
