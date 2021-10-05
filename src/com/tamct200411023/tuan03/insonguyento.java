package com.tamct200411023.tuan03;

import java.util.Scanner;

public class insonguyento {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
       int dem = 0;
       System.out.println("Nhập n vào: ");
       n = sc.nextInt();
       for(int i = 1; i <= n; i++)
       {
           if(n%i == 0)

           {
               dem++;
           }
       }
       if(dem == 2)
       {
           System.out.println("la so nguyen to");
       }
       else
       {
           System.out.println("Khong phai la so nguyen to");
       }
    }
}
