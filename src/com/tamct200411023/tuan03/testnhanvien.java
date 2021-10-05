package com.tamct200411023.tuan03;

public class testnhanvien {
    public static void main(String[] args) {
        nhanvien Nhanvien;
        Nhanvien = new nhanvien("Châu Thanh Tam", 23.000, "M012", "Bo Phan Tap Doan", 2002);
        System.out.println("Ten: " +Nhanvien.tenNhanVien);
        System.out.println("Luong: " +Nhanvien.luong);
        System.out.println("Dia chi: " +Nhanvien.diaChi);
        System.out.println("Bo phan lam viec: " +Nhanvien.boPhanLamViec);
        System.out.println("Ngay sinh: " +Nhanvien.ngaySinh);
    }
}
