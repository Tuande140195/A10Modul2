package BT_lam_them.Sinh_vien;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentList {
    ArrayList<Student> students = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void add() {

            System.out.println("Input Id student:");
            int id = Integer.parseInt(scanner.nextLine());
            System.out.println("Input name:");
            String name = scanner.nextLine();
            System.out.println("Input dateOfBirth:");
            String dateOfBirth = scanner.nextLine();
            System.out.println("Input pointMath");
            double pointT = Double.parseDouble(scanner.nextLine());
            System.out.println("Input pointPhy");
            double pointL = Double.parseDouble(scanner.nextLine());
            System.out.println("Input pointCh");
            double pointH = Double.parseDouble(scanner.nextLine());

            Student stuL = new Student(id, name, dateOfBirth, pointT, pointL, pointH);
            students.add(stuL);
            System.out.println("Added!!!!");


        }


    public void display(){
//      ArrayList<Student> students1 = new ArrayList<>();
//      for (int i = 0; i< students.size(); i++){
//          if (students.get(i).avgPoint()> 15){
//              students1.add(students.get(i));
//          }
//      }
//      for (int i = 0; i< students1.size(); i++){
//          System.out.println(students1.get(i));
//      }
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).avgPoint()> 15){
                System.out.println(students.get(i));
          }
        }

//        students.stream().filter(e-> e.avgPoint()>= 15).forEach(System.out::println);

    }

}
