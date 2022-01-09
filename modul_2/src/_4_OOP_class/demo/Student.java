package _4_OOP_class.demo;

public class Student {
    String name;
    int age;
    String address;
    public Student(String name, int age, String address){
        this.name= name;
        this.age= age;
        this.address= address;
    }
    public Student(){
        this("haiTT", 24, "quảng nam");
    }
    public Student(String name){
        this.name=name;
    }

    public static void main(String[] args) {
        Student student = new Student();
        System.out.println(student.name);
    }
}
