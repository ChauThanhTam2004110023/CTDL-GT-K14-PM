package WEEK2;

import java.util.Scanner;

public class taoMenu 
{
	public static void main(String[] args) 
    {
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
    }
}
