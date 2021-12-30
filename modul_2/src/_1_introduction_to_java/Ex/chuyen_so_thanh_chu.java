package _1_introduction_to_java.Ex;

import java.util.Arrays;
import java.util.Scanner;

public class chuyen_so_thanh_chu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số bạn muốn:");
        int number = scanner.nextInt();
        //đọc các số có một chữ số:
       switch (number){
           case 0:
               System.out.println(number+" = zero");
               break;
           case 1:
               System.out.println(number+" = one");
               break;
           case 2:
               System.out.println(number+" = two");
               break;
           case 3:
               System.out.println(number+" = three");
               break;
           case 4:
               System.out.println(number+" = four");
               break;
           case 5:
               System.out.println(number+" = five");
               break;
           case 6:
               System.out.println(number+" = six");
               break;
           case 7:
               System.out.println(number+" = seven");
               break;
           case 8:
               System.out.println(number+" = eight");
               break;
           case 9:
               System.out.println(number+" = nine");
               break;
           case 10:
               System.out.println(number+" = ten");
               break;
       }
      if (20>number&&number>=10){
          int ones = number-10;
          switch (ones){
              case 1:
                  System.out.println(number+" = eleven");
                  break;
              case 2:
                  System.out.println(number+" = twelve");
                  break;
              case 3:
                  System.out.println(number+" = thirteen");
                  break;
              case 4:
                  System.out.println(number+" = fourteen");
                  break;
              case 5:
                  System.out.println(number+" = fifteen");
                  break;
              case 6:
                  System.out.println(number+" = sixteen");
                  break;
              case 7:
                  System.out.println(number+" = seventeen");
                  break;
              case 8:
                  System.out.println(number+" = eighteen");
                  break;
              case 9:
                  System.out.println(number+" = nineteen");
                  break;

          }
      }


      if (100>number&&number>=20){
          int tens = number/10 ;
          int ones = number%10;
          String tenss="";
          String oness="";
          switch (tens){
              case 2:
                tenss= "twenty";
                break;
              case 3:
                  tenss="thirty";
                  break;
              case 4:
                  tenss= "forty";
                  break;
              case 5:
                  tenss= "fifty";
                  break;
              case 6:
                  tenss= "sixty";
                  break;
              case 7:
                  tenss= "seventy";
                  break;
              case 8:
                  tenss= "eighty";
                  break;
              case 9:
                  tenss= "ninety";
                  break;
          }
          switch (ones){
              case 1:
                  oness="one";
                  break;
              case 2:
                  oness="two";
                  break;
              case 3:
                  oness="three";
                  break;
              case 4:
                  oness="four";
                  break;
              case 5:
                  oness="five";
                  break;
              case 6:
                  oness="six";
                  break;
              case 7:
                  oness="seven";
                  break;
              case 8:
                  oness="eight";
                  break;
              case 9:
                  oness="nine";
                  break;
          }
          String f = tenss +" "+ oness;
          System.out.println(number +" = "+ f);
      }
      if (999>number&&number>=100){
          int th= number/100;
           int ten1= (number-(th*100))/10;
           int one1 = number-(th*100+ten1*10);

           String ths = " ", ten1s= " ", one1s=" ";

           switch (th){
               case 1:
                   ths="one hundred";
                   break;
               case 2:
                   ths="two hundred";
                   break;
               case 3:
                   ths="three hundred";
                   break;
               case 4:
                   ths="four hundred";
                   break;
               case 5:
                   ths="five hundred";
                   break;
               case 6:
                   ths="six hundred";
                   break;
               case 7:
                   ths="seven hundred";
                   break;
               case 8:
                   ths="eight hundred";
                   break;
               case 9:
                   ths="nine hundred";
                   break;
           }
          switch (ten1){
              case 0:
                  ten1s= " ";
                  break;
              case 1:
                  ten1s="";
              case 2:
                  ten1s= "twenty";
                  break;
              case 3:
                  ten1s="thirty";
                  break;
              case 4:
                  ten1s= "forty";
                  break;
              case 5:
                  ten1s= "fifty";
                  break;
              case 6:
                  ten1s= "sixty";
                  break;
              case 7:
                  ten1s= "seventy";
                  break;
              case 8:
                  ten1s= "eighty";
                  break;
              case 9:
                  ten1s= "ninety";
                  break;
          }
          switch (one1){
              case 1:
                  one1s="one";
                  break;
              case 2:
                  one1s="two";
                  break;
              case 3:
                  one1s="three";
                  break;
              case 4:
                  one1s="four";
                  break;
              case 5:
                  one1s="five";
                  break;
              case 6:
                  one1s="six";
                  break;
              case 7:
                  one1s="seven";
                  break;
              case 8:
                  one1s="eight";
                  break;
              case 9:
                  one1s="nine";
                  break;
          }
          String t = ths +" " + ten1s + " " + one1s;
          System.out.println(number+" = "+ t);

      }
    }
}
