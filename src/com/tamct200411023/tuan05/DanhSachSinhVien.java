package com.tamct200411023.tuan05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class DanhSachSinhVien 
{
    static Scanner sc = new Scanner(System.in);
    static ArrayList<SinhVien> list = new ArrayList<>();
    public static void main(String[] args) 
    {
        int n;
        do
        {
            System.out.println("MENU");
            System.out.println("1. Nhap thong tin sinh vien ");
            System.out.println("2. Xuat thong tin sinh vien ");
            System.out.println("3. Xuat danh sach sinh vien theo khoang diem tb");
            System.out.println("4. Tim va sua ");
            System.out.println("5. Tim va xoa ");
            System.out.println("6. Ket thuc");
            n = sc.nextInt();
            switch(n)
            {
                case 1: nhap(); break;
                case 2: xuat(); break;
                case 3: sapxeptheodiemtb();break;
                case 4: timvasua(); break;
                case 5: timvaxoa(); break;
                default: 
                System.out.println("Du lieu khong dung!"); break;
            }
        }while(true);
    }
    static void nhap()
    {
        System.out.println("Nhap so luong sinh vien vao: ");
        int n = sc.nextInt();
        while(true)
        {
            for(int i = 0; i <= n-1 ;i++)
            {
               System.out.println("-----Nhap sinh vien-----");
               SinhVien sv = new SinhVien();
               sv.nhapThongTin();
            }
            if(sc.nextLine().isEmpty())
            { 
            break; 
            }
            sc.nextLine();
        }
    }

    static void xuat()
    {
        int i = 1;
        for(SinhVien sv: list)
        {
            System.out.println("Sinh vieen thu: " +i+ " : ");
            sv.inThongTin();
            i++;
        }
    } 

    static void sapxeptheodiemtb()
    {
        /* System.out.println("Nhap diem max: ");
        double max = sc.nextDouble();
        System.out.println("nhap diem min: ");
        double min = sc.nextDouble();
        System.out.println("Danh sach sap xep: " +min+ " : " +max+ " : ");
        for(SinhVien x: list)
        {
            if(x.diemTB <= max && x.diemTB >= min)
            {
                x.inThongTin();
            }
        } */

        Collections.sort(list, (a ,b) -> (int)(a.getdiemTB() - b.getdiemTB()));
        Collections.reverse(list);
        xuat();
    }

    static void timvasua()
    {
        System.out.println("Nhap sinh vien can sua: ");
        String hoVaTen = sc.nextLine();
        String hovaten = sc.nextLine();
        for(SinhVien x: list)
        {
            if(x.hoVaTen.contains(hovaten))
            {
                System.out.println("Nhap moi: ");
                x.diemTB = sc.nextDouble();
                System.out.println("Sau khi sua ");
                x.inThongTin();
            }
        }
    }

    static void timvaxoa()
    {
        System.out.println("Nhap ten can xoa: ");
        sc.nextLine();
        String hovaten = sc.nextLine();
        for(SinhVien x: list)
        {
            if(x.hoVaTen.equals(hovaten))
            {
                list.remove(x);
                System.out.println("Da xoa thanh cong ");
                break;
            }
        }
    }
}
