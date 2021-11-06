package com.tamct200411023.tuan07;

import java.util.Scanner;

public class Node {
    //Nội dung
    Node data;
    
    String tenMau;
    int id;
    double khoiLuong;
    
    //Liên kết đến Node tiếp theo
    Node next;

    public Node()
    {

    }

    public Node(Node d)
    {
        data= d;
        next = null;
    }

    public Node(String ten, int di, double kl)
    {
        tenMau = ten;
        id = di;
        khoiLuong = kl;
    }

    public Node (Node d, Node n)
    {
        data = d;
        next = n;
    }
    public void inThongTin()
    {
        System.out.println("Ten mau: " +tenMau);
        System.out.println("Id: " +id);
        System.out.println("Khoi luong: " +khoiLuong);
    }

    Scanner sc = new Scanner(System.in);

    /* public void nhapThongTin()
    {
        System.out.println("Mau sac: ");
        tenMau = sc.nextLine();
        System.out.println("Nhap id: ");
        id = sc.nextInt();
        System.out.println("Nhap khoi luong: ");
        khoiLuong = sc.nextDouble();
    } */

}
