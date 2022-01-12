package _5_Access_modifier_static.Ex.xay_dung_lop_chi_ghi;

public class Student {
    private String name= "Jonh";
    private String classes= "C02";

    public Student(){

    }

    public void setName(String name) {
        this.name = name;
    }
     public void setClasses(String classes){
        this.classes = classes;
     }
    public String getName() {
        return name;
    }

    public String getClasses() {
        return classes;
    }
}
