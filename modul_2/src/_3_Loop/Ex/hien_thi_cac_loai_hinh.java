package _3_Loop.Ex;

import java.util.Scanner;

public class hien_thi_cac_loai_hinh {
    public static void main(String[] args) {
        int choice = -1;

        Scanner input = new Scanner(System.in);
        while (choice != 0) {
            System.out.println("Menu:");
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle (The corner is square at 4 different angles: top-left, top-right, botton-left, botton-right)");
            System.out.println("3. Print isosceles triangle");
            System.out.println("4. Exit");
            System.out.println("Enter your choice: ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    int a;
                    int b;

                    System.out.print("height = ");
                    a = input.nextInt();
                    System.out.print("width = ");
                    b = input.nextInt();

                    for (int i = 1; i <= a; i++) {
                        for (int j = 1; j <= b; j++) {
                            System.out.print("*  ");
                        }
                        System.out.println("");
                    }
                    break;
                case 2:
                    int c;
                    System.out.print("height = ");
                    c = input.nextInt();

                    for (int i = 1; i <= c; i++) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print("* ");
                        }
                        System.out.println("");
                    }
                    System.out.println("\n");

                    for (int i = c; i >= 1; i--) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print("* ");
                        }
                        System.out.println("");
                    }
                    break;
                case 3:
                    int height;
                    do {
                        System.out.print("height = ");
                        height = input.nextInt();
                    } while (height <= 0);

                    for (int i = 1; i <= height; i++) {
                        for (int j = 1; j <= height - i; j++) {
                            System.out.print("  ");
                        }
                        for (int k = 1; k <= 2 * i - 1; k++) {
                            System.out.print("* ");
                        }
                        System.out.println("");
                    }
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("No choice:");
            }
        }
    }
}
