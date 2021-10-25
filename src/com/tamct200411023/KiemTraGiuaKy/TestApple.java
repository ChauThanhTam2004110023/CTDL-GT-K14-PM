package com.tamct200411023.KiemTraGiuaKy;

import java.util.ArrayList;
import java.util.Scanner;

public class TestApple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayListApple ql = new ArrayListApple();
        System.out.println("1.Nhap");
        System.out.println("2.Hien thi");
        System.out.println("3.Tiem Kiem ");

        System.out.println("Chon");
        int n = sc.nextInt();

        switch(n)
        {
            case 1: ql.nhapDanhSach(); break;
            case 2: ql.hienThiDanhSach(); break;
            case 3: ql.timKiemTheoTen(); break;
        }
    }
}
