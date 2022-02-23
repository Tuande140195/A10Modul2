package _14_thuat_toan_sap_xep.demo;

public class Insertion_sort {
    public static void main(String[] args) {
        int[] arr = { 12,43,63,43,76,24,44,34,47,65};
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i -1;
            while ( j>=0 && arr[j] > key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
        for (int num: arr
             ) {
            System.out.print(num + ", ");
        }
    }
}
