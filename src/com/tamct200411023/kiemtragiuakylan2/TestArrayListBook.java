package com.tamct200411023.kiemtragiuakylan2;

import java.util.Scanner;

public class TestArrayListBook {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayListBook ql = new ArrayListBook();
        ql.nhapDanhSach(sc);
        System.out.println("Danh sách vừa nhập la: ");
        ql.hienThiDanhSach();
        System.out.println("Danh sách sau khi sắp xếp là: "); 
        ql.hienThiDanhSach();

        //Nhập sách cần tìm
        System.out.println("Nhập sách cần tìm: ");
        sc.nextLine();
        String name = sc.nextLine();
        ql.timKiem(name);
        System.out.println("Thông tin sach: " +name+ ": ");
        ql.timKiem(name);
    }
}
