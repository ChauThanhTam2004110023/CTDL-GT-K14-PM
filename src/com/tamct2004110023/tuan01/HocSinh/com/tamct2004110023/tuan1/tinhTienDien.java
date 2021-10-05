package com.tamct2004110023.tuan1;

import java.util.Scanner;

public class tinhTienDien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double soDien, tien;
        System.out.println("Nhập số điện vao: ");
        soDien = sc.nextDouble();

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
    }
}
