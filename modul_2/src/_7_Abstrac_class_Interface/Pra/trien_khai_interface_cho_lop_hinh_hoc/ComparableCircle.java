package _7_Abstrac_class_Interface.Pra.trien_khai_interface_cho_lop_hinh_hoc;

import _6_ke_thua.Pra.hedoituonghinhhoc.Circle;

public class ComparableCircle extends Circle implements Comparable<ComparableCircle> {
    public ComparableCircle() {
    }

    public ComparableCircle(double radius) {
        super(radius);
    }

    public ComparableCircle(String color, Boolean filled, double radius) {
        super(radius, color, filled);
    }

    @Override
    public int compareTo(ComparableCircle o) {
        if (getRadius() > o.getRadius()) {
            System.out.println(getRadius());
            return 1;
        } else if (getRadius() < o.getRadius()) {
            System.out.println(getRadius());
            return -1;
        } else {
            System.out.println(getRadius());
            return 1;
        }
    }
}
