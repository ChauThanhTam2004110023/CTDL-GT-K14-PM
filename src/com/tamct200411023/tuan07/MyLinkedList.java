package com.tamct200411023.tuan07;

import java.util.Scanner;

public class MyLinkedList {
    Node head = null;
    Node tail = null;
    Scanner sc = new Scanner(System.in);
    
    public MyLinkedList()
    {

    }

    public void nhapDanhSach()
    {
        head = null;
        tail = null;
        System.out.println("Nhap so luong can nhap: ");
        int n = sc.nextInt();
        for(int i = 0; i < n; i++)
        {
            System.out.println("Nhap ten mau: ");
            String tenMau = sc.nextLine();
            sc.nextLine();
            System.out.println("Nhap id: ");
            int id = sc.nextInt();
            System.out.println("Nhap khoi luong: ");
            double khoiLuong = sc.nextDouble();
            xuatDanhSach(tenMau, id, khoiLuong);
        }
    }

    public void xuatDanhSach(String ten, int di, double kl)
    {
        Node newNode = new Node(ten, di, kl);
        if(head == null)
        {
            head = newNode;
            tail = newNode;
        }
        else
        {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void inDanhSach()
    {
        Node current = head;
        if(head == null)
        {
            System.out.println("Danh sach rông");
        }
        while(current != null)
        {
            current.inThongTin();
            current = current.next;
        }
    }

    public void timKiemDauDS()
    {
        Node current = head;
        System.out.println("Nhap id muon tin la: ");
        int n = sc.nextInt();
        while(current != null)
        {
            if(current.id == n)
            {
                System.out.println("Tao muon tim la: ");
                current.inThongTin();
                current = current.next;
            }
        }
        sc.nextLine();
    }

    public void xoaDauDS()
    {
        Node current = head;
        System.out.println("Tao can xoa: ");
        String n = sc.nextLine();
        while(current.next == tail)
        {
            current = tail;
            tail.next = null;
            current = current.next;
        }
    }
}
