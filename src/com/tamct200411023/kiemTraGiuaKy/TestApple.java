package com.tamct200411023.kiemTraGiuaKy;

import java.util.Scanner;

public class TestApple {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        Apple apple;
        ArrayListApple ql = new ArrayListApple();
        Scanner sc = new Scanner(System.in);
        System.out.println("1.Nhap");
        System.out.println("2.Hien thi");
        System.out.println("3.Tiem Kiem "); 

        ql.nhapDanhSach(sc);
        System.out.println("Danh sach sinh vien vua nhap la: ");
        ql.hienThiDanhSach();
        System.out.println("Danh sach sau khi sap xep");
        ql.hienThiDanhSach();

        //Nhap danh sach sonh vien can tim
        System.out.println("Nhap danh sach tao can tim: ");
        sc.nextLine();
        String name = sc.nextLine();
        ql.timKiemTheoTen(name);
        System.out.println("Thong tin tao: " +name+ ": ");
        ql.timKiemTheoTen(name);
        

        /* System.out.println("Chon");
        int n = sc.nextInt();

        switch(n)
        {
            case 1: ql.nhapDanhSach(); break;
            case 2: ql.hienThiDanhSach(); break;
            case 3: ql.timKiemTheoTen(mau, dApples); break;
        }*/
    }
}
