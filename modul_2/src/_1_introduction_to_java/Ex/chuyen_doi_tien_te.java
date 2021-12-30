package _1_introduction_to_java.Ex;

import java.util.Scanner;

public class chuyen_doi_tien_te {
    public static void main(String[] args) {
        double tiendachuyen;

        boolean check = true;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Bạn Hãy chọn: \n 1.Chuyển đổi từ USD thành VND\n 2.Chuyển đổi từ VND thành USD ");
            int chon = Integer.parseInt(scanner.nextLine());
            System.out.println("Số tiền bạn muốn chuyển/Amount you want to convert: ");
            double sotien = scanner.nextDouble();
            if (chon==1){
                tiendachuyen = sotien*23000;
                System.out.println(sotien + " chuyển qua VND là: " + tiendachuyen+ " VND");
                check=true;
            }else if (chon==2){
                tiendachuyen = sotien/23000;
                System.out.println(sotien + " chuyển qua USD là: " + tiendachuyen+ " USD");
                check=true;
            }else {
                System.out.println("Bạn chọn sai.Mời nhập lại!");
                check=false;
            }
        }while (check==false);

    }
}
