package com.tamct200411023.tuan05;

import java.util.ArrayList;
import java.util.Scanner;

public class tongArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        double number;
        ArrayList<Double> arDoubles = new ArrayList<>();
        System.out.println("Nhap phan tu arraylist vao: ");
        n = sc.nextInt();
        for(int i = 0 ; i < n; i++)
        {
            System.out.println("Phan tu thu: " +i+ ": ");
            number = sc.nextDouble();
            arDoubles.add(number);
        }
        double tong = 0;
        for(double newElement : arDoubles)
        {
            tong = tong + newElement;
        }
        System.out.println("Tong cac phan tu: " +tong);

        
    }
}
