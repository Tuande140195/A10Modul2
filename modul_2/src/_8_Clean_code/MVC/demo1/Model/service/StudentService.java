package _8_Clean_code.MVC.demo1.Model.service;

import _8_Clean_code.MVC.demo1.Model.model.Student;
import _8_Clean_code.MVC.demo1.Model.repository.IStudentRepository;
import _8_Clean_code.MVC.demo1.Model.repository.StudentRepository;

import java.util.List;
import java.util.Scanner;

public class StudentService implements IStudentService {
    private IStudentRepository iStudentRepository = new StudentRepository();
          Scanner scanner = new Scanner(System.in);
    @Override
    public void add() {
        System.out.println("Enter id Student:");
        int codeStudent = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter name:");
        String nameStudent = scanner.nextLine();
        System.out.println("Enter Birth:");
        String dateOfBirth = scanner.nextLine();
        System.out.println("Enter Point:");
        double point = Double.parseDouble(scanner.nextLine());

        Student newStudent = new Student(codeStudent, nameStudent,dateOfBirth,point);
         iStudentRepository.add(newStudent);
    }

    @Override
    public void delete() {
        System.out.println("nhập mã code:");
        int code = Integer.parseInt(scanner.nextLine());
        List<Student> students = iStudentRepository.getAll();
        for (int i = 0; i<students.size();i++){
            if (code==students.get(i).getCodeStudent()){
                iStudentRepository.removeStudent(i);
                break;
            }
        }




//        System.out.println("Enter id you want remove:");
//        int codeStudentA = Integer.parseInt(scanner.nextLine());
//        Student[] students = iStudentRepository.getAll();
//        int count = search(students, codeStudentA);
//        int i = count;
//        if (i != -1) {
//            System.out.println("You have delete "+ students[count].getNameStudent()+"successfully");
//            for (; i < students.length; i++) {
//                if (students[i] == null) {
//                    break;
//                }
//                students[i] = students[i + 1];
//            }
//            for (Student student : students) {
//                if (student == null) {
//                    break;
//                }
//                System.out.println(student);
//            }
//        }

        }


    public static int search(Student[] students, int codeStudentA) {
       boolean check = false;
        int count=0;

        for (int i=0; i<students.length;i++){
            if (students[i]==null){
                break;
            }if (students[i].getCodeStudent()==codeStudentA){
                check=true;
                count=i;
            }
        }
        if (check==false){
            System.out.println("Not student!");
            return -1;
        }
        return count ;
    }


    public void display() {
        List<Student> students = iStudentRepository.getAll();
        for (Student student: students) {
            if(student == null) {
                break;
            }
            System.out.println(student);
        }
    }


}

