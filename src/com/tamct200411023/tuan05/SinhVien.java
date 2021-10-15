package com.tamct200411023.tuan05;

import java.util.Scanner;

public class SinhVien {
    String hoVaTen;
    double diemTB;

    public void SinhVien(String hovaten, double diemtb)
    {
        hoVaTen = hovaten;
        diemTB = diemtb;
    }

    public String gethoVaTen()
    {
        return hoVaTen;
    }
    public void sethoVaTen(String hovaten)
    {
        this.hoVaTen = hovaten;
    }

    public double getdiemTB()
    {
        return diemTB;
    }
    public void setdiemTB(double diemtb)
    {
        this.diemTB = diemtb;
    }

    void inThongTin()
    {
        System.out.println("Ho va ten: " +hoVaTen);
        System.out.println("Diem tb: " +diemTB);
    }

    Scanner sc = new Scanner(System.in);
    
    void nhapThongTin()
    {
        System.out.println("Nhap ho va ten: ");
        hoVaTen = sc.nextLine();
        System.out.println("Nhap diem tb: ");
        diemTB = sc.nextDouble();
    }

    
}
