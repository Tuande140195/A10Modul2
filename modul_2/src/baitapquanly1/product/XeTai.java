package baitapquanly1.product;

public class XeTai extends PhuongTien {
    private int Trong_tai;

    public XeTai(String bien_kiem_soat, String ten_hang, int nam_sx, String ten_chu_so_huu, int trong_tai) {
        super(bien_kiem_soat, ten_hang, nam_sx, ten_chu_so_huu);
        Trong_tai = trong_tai;
    }

    public int getTrong_tai() {
        return Trong_tai;
    }

    public void setTrong_tai(int trong_tai) {
        Trong_tai = trong_tai;
    }
}
