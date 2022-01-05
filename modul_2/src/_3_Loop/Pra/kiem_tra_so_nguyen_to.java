package _3_Loop.Pra;

import java.util.Scanner;

public class kiem_tra_so_nguyen_to {
    public static void main(String[] args) {
        boolean checkk = true;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Nhập Số:");
            int number = scanner.nextInt();
            if (number<2){
                System.out.println(number+ " không phải số nguyên tố!");
            }else {
                int i=2;
                boolean check = true;
                while (i<number){
                    if (number% i== 0){
                        check= false;
                        break;
                    }
                    i++;
                }
                if (check){
                    System.out.println(number + " là số nguyên tố!");
                }else {
                    System.out.println(number + " không phải là số nguyên tố!");
                }
            }
            System.out.println("Bạn muốn tiếp tục không: \n 1. Có \n 2.Không");
            int loop = scanner.nextInt();

            if (loop==2){
                System.out.println("Bạn đã thoát");
                checkk = false;
                return ;
            }else if (loop==1){
                checkk=true;

            }else {
                System.out.println("Bạn nhập sai, chương trình tự động thoát");
                checkk=false;
            }

        }while (checkk = true);


    }
}
