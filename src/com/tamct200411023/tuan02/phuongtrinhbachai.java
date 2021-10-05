package com.tamct200411023.tuan02;

import java.util.Scanner;

public class phuongtrinhbachai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b, c, x1, x2, delta;
        System.out.println("Nhap a vao: ");
        a = sc.nextDouble();
        System.out.println("Nhap b vao: ");
        b = sc.nextDouble();
        System.out.println("Nhap c vao: ");
        c = sc.nextDouble();

        delta = Math.pow(b, 2) - 4 * a * c;
        if(delta < 0)
        {
            System.out.println("Phuong trinh vo nghiem");
        }

        else if(delta == 0)
        {
            x1 = -b/(2*a);
            System.out.println("Phuong trinh co nghiem kep");
        }

        else if(delta >= 0)
        {
            x1 = (-b + Math.sqrt(delta)) / (2*a);
            x2 = (-b - Math.sqrt(delta)) / (2*a);
            System.out.println("Phuong trinh co 2 nghiem phan biet");
            System.out.println("x1 = " +x1);
            System.out.println("x2 = " +x2);
        }
    }
}
