package _2_Array.Ex;

import java.util.Scanner;

public class them_ptu {
    public static void main(String[] args) {
//        int[] A = {1,2,3,4,5,0,0};
        Scanner scanner = new Scanner(System.in);
        int number, index;
        int A[]=new int[10];

        System.out.print("Mời bạn nhập số lượng phần tử của mảng: ");
        int N = scanner.nextInt();
        for (int i=0;i<N;i++){
            System.out.print("Mời bạn nhập phần tử thứ "+(i+1)+" của mảng: ");
            A[i]= scanner.nextInt();
        }
        System.out.println("Mảng trước khi chèn:");
        for (int i=0;i< A.length;i++){
            System.out.print(A[i] +" ");
        }
        System.out.println("\n Nhập số cần chèn:");
        number = scanner.nextInt();
        System.out.println("Nhập vị trí chèn:");
        index = scanner.nextInt();

            if (index <= 1 || index >= A.length - 1) {
                System.out.println("Không chèn được!");

            }else {

                for (int i = A.length-1 ;i>index;i--){
                    A[i ]= A[i-1];
                }
            }
        A[index]= number;
        System.out.println("Mảng sau khi chèn:");
        for (int i=0;i< A.length;i++){
            System.out.print(A[i] +" ");
        }
    }
}
