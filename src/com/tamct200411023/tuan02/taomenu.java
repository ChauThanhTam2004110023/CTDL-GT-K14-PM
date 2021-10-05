package com.tamct200411023.tuan02;

import java.util.Scanner;

public class taomenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double soDien, tien;
		int n;
		double a,b,x;
		double a1, b1, c1, x1, x2, delta;
		System.out.println("Nhap tu 1 den 3: ");
		n = sc.nextInt();
		System.out.println("Nhap so tien dien vao: ");
		soDien = sc.nextDouble();
		
		System.out.println("Phuong trinh bac nhat!");
		System.out.println("Nhap a vao: ");
		a = sc.nextDouble();
		System.out.println("Nhap b vao: ");
		b = sc.nextDouble();
		
		System.out.println("Phuong trinh bac hai!");
		System.out.println("Nhap a vao: ");
		a1 = sc.nextDouble();
		System.out.println("Nhap b vao: ");
		b1 = sc.nextDouble();
		System.out.println("Nhap c vao: ");
		c1 = sc.nextDouble();

        //Phuong trinh bac nhat
        if(a == 0)
        {
            if(b == 0)
            {
                System.out.println("Phuong trinh vo so nghiem");
            }
            else
            {
                System.out.println("Phuong trinh vo nghiem");
            }
        }
        else
        {
            x = -b/a;
            System.out.println("Phuong trinh co nghiem la: x" +x);
        }
		
        //Phuong trinh bac hai
        delta = Math.pow(b, 2) - 4 * a1 * c1;
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
            x1 = (-b + Math.sqrt(delta)) / (2*a1);
            x2 = (-b - Math.sqrt(delta)) / (2*a1);
            System.out.println("Phuong trinh co 2 nghiem phan biet");
            System.out.println("x1 = " +x1);
            System.out.println("x2 = " +x2);
        }

        //Tinh so dien
        if(soDien < 50)
        {
            tien = soDien * 1000;
            System.out.println("So tien dien nho hon 50: " +tien);
        }
        else
        {
            tien = 50 * 1000 + (soDien - 50) * 1200;
            System.out.println("So tien dien lon hon 50: " +tien);
        }

        switch(n)
        {
            case 1: System.out.println("Phuong trinh bac nhat "); break;
            case 2: System.out.println("Phuong trinh bac hai "); break;
            case 3: System.out.println("So tien dien la: "); break;
            default: 
            System.out.println("Nhap du lieu sai "); break;
        }
    }
}
