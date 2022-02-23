package _14_thuat_toan_sap_xep.Ex.Minh_hoa_thuat_toan_sap_xep_chen;



public class InsertSortByStep {
    public static void main(String[] args) {
        int[] list = {1, 9, 4, 6, 5, -4};


        System.out.println("Bắt đàu thực hiện:");
        System.out.println("mảng ban đầu:");
        for (int o:list) {
            System.out.print(o + ",");
        }
        System.out.println();
        insertSortByStep( list);
    }
    public static void insertSortByStep(int[] list){
        for (int i = 1; i < list.length; i++) {
            int key = list[i];
            int j = i -1;
            while ( j>=0 && list[j] > key){
                list[j+1] = list[j];
                j--;
                System.out.println("Thực hiện sắp xếp chèn");
                for (int num: list
                     ) {
                    System.out.print(num +",  ");
                }
                System.out.println();
                System.out.println("Đã chèn "+ key + " vào vị trí thứ " + (j+1));

            }
            list[j + 1] = key;

            System.out.println(" Danh sách sau lần lặp thứ " + i);
            for (int o:list){
                System.out.print(o+" ");
            }
            System.out.println();


        }

    }
}
