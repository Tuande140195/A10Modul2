package _13_thuat_toan_tim_kiem.demo1.Model.repository;

import _13_thuat_toan_tim_kiem.demo1.Model.model.Student;

import java.util.List;

public interface IStudentRepository {
    List<Student> getAll();
     void add(Student student);
     void removeStudent(int index);

}
