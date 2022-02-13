package _8_Clean_code.MVC.demo1.Model.repository;

import _8_Clean_code.MVC.demo1.Model.model.Student;

import java.util.List;

public interface IStudentRepository {
    List<Student> getAll();
     void add(Student student);
     void removeStudent(int index);

}
