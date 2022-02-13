package _7_Abstrac_class_Interface.Ex.hinh;
import  _7_Abstrac_class_Interface.Ex.trien_khai_interface_Resizeable_cho_cac_lop_hinh_hoc.Resizeable;

    public class Rectangle extends Shape implements Resizeable {
        private double width = 1.0;
        private double length = 1.0;

        public Rectangle() {
        }

        public Rectangle(double width, double length) {
            this.width = width;
            this.length = length;
        }

        public Rectangle(double width, double length, String color, boolean filled) {
            super(color, filled);
            this.width = width;
            this.length = length;
        }

        @Override
        public void resize(double percent) {
            setLength(getLength()+(getLength()*percent/100));
            setWidth(getWidth()+(getWidth()*percent/100));
        }

        public double getWidth() {
            return width;
        }

        public void setWidth(double width) {
            this.width = width;
        }

        public double getLength() {
            return length;
        }

        public void setLength(double length) {
            this.length = length;
        }

        public double getArea() {
            return width * this.length;
        }

        public double getPerimeter() {
            return 2 * (width + this.length);
        }

        @Override
        public String toString() {
            return "A Rectangle with width="
                    + getWidth()
                    + " and length="
                    + getLength()
                    + ", the area is "
                    + getArea()+" and the Perimeter is "+getPerimeter();
        }

}
