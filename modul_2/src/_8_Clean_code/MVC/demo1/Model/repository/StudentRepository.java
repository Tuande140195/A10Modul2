package _8_Clean_code.MVC.demo1.Model.repository;

import _8_Clean_code.MVC.demo1.Model.model.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StudentRepository implements IStudentRepository {
    private static List<Student> students = new ArrayList<>();

    static {
        students.add( new Student(1,"haiTT", "1989", 9.0));
        students.add( new Student(2,"TrungDP","1998-01-01",8));
        students.add( new Student(3,"TrungDC","1998-01-01",9));

    }
    @Override
    public List<Student> getAll() {
        return students;
    }
    @Override
     public void add(Student student){
        students.add(student);


//       for (int i = 0; i<students.length; i++){
//           if (students[i]==null){
//               students[i]= student;
//               break;
//           }
//       }
//       System.out.println("New Array Student:");
//       for (Student studentA: students) {
//           if(studentA == null) {
//               break;
//           }
//           System.out.println(studentA);
//       }


    }

    @Override
    public void removeStudent(int index) {
        students.remove(index);
    }
}
