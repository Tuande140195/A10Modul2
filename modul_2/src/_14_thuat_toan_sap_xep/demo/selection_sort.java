package _14_thuat_toan_sap_xep.demo;

public class selection_sort {
    public static void main(String[] args) {
        int[] arr = { 12,43,63,43,76,24,44,34,47,65};        for (int i = 0; i < arr.length; i++) {
            int min_index = i;
            for (int j = i+1; j < arr.length ; j++) {
                if (arr[j] < arr[min_index]){
                    min_index =j;
                }
            }
            int temp = arr[min_index];
            arr[min_index] = arr[i];
            arr[i] = temp;
        }
        for (int num: arr
             ) {
            System.out.print(num + ", ");

        }
    }
}
