package com.tamct200411023.tuan01;

import java.util.Scanner;

public class chividientichhcn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float chieuDai, chieuRong;
        double a, b;
        System.out.println("Nhap n chieu dai: ");
        chieuDai = sc.nextFloat();
        System.out.println("Nhap n chieu rong: ");
        chieuRong = sc.nextFloat();

        System.out.println("Nhap a vao: ");
        a = sc.nextDouble();
        System.out.println("Nhap b vao: ");
        b = sc.nextDouble();
        //Ham Math
        System.out.println("Min(a,b): " +Math.min(a,b));
        System.out.println("Max(a,b): " +Math.max(a,b));

        //ChuVi & DienTich
        System.out.println("Chieu dai a: ");
        System.out.println("Chieu rong b: ");
        System.out.println("Chu vi hinh chu nhat :");
        float chuVi = (float)(chieuDai * chieuRong)*2;
        System.out.println(chieuDai+ "*" +chieuRong+ "*2" +"=" +chuVi);
        System.out.println("Dien tich hinh chu nhat la: ");
        float dienTich = (float)(chieuDai * chieuRong);
        System.out.println(chieuDai+ "*" +chieuRong+ "=" +dienTich);
    }
}
