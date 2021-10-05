package com.tamct2004110023.tuan1;

import java.util.Scanner;

public class theTichKhoiLapPhuong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double canh;
        System.out.println("Nhap so canh vao: ");
        canh = sc.nextDouble();
        
        System.out.println("Thể tích khối lập phương ");
        double theTich = (double)(canh * canh * canh);
        System.out.println(canh+ "*" +canh+ "*" +canh +"="+ theTich);
    }
}
