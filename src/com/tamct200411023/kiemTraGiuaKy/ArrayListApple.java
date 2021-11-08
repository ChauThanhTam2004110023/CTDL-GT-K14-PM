package com.tamct200411023.kiemTraGiuaKy;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListApple {
    static ArrayList<Apple> list = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    static void themAp(Apple apple)
    {
        list.add(apple);
    }

    static void nhapDanhSach(Scanner sc)
    {
        Apple apple;
        System.out.println("Nhap so luong tao can nhap: ");
        int n = sc.nextInt();
        for(int i = 0; i < n; i++)
        {
            System.out.println("Tao thu: " +i+1+ ": ");
            apple = new Apple();
            apple.nhapThongTin();
            themAp(apple);
        }
    }

    static void hienThiDanhSach()
    {
        for(Apple apple: list)
        {
            apple.inThongTin();
        }
    }

    static void timKiemTheoTen(String name)
    {
        for(Apple apple: list)
        {
            if(name.equals(apple.getmauSac()));
            {
                apple.inThongTin();
            }
        }
    }
}
