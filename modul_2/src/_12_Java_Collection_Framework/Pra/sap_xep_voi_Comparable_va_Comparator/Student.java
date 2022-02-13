package _12_Java_Collection_Framework.Pra.sap_xep_voi_Comparable_va_Comparator;

public class Student implements Comparable<Student> {
    private String nameStudent;
    private int ageStudent;
    private String addressStudent;

    public Student() {
    }

    public Student(String nameStudent, int ageStudent, String addressStudent) {
        this.nameStudent = nameStudent;
        this.ageStudent = ageStudent;
        this.addressStudent = addressStudent;
    }

    public String getNameStudent() {
        return nameStudent;
    }

    public void setNameStudent(String nameStudent) {
        this.nameStudent = nameStudent;
    }

    public int getAgeStudent() {
        return ageStudent;
    }

    public void setAgeStudent(int ageStudent) {
        this.ageStudent = ageStudent;
    }

    public String getAddressStudent() {
        return addressStudent;
    }

    public void setAddressStudent(String addressStudent) {
        this.addressStudent = addressStudent;
    }

    @Override
    public String toString() {
        return "Student{" +
                "nameStudent='" + nameStudent + '\'' +
                ", ageStudent=" + ageStudent +
                ", addressStudent='" + addressStudent + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student student) {
        return this.getNameStudent().compareTo(student.getNameStudent());
    }
}