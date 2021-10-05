package com.tamct200411023.tuan03;

public class testsach {
    public static void main(String[] args) {
        sach Sach;
        Sach = new sach("Lap trinh Java", 16.000, "Nhà San Xuất Việt Nam", 2021, 20, "Lai Sach Giao Khoa");
        System.out.println("Sach: " +Sach.sach);
        System.out.println("Gia: " +Sach.gia);
        System.out.println("Nha san xuat: " +Sach.nhaSanXuat);
        System.out.println("Nam san xuat: " +Sach.namSanXuat);
        System.out.println("So luong: " +Sach.soLuong);
        System.out.println("Loai: " +Sach.loai);

    }
}
