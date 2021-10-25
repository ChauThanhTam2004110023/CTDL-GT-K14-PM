package com.tamct200411023.KiemTraGiuaKy;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListApple {
    private ArrayList<Apple> list = new ArrayList<Apple>();

    Scanner sc = new Scanner(System.in);
   /* public ArrayListApple()
    {
        dsApple = new ArrayList<>();
    }

    public void themap(Apple ap)
    {
        dsApple.add(ap);
    } */

    public void nhapDanhSach()
    {
        Apple ap;
        System.out.println("Nhap tao: ");
        int n = sc.nextInt();
        System.out.println("Nhap danh sach tao: ");
        for(int i = 0 ; i < n; i++)
        {
            System.out.println("Tao thu: " +(i+1)+ ": ");
            ap = new Apple();
            ap.inThongTin();
        }
    }
    public void hienThiDanhSach()
    {
        for(Apple ap : list)
        {
            ap.inThongTin();
        }
    }

    public void timKiemTheoTen()
    {
       System.out.println("Ten tao can tim: ");
       for(Apple ap: list)
       {
           if(sc.nextLine().equals(ap.mauSac))
           {
               ap.inThongTin();
           }
       }
    }
}
