package _2_Array;

import java.util.Scanner;

public class demo {
//    public static void main(String[] args) {
////        int[] arr = new int[8];
//// cách 2:
//        int[] arr = {1,2,3,4,5,6,7,8,};
//        String[] arr1 = new String[7];
//        System.out.println(arr);
//
//        for (int i = 0; i<arr1.length; i++){
//            System.out.println(arr1[i]);
//        }
//    }
public static void chen_mang(int []a,int i,int X,int length){
    for (int j=length-1;j>=i;j--){
        a[j+1]=a[j];
    }
    a[i]=X;
}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Mời bạn nhập số lượng phần tử của mảng: ");
        int N = sc.nextInt();
        int arr[]=new int[10];
        for (int i=0;i<N;i++){
            System.out.print("Mời bạn nhập phần tử thứ "+(i+1)+" của mảng: ");
            arr[i]= sc.nextInt();
        }
        System.out.println("Mảng của bạn là: ");
        for (int i=0;i<N;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.print("Mời bạn nhập phần tử cần chèn: ");
        int num = sc.nextInt();
        System.out.print("Mời bạn nhập vị trí cần chèn: ");
        int index = sc.nextInt();
        if (index<=1||index>=N-1){
            System.out.println("Không chèn được phần tử vào mảng");
        }
        else {
            chen_mang(arr,index,num,N);
            for (int i=0;i<N+1;i++){
                System.out.print(arr[i]+" ");
            }
        }

    }
}
