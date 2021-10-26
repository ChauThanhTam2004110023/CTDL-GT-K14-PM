package vn.edu.giadinh.tuan05;

import java.util.Scanner;

public class SinhVien {
    String tenSinhVien;
    Double diemTB;

    public SinhVien()
    {

    }

    Scanner sc = new Scanner(System.in);

    public String gettenSinhVien()
    {
        return tenSinhVien;
    }

    public void settenSinhVien(String tenSinhVien)
    {
        this.tenSinhVien = tenSinhVien;
    }

    public double getdiemTB()
    {
        return diemTB;
    }

    public void setdiemTB(double diemTB)
    {
        this.diemTB = diemTB;
    }

    public SinhVien(String ten, double diem)
    {
        tenSinhVien = ten;
        diemTB = diem;
    }

    public void inThongTin()
    {
        System.out.println("Nhap ten sinh vien vao: " +tenSinhVien);
        System.out.println("Diem trung binh: " +diemTB);
    }

    public void nhapThongTin()
    {
        System.out.println("Ten sinh vien: " );
        tenSinhVien = sc.nextLine();
        System.out.println("Diem: " );
        diemTB = sc.nextDouble();
    }
}
