package com.tamct200411023.tuan04;

public class nhanvien {
    String tenNhanVien;
    String diaChi;
    String boPhanLamViec;
    double ngaySinh;
    double luong;

    nhanvien(String ten, String diachi, String bp, double sinh, double Luong)
    {
        tenNhanVien = ten;
        diaChi = diachi;
        boPhanLamViec = bp;
        ngaySinh = sinh;
        luong = Luong; 
    }

    void inThongTin()
    {
        System.out.println("Ten nhan vien: " +tenNhanVien);
        System.out.println("Dia chi: " +diaChi);
        System.out.println("Bo phan lam viec: " +boPhanLamViec);
        System.out.println("Ngay sinh: " +ngaySinh);
        System.out.println("Luong: " +luong);

    }
}
