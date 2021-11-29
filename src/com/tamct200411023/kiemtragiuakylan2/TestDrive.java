package com.tamct200411023.kiemtragiuakylan2;

public class TestDrive {
    public static void main(String[] args) {
        DSLK dslk = new DSLK();
        System.out.println("-----MENU-----");
        System.out.println("Nhap danh sach");
        System.out.println("in danh sach");
        System.out.println("Tim kiem dau danh sach");
        System.out.println("Tim kiem cuoi danh sach");
        System.out.println("Xoa dau danh sach");
        System.out.println("Xoa cuoi danh sach");

        dslk.nhapThongTin();
        dslk.inDanhSach();
        dslk.timKiemDauDS();
        System.out.println("Danh sach sau khi xoa dau");
        dslk.xoaDauDS();
        dslk.inDanhSach();
        System.out.println("Danh sach sau khi xoa cuoi");
        dslk.xoaCuoiDS();
        dslk.inDanhSach();

    }
}
