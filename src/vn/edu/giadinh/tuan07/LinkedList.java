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
            add();
        }
    }
    public void add()
    {
        Node newNode = new Node();
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
}
