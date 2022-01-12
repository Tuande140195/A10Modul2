package _5_Access_modifier_static.Pra.static_method;

public class Student {
    private int rollno;
    private String name;
    private static String college = "BBDIT";

    Student(int r, String n) {
        rollno = r;
        name = n;
    }

    static void change() {
        college = "CODEGYM";
    }


    void display() {
        System.out.println(rollno + " " + name + " " + college);
    }
}
