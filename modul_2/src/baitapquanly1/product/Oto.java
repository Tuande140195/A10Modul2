package baitapquanly1.product;

public class Oto extends PhuongTien {
    private int So_cho_ngoi;
    private String Kieu_xe;

    public Oto(String bien_kiem_soat, String ten_hang, int nam_sx, String ten_chu_so_huu, int so_cho_ngoi, String kieu_xe) {
        super(bien_kiem_soat, ten_hang, nam_sx, ten_chu_so_huu);
        So_cho_ngoi = so_cho_ngoi;
        Kieu_xe = kieu_xe;
    }

    public String getKieu_xe() {
        return Kieu_xe;
    }

    public void setKieu_xe(String kieu_xe) {
        Kieu_xe = kieu_xe;
    }

    public int getSo_cho_ngoi() {
        return So_cho_ngoi;
    }

    public void setSo_cho_ngoi(int so_cho_ngoi) {
        So_cho_ngoi = so_cho_ngoi;
    }
}
