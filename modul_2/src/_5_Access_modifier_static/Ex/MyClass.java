package _5_Access_modifier_static.Ex;

public class MyClass {
    void method(int x, int y) {
        x = 5;
        y = 5;
    }

    public static void main(String[] args) {
        MyClass o = new MyClass();
        int x = 1, y = 1;
        o.method(x, y);
        System.out.printf("x=%d, y=%d", x, y);
    }
}
