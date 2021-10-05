package com.tamct2004110023.tuan1;

import java.util.Scanner;

public class sinhvien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten vao: ");
        String hoVaTen = sc.nextLine();
        System.out.println("Nhap ma sinh vien vao: ");
        int mssv = sc.nextInt();

        System.out.println("Nhap diem 1 vao: ");
        float diem1 =  sc.nextFloat();
        System.out.println("Nhap diem 2 vao: ");
        float diem2 = sc.nextFloat();
        System.out.println("Nhap diem 3 vao: ");
        float diem3 = sc.nextFloat();

        System.out.println("Ho va ten: " +hoVaTen);
        System.out.println("MSSV: " +mssv);
        System.out.println("Diem 1: " +diem1);
        System.out.println("Diem 2: " +diem2);
        System.out.println("Diem 3: " +diem3);
        float trungBinhCong = (float)(diem1 + diem2 +diem3)/3;
        System.out.println("Diem trung binh ");
        System.out.println(diem1+ "+" +diem2+ "+" +diem3+ "/3" + "=" +trungBinhCong);

    }
}
