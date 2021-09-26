package WEEK2;

import java.util.Scanner;

public class namSinhNamTuoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int namSinh, namTuoi;
        System.out.println("Nhap nam sinh vao: ");
        namSinh = sc.nextInt();
        System.out.println("Nhap nam tuoi vao: ");
        namTuoi = sc.nextInt();
        int tuoi = namTuoi - namSinh;
        System.out.println(namTuoi+ "-" +namSinh+ "=" +tuoi);
    }
}
