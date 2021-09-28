package comChauThanhTam2004110023;

public class SinhVien {
    String tenSinhVien;
    int tuoi;
    int mssv;
    String queQuan;
    public SinhVien() {};

    public SinhVien(String ten, int t, int m, String que)
    {
       tenSinhVien = ten;
       tuoi = t;
       mssv = m;
       queQuan = que;
    }

    void inThongTin()
    {
        System.out.println("Ten sinh vien: " +tenSinhVien);
        System.out.println("Nhap tuoi vao: " +tuoi);
        System.out.println("MSSV: " +mssv);
        System.out.println("Que quan: " +queQuan);
    }
        
}
