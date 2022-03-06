package baitapquanly1.product;

public class XeMay extends PhuongTien {
    private int Cong_suat;

    public XeMay(String bien_kiem_soat, String ten_hang, int nam_sx, String ten_chu_so_huu, int cong_suat) {
        super(bien_kiem_soat, ten_hang, nam_sx, ten_chu_so_huu);
        Cong_suat = cong_suat;
    }

    public int getCong_suat() {
        return Cong_suat;
    }

    public void setCong_suat(int cong_suat) {
        Cong_suat = cong_suat;
    }
}
