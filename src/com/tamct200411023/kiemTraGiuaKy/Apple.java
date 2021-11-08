package com.tamct200411023.kiemTraGiuaKy;

import java.util.Scanner;

public class Apple {
    Scanner sc = new Scanner(System.in);
    Node data;
    Node next;
    
    int id;
    String mauSac;
    double khoiLuong;

    public Apple()
    {

    }

    public Apple(int ID, String mau, Double kl)
    {
        this.id = ID;
        this.mauSac = mau;
        this.khoiLuong = kl;
    }

    public int getid()
    {
        return id;
    }
    public String getmauSac()
    {
        return mauSac;
    }

    public double khoiLuong()
    {
        return khoiLuong;
    } 

    public void inThongTin()
    {
        System.out.println("\tNhap id: " +id);
        System.out.println("\tNhap mau: " +mauSac);
        System.out.println("\tNhap khoi luong: " +khoiLuong);
    }

    public void nhapThongTin()
    {
        System.out.println("Mau sac: ");
        mauSac = sc.nextLine();
        System.out.println("Id: ");
        id = sc.nextInt();
        System.out.println("Khoi luong: ");
        khoiLuong = sc.nextDouble();
    }

    /* public boolean equals(Apple other)
    {
        boolean match = true;
        if(mauSac.equals(other.mauSac))
        {
            match = true;
        }
        else
        {
            match = false;
        }
        return match;
    } */
}
