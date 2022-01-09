package _2_Array.Ex;

import java.util.Arrays;
import java.util.Scanner;

public class xoa_ptu {
    public static void main(String[] args) {
        int[] A = {1,2,3,4,5,0,0};
        boolean check ;
        int  i,number;
        Scanner scanner = new Scanner(System.in);
        for (i=0; i< A.length;i++){
            System.out.print(A[i]+ " ");
        }
        System.out.println("\n Nhập số bạn muốn xóa:");
        number = scanner.nextInt();
        for (i=0;i< A.length;i++){
            if (number == A[i]){
                 check= true;
                 number=i;
            }
        }
       if (check=true){
           for (int j = number;j<A.length-1;j++){
               A[j]=A[j+1];
           }
       }
        System.out.println("Mảng sau khi xóa:");
        for (i=0;i< A.length;i++){
            System.out.print(A[i] +" ");
        }
    }
}
