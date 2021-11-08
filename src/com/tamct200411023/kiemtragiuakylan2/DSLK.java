package com.tamct200411023.kiemtragiuakylan2;

import java.util.Scanner;

public class DSLK {
    Node head = null;
    Node tail = null;
    Node current = null;
    Scanner sc = new Scanner(System.in);
    public DSLK()
    {

    }

    public void nhapThongTin()
    {
        System.out.println("Nhập số lượng cần nhập: ");
        int n = sc.nextInt();
        for(int i = 0; i < n; i++)
        {
            System.out.println("Nhap sách: ");
            String sach = sc.nextLine();
            sc.nextLine();
            System.out.println("Nhập id: ");
            int id = sc.nextInt();
            System.out.println("Nhập số lượng: ");
            double soLuong = sc.nextDouble();
            add(id, sach, soLuong);
        }
    }

    public void add(int di, String tensach, double sl)
    {
        Node newNode = new Node(di, tensach, sl);
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
        current = head;
        if(head == null)
        {
            System.out.println("Danh sach rong");
            return;
        }
        while(current != null)
        {
            current.inThongTin();
            System.out.println();
            current = current.next;
        }
    }
    public void tim()
    {
        current = head;
        if(head == null)
        {
            System.out.println("Danh sach rong");
            return;
        }
        while(current != null)
        {
            current.inThongTin();
            current = current.next;
        }
        System.out.println();
    }

    public void timKiemDauDS()
    {
        current = head;
        System.out.println("Nhap id muon tim");
        int n = sc.nextInt();
        while(current != null)
        {
            if(current.id == n)
            {
                System.out.println("Sách muốn tim: ");
                current.inThongTin();
                sc.nextLine();
            }
            current = current.next;
        }
        System.out.println();
    }

    public void xoaDauDS()
    {
        head = head.next;
    }

    public void xoaCuoiDS()
    {
        current = head;
        while(current != null)
        {
            if(current.next == tail)
            {
                tail = current;
                current.next = null;
            }
            current = current.next;
        }
    }

}
