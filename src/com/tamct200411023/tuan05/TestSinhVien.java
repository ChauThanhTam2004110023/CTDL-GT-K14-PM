package com.tamct200411023.tuan05;

import java.util.Scanner;

public class TestSinhVien 
{
    public static void main(String[] args) 
    {
        QuanLySinhVien ql = new QuanLySinhVien();
        Scanner sc = new Scanner(System.in);

        System.out.println("----MENU----");
        System.out.println("1.Nhap danh sach sv");
        System.out.println("2.xuat danh sach sv");
        System.out.println("3.Sap xep");
        System.out.println("4.Xuat ngau nhien sv");
        System.out.println("5.Xoa");
        System.out.println("6.Ket thuc");

        System.out.println("Chon tu 1 den 6");
        int n = sc.nextInt();

        switch(n)
        {
            case 1: ql.nhapThongTin(); break;
            case 2: ql.xuatThongTin(); break;
            case 3: ql.xuatNgauNhien(); break;
            case 4: ql.sapDiemTB(); break;
            case 5: ql.timKiemSV(); break;
            case 6: System.out.println("KET THUC");
            System.exit(0); break;
        }
        System.out.println("Tro lai menu nham a hoac b ");
        sc.nextLine();
        if(sc.nextLine().equals("a,b"));
    }
    
}
