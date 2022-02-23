package _14_thuat_toan_sap_xep.Ex.Cai_dat_thuat_toan_sap_xep_chen;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = { 12,43,63,43,76,24,44,34,47,65};

        insertionSort(arr);
    }
    public static void insertionSort(int[] arr){

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
