package com.tamct2004110023.tuan1;

import java.util.Scanner;

public class phuongTinhBacHai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b, c, x1, x2, delta;
        System.out.println("Nhập a vao: ");
        a = sc.nextDouble();
        System.out.println("Nhập b vao: ");
        b = sc.nextDouble();
        System.out.println("Nhập c vào: ");
        c = sc.nextDouble();

        delta = Math.pow(b, 2) - 4 * a * c;
        if(delta < 0 )
        {
            System.out.println("Phương trình vo nghiệm ");
        }
        else if(delta == 0)
        {
            x1 = -b/(2*a);
            System.out.println("Phương trình có nghiệm kép");
        }
        else if(delta >= 0)
        {
            x1 = (-b + Math.sqrt(delta)) / (2*a);
            x2 = (-b - Math.sqrt(delta)) / (2*a);
            System.out.println("Phương trình có 2 nghiệm phân biệt");
            System.out.println("x1: " +x1);
            System.out.println("x2: " +x2);
        }
    }
}
