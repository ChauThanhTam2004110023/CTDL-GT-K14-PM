package com.tamct200411023.tuan05;

import java.util.Scanner;

public class SinhVien {
    String hoVaTen;
    double diemTB;
    Scanner sc = new Scanner(System.in);

    SinhVien() {
        
    }

    public SinhVien(String hovaten, double diemtb)
    {
        hoVaTen = hovaten;
        diemTB = diemtb;
    }

    public void inThongTin()
    {
        System.out.println("Ho va ten: " +hoVaTen);
        System.out.println("Diem tb: " +diemTB);
    }

    public void nhapThongTin()
    {
        System.out.println("Nhap ho va ten: ");
        hoVaTen = sc.nextLine();
        System.out.println("Nhap diem trung binh: ");
        diemTB = sc.nextDouble();
    }

    public void xuatThongTin(){
        
    }
}
