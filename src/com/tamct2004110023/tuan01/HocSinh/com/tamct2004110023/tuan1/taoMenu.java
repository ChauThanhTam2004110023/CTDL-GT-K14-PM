package com.tamct2004110023.tuan1;

import java.util.Scanner;

public class taoMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double soDien, tien;
        int n;
        double a, b, x;
        double a1, b1, c1, x1, x2, delta;
        System.out.println("Nhập từ 1 đến 3: ");
        n = sc.nextInt();

        System.out.println("Nhap so tien dien vao: ");
        soDien = sc.nextDouble();

        System.out.println("Phương trình bậc 1");
        System.out.println("Nhập a vao: ");
        a = sc.nextDouble();
        System.out.println("Nhập b vao: ");
        b = sc.nextDouble();

        System.out.println("Phương trình bậc 2");
        System.out.println("Nhập a vao: ");
        a1 = sc.nextDouble();
        System.out.println("Nhap b vào: ");
        b1 = sc.nextDouble();
        System.out.println("Nhập c vao: ");
        c1 = sc.nextDouble();


        if(a == 0)
        {
            if(b == 0)
            {
                System.out.println("Phương trình vô nghiệm  ");
            }
        }
        else
        {
            x = -b/a;
            System.out.println("Phương trình có nghiệm la: " +x);
        }

        delta = Math.pow(b1, 2) - 4 * a1 * c1;
        if(delta < 0)
        {
            x1 = -b1/(2*a);
            System.out.println("Phương trình có nghiệm kép");
        }
        else if(delta > 0)
        {
            x1 = (-b1 + Math.sqrt(delta)) / (2*a);
            x2 = (-b1 - Math.sqrt(delta)) / (2*a);
            System.out.println("Phương trinh có nghiệm phân biệt");
            System.out.println("x1: " +x1);
            System.out.println("x2: " +x2);
        }

        if(soDien < 50)
        {
            tien = soDien * 1000;
            System.out.println("Số điện nhỏ hơn 50: " +tien);
        }
        else if(soDien > 50)
        {
            tien = 50 * 1000 + (soDien - 50) * 1200;
            System.out.println("Số điện lớn hơn 50: " +tien);
        }

        switch(n)
        {
            case 1: System.out.println("Phương trình bậc nhất là: "); break;
            case 2: System.out.println("Phương trình bậc hai là: "); break;
            case 3: System.out.println("Số tiền điện là: "); break;
            default:
            System.out.println("Nhập dữ liệu sai "); break;
        }
    }
}
