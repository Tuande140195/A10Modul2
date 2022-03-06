package baitapquanly1.product;

public class PhuongTien {
    private String Bien_kiem_soat;
    private String Ten_hang;
    private int Nam_sx;
    private String Ten_chu_so_huu;

    public PhuongTien(String bien_kiem_soat, String ten_hang, int nam_sx, String ten_chu_so_huu) {
        Bien_kiem_soat = bien_kiem_soat;
        Ten_hang = ten_hang;
        Nam_sx = nam_sx;
        Ten_chu_so_huu = ten_chu_so_huu;
    }

    public String getBien_kiem_soat() {
        return Bien_kiem_soat;
    }

    public void setBien_kiem_soat(String bien_kiem_soat) {
        Bien_kiem_soat = bien_kiem_soat;
    }

    public String getTen_hang() {
        return Ten_hang;
    }

    public void setTen_hang(String ten_hang) {
        Ten_hang = ten_hang;
    }

    public int getNam_sx() {
        return Nam_sx;
    }

    public void setNam_sx(int nam_sx) {
        Nam_sx = nam_sx;
    }

    public String getTen_chu_so_huu() {
        return Ten_chu_so_huu;
    }

    public void setTen_chu_so_huu(String ten_chu_so_huu) {
        Ten_chu_so_huu = ten_chu_so_huu;
    }

    @Override
    public String toString() {
        return "PhuongTien{" +
                "Bien_kiem_soat='" + Bien_kiem_soat + '\'' +
                ", Ten_hang='" + Ten_hang + '\'' +
                ", Nam_sx=" + Nam_sx +
                ", Ten_chu_so_huu='" + Ten_chu_so_huu + '\'' +
                '}';
    }
}
