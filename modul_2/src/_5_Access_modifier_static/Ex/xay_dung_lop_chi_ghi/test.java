package _5_Access_modifier_static.Ex.xay_dung_lop_chi_ghi;

public class test {
    public static void main(String[] args) {
        Student st1 = new Student();
        Student st2 = new Student();
        st2.setClasses("C03");
        st2.setName("Tuan");
        System.out.println("Student 1 { name: "+st1.getName()+" ,class: "+st1.getClasses()+" }");
        System.out.println("Student 1 { name: "+st2.getName()+" ,class: "+st2.getClasses()+" }");
    }
}
