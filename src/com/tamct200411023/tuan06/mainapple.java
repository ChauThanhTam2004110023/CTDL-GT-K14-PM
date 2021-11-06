package com.tamct200411023.tuan06;

import java.util.Scanner;

public class mainapple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        arrayapple ap = new arrayapple();
        ap.nhap(sc);
        System.out.println("Danh tao vua nhap la: ");
        ap.xuat();
        System.out.println("Danh sach sinh vien sau khi sap xep: ");
        ap.xuat();

        //Nhap can tim
        System.out.println("Nhap tao can tim: ");
        sc.nextLine();
        String ma = sc.nextLine();
        ap.timKiem(ma);
        System.out.println("Thong tin tao: " +ma+ " : ");
        ap.timKiem(ma);
    }
}
