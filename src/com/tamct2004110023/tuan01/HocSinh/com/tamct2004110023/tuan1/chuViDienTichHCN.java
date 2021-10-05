package com.tamct2004110023.tuan1;

import java.util.Scanner;

public class chuViDienTichHCN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float chieuDai, chieuRong;
        double a, b;
        System.out.println("Nhap chieu dai: "); 
        chieuDai = sc.nextFloat();
        System.out.println("Nhap chieu rong: ");
        chieuRong = sc.nextFloat();

        System.out.println("Nhap a vao: ");
        a = sc.nextDouble();
        System.out.println("Nhap b vao: ");
        b = sc.nextDouble();

        //Hàm Math
        System.out.println("Min(a,b): " +Math.min(a,b));
        System.out.println("Max(a,b): " +Math.max(a,b));

        System.out.println("Chieu dai: ");
        System.out.println("Chieu rong: ");
        System.out.println("Chu vi hinh chữ nhật ");
        float chuVi = (float)(chieuDai + chieuRong)*2;
        System.out.println(chieuDai+ "+" +chieuRong+ "*2"+ "=" +chuVi);
        System.out.println("Diện tích hình chữ nhật ");
        float dienTich = (float)(chieuDai * chieuRong);
        System.out.println(chieuDai+ "*" +chieuRong+ "=" +dienTich);
    }
}
