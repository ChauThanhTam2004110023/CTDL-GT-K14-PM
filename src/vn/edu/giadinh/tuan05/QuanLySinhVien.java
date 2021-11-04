package vn.edu.giadinh.tuan05;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLySinhVien {
    static ArrayList<SinhVien> dssv = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    static void themSV(SinhVien sv)
    {
        dssv.add(sv);
    }
    static void nhapDanhSach(Scanner sc)
    {
        SinhVien sv;
        System.out.println("Nhap so luong sinh vien vao");
        int n = sc.nextInt();
        System.out.println("Nhap danh sach sinh vien: ");
        for(int i = 0; i < n; i++)
        {
            System.out.println("Sinh vien thu" +i+1+ ":");
            sv = new SinhVien();
            sv.nhapThongTin();
            themSV(sv);
        }
    }
    static void hienThiDanhSach()
    {
        for(SinhVien sv : dssv)
        {
            sv.inThongTin();
        }
    }

    static void timKiem(String name)
    {
        for(SinhVien sv : dssv)
        {
            if(name.equals(sv.gettenSinhVien()));
            {
                sv.inThongTin();
            }
        }
    }

}
