package vn.edu.giadinh.tuan07;

import java.util.Scanner;

public class Node {
    //Noi dung
    Node data;
    //int data;
    int id;
    String tenMau;
    double khoiLuong; 
    //lien ket den node tiep theo
    Node next;
    public Node()
    {
        
    }

    public Node(Node d)
    {
        data = d;
        next = null;
    }

    public Node(int di, String ten, double kl)
    {
        id = di;
        tenMau = ten;
        khoiLuong = kl; 
    }
    public Node(Node d, Node n)
    {
        data = d;
        next = n;
    }

     public void inThongTin()
    {
        System.out.println("\tNhap id: " +id);
        System.out.println("\tNhap mau: " +tenMau);
        System.out.println("\tNhap khoi luong: " +khoiLuong);
    }
    Scanner sc = new Scanner(System.in);

    public void nhapThongTin()
    {
        System.out.println("Mau sac: ");
        id = sc.nextInt();
        //sc.nextLine();
        System.out.println("Id: ");
        tenMau = sc.nextLine();
        System.out.println("Khoi luong: ");
        khoiLuong = sc.nextDouble();
    } 
}
