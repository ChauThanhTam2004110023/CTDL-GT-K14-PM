package WEEK2;

import java.util.Scanner;

public class tinhTienDien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double soDien, tien;
        System.out.println("Nhap so dien vao: ");
        soDien = sc.nextDouble();

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
