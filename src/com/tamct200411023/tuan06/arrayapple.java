package com.tamct200411023.tuan06;

import java.util.ArrayList;
import java.util.Scanner;

public class arrayapple {
    static ArrayList<Apple> list = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    static void themSV(Apple  apple)
    {
        list.add(apple);
    }

    static void nhap(Scanner sc)
    {
        Apple apple;
        System.out.println("Nhap so luong can nhap: ");
        int n = sc.nextInt();
        System.out.println("Nhap danh sach tao");
        for(int i = 0; i < n; i++)
        {
            System.out.println("Tao thu" +i+1+ ": ");
            apple = new Apple();
            apple.nhapThongTin();
            themSV(apple);
        }
    }

    static void xuat()
    {
        for(Apple apple: list)
        {
            apple.inThongTin();
        }
    }

    static void timKiem(String ma)
    {
        for(Apple apple: list)
        {
            if(ma.equals(apple.gettenMau()));
            {
                apple.inThongTin();
            }
        }
    }
}
