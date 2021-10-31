package com.tamct200411023.kiemTraGiuaKy;

import java.util.ArrayList;
import java.util.Scanner;



public class ArrayListApple {
    private ArrayList<Apple> list = new ArrayList<>();

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
        while(true)
        {
        for(int i = 0 ; i < n; i++)
        {
            System.out.println("Tao thu: " +(i+1)+ ": ");
            ap = new Apple();
            ap.inThongTin();
            list.add(ap);
        }
    }
}
    public void hienThiDanhSach()
    {
        for(Apple ap : list)
        {
            ap.inThongTin();
        }
    }


    public static Apple timKiemTheoTen(String mau, ArrayList<Apple> dApples)
    {
        Apple result = null;
        for(Apple apple: dApples)
        {
            if(apple.mauSac.equals(mau))
            {
                result = apple;
            }
        }
        return result;
    }
}
