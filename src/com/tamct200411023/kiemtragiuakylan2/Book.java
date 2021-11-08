package com.tamct200411023.kiemtragiuakylan2;

import java.util.Scanner;

public class Book {
    Scanner sc = new Scanner(System.in);
    String sach;
    int id;
    double soLuong;

    public Book()
    {

    }

    public String getsach()
    {
        return sach;
    }
    public int getid()
    {
        return id;
    }
    public double getsoLuong()
    {
        return soLuong;
    }

    public Book(String Sach, int di, double SoLuong)
    {
        sach = Sach;
        id = di;
        soLuong = SoLuong;
    }

    public void inThongTin()
    {
        System.out.println("Tên sách: " +sach);
        System.out.println("id: " +id);
        System.out.println("số lượng: " +soLuong);
    }

    public void nhapThongTin()
    {
        System.out.println("Nhập tên sách: ");
        sach = sc.nextLine();
        System.out.println("Nhập id vao: ");
        id = sc.nextInt();
        System.out.println("Nhập số lượng sách: ");
        soLuong = sc.nextDouble();
    }
}
