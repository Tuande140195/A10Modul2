package _7_Abstrac_class_Interface.Pra.Trien_khia_interface_so_sanh_hinh_hoc;

import _6_ke_thua.Pra.hedoituonghinhhoc.Circle;

import java.util.Comparator;

public class CircleComparator implements Comparator<Circle> {

    @Override
    public int compare(Circle c1, Circle c2) {
        if (c1.getRadius() > c2.getRadius()) return 1;
        else if (c1.getRadius() < c2.getRadius()) return -1;
        else return 0;
    }
}
