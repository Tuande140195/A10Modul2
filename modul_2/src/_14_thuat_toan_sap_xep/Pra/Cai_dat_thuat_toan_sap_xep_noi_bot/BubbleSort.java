package _14_thuat_toan_sap_xep.Pra.Cai_dat_thuat_toan_sap_xep_noi_bot;

public class BubbleSort {
    public static void main(String[] args) {
        int[] list = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};
        boolean needNextPass = true;

        for (int i = 1; i < list.length && needNextPass; i++) {
            needNextPass= false;
            for (int j = 0; j < list.length- i; j++) {
                if (list[j] > list[j + 1]){
                    int temp = list[j];
                    list[j] = list[j+1];
                    list[j+1] = temp;
                    needNextPass= true;
                }
            }

        }
        for (int num :list
             ) {
            System.out.print(num + ", ");
        }
    }
}
