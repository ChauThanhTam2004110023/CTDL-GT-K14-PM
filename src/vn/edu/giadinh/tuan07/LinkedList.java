package vn.edu.giadinh.tuan07;

import java.util.Scanner;

public class LinkedList {
    Node head = null;
    Node tail = null;
    Node current = null;
    Scanner sc = new Scanner(System.in);
    public LinkedList()
    {

    }
    public void nhapThongTin()
    {
        
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
         current = head;
        if(head == null)
        {
            System.out.println("Danh Sach rong");
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
        System.out.println("Nhâp ma tao muon tim");
        int n = sc.nextInt();
        while(current != null)
        {
            if(current.id == n)
            {
                System.out.println("Tao muon tim: ");
                current.inThongTin();
                sc.nextLine();
            }
            current = current.next;
        }
        System.out.println();
    }

    public void xoaDauDS() //3 Node
    {
       head=head.next;
    }
    void xoaDuoiDS()
    {
        current = head;
        while(current!=null)
        {   
            if(current.next == tail)
            {
                return;
            }
           current = current.next;
        }
        tail = current;
        current.next = null;
    }
    
}
