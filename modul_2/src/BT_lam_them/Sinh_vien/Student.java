package BT_lam_them.Sinh_vien;

public class Student {
    private int id;
    private  String name;
    private String dateOfBirth;
    private double pointT;
    private double pointL;
    private double pointH;


    public Student(){

    }

    public Student(int id, String name, String dateOfBirth, double pointT, double pointL, double pointH) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.pointT = pointT;
        this.pointL = pointL;
        this.pointH = pointH;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public double getPointT() {
        return pointT;
    }

    public void setPointT(double pointT) {
        this.pointT = pointT;
    }

    public double getPointL() {
        return pointL;
    }

    public void setPointL(double pointL) {
        this.pointL = pointL;
    }

    public double getPointH() {
        return pointH;
    }

    public void setPointH(double pointH) {
        this.pointH = pointH;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", pointT=" + pointT +
                ", pointL=" + pointL +
                ", pointH=" + pointH +
                ",avgPoint=" + avgPoint() +
                '}';
    }
    public double avgPoint(){
        return this.pointT+ this.pointL + this.pointH;
    }
}
