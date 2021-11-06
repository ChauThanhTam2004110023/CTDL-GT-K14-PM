package com.tamct200411023.tuan06;

import java.util.Scanner;

public class Apple {
    String tenMau;
    int id;
    double khoiLuong;

    public Apple()
    {

    }

    public Apple(int di, String ten, double kl)
    {
        tenMau = ten;
        id = di;
        khoiLuong = kl;
    }

    public String gettenMau()
    {
        return tenMau;
    }

    public void inThongTin()
    {
        System.out.println("Ten mau: " +tenMau);
        System.out.println("Id: " +id);
        System.out.println("Khoi luong: " +khoiLuong);
    }

    Scanner sc = new Scanner(System.in);
    public void nhapThongTin()
    {
        System.out.println("Ten mau: ");
        tenMau = sc.nextLine();
        System.out.println("Nhap id: ");
        id = sc.nextInt();
        System.out.println("Nhap khoi luong: ");
        khoiLuong = sc.nextDouble();
    }
}
