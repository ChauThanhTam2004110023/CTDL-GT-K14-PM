package comChauThanhTam2004110023;

import java.util.Scanner;

public class MangSinhVien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SinhVien[] MangSinhVien = new SinhVien[10];
        System.out.println("Nhap danh sach sinh vien: ");
        for(int i=0; i < MangSinhVien.length; i++)
        {
            System.out.println("Nhap ten sinh vien: ");
            String tenSinhVien = sc.nextLine();
            System.out.println("Nhap tuoi vao: ");
            int tuoi = sc.nextInt();
            System.out.println("Nhap mssv: ");
            int mssv = sc.nextInt();
            System.out.println("Nhap que quan vao: ");
            String queQuan = sc.nextLine();

            for(SinhVien sinhvien: MangSinhVien)
            {
                sinhvien.inThongTin();
            }
        }
    }
}
