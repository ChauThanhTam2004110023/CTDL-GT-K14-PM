package vn.edu.giadinh.tuan05;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QuanLySinhVien ql = new QuanLySinhVien();
        ql.nhapDanhSach(sc);
        System.out.println("Danh sach sinh vien vua nhap la: ");
        ql.hienThiDanhSach();
        System.out.println("Danh sach sinh vien sau khi sap xep: ");
        ql.hienThiDanhSach();

        //Nhap sinh vien can tim kiem
        System.out.println("Nhap sinh vien can tim ");
        sc.nextLine();
        String name = sc.nextLine();
        ql.timKiem(name);
        System.out.println("Thong tin sinh vien: " +name+ ": ");
        ql.timKiem(name); 

        /* System.out.println("----Menu-----");
        System.out.println("Nhap Danh Sach");
        System.out.println("In danh sach");
        System.out.println("Tim");
        System.out.println("Tim kiem dau danh sach");
        System.out.println("Xoa cuoi danh sach");
        String n = sc.nextLine(); */
    }
}

