package com.tamct200411023.kiemtragiuakylan2;

import java.util.Scanner;

public class Node {
    String sach;
    int id;
    double soLuong;
    Node next;

    public Node()
    {

    }

    public Node(int di, String tensach, double sl)
    {
        id = di;
        sach = tensach;
        soLuong = sl;
    }

    public void inThongTin()
    {
        System.out.println("Sách: " +sach);
        System.out.println("Id: " +id);
        System.out.println("Số lượng: " +soLuong);
    }

    Scanner sc = new Scanner(System.in);

    public void nhapThongTin()
    {
        System.out.println("Nhap sách: ");
        sach = sc.nextLine();
        System.out.println("Nhập id: ");
        id = sc.nextInt();
        System.out.println("Nhập số lượng: ");
        soLuong = sc.nextDouble();
    } 
}
