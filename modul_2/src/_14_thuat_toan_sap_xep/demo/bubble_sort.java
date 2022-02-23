package _14_thuat_toan_sap_xep.demo;

public class bubble_sort {
    public static void main(String[] args) {
        int[] arr = { 12,43,63,43,76,24,44,34,47,65};
        boolean swap = true;
        for (int i = 0; i < arr.length && swap; i++) {
            swap= false;
            for (int j = 0; j < arr.length-1-i; j++) {
                 if (arr[j] > arr[j+1]){
                     swap= true;
                     int temp = arr[j];
                     arr[j]= arr[j+1];
                     arr[j+1]= temp;
                 }
            }

        }
        for (int num:arr) {
            System.out.print(num+ ", ");
        }
    }
}
