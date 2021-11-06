package vn.edu.giadinh.tuan07;

import java.util.Scanner;

public class LinkedList {
    Node head = null;
    Node tail = null;
    Scanner sc = new Scanner(System.in);
    public LinkedList()
    {

    }
    public void nhapThongTin()
    {
        head = null;
        tail = null;
        System.out.println("Nhap so luong tao can nhap: ");
        int n = sc.nextInt();
        for(int i = 0; i < n ;i++)
        {
            System.out.println("Nhap id: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.println("Nhap ten mau: ");
            String tenMau = sc.nextLine();
            System.out.println("Nhap khoi luông: ");
            double khoiLuong = sc.nextDouble(); 
            add(id, tenMau, khoiLuong);
        }
    }
    public void add(int di, String ten, double kl)
    {
        Node newNode = new Node(di, ten, kl);
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
            System.out.println("Danh Sach rong");
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
        System.out.println("Nhâp ma tao muon tim: ");
        int n = sc.nextInt();
        while(current != null)
        {
            if(current.id == n)
            {
                System.out.println("Tao muon tim: ");
                current.inThongTin();
                current = current.next;
            }
        }
    }

    public void timKiemCuoiDS()
    {
        Node current = tail;
        System.out.println("Nhap ma tao muon tim: ");
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
    }

    public void xoaDauDS()
    {
        Node current = head;
        //Node current = tail;
        System.out.println("Tao can xoa: ");
        int n = sc.nextInt();
        while(current != null)
        {
            if(current.next == tail)
            {
                current = tail;
                tail.next = null;
                current = current.next;
            }
        }
    }

    public void xoaCuoiDS()
    {
        Node current = tail;
        System.out.println("Tao can xoa: ");
        int n = sc.nextInt();
        while(current.next == head)
        {
            current = head;
            head.next = null;
            current = current.next;
        }
    }
}
