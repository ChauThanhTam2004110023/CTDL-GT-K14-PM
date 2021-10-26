package vn.edu.giadinh.tuan05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class QuanLySinhVien {
    public static void main(String[] args) {
        QuanLySinhVien ql = new QuanLySinhVien();
        ql.menu();
    }

    ArrayList<SinhVien> list = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public void Nhap()
    {
        SinhVien sinhVien = new SinhVien();   
        System.out.println("Nhập số lượng sinh viên: ");
        int n = sc.nextInt();
        while(true)
        {
            for(int i = 0; i < n -1 ; i++)
            {
                sinhVien.nhapThongTin();
                sc.nextLine();
            }
            sc.nextLine();
        }
    }

    public void xuat()
    {
        for(SinhVien sinhVien: list)
        {
            sinhVien.inThongTin();
        }
    }

    public void sapXep()
    {
        System.out.println("Sắp xếp danh sách");
        Collections.sort(list, (a,b) -> (int)(a.getdiemTB() - b.getdiemTB()));
        Collections.reverse(list);
        xuat();
    }

    public void timKiem()
    {
        System.out.println("Nhap ho va ten: ");
        sc.nextLine();
        String hoVaTen = sc.nextLine();
        int n = sc.nextInt();
        String a[] = new String[100];
        sc.nextLine();
        list.indexOf(hoVaTen);
        for(int i = 0; i < n; i++)
        {
            a[i] =sc.nextLine();
        }
        for(int i = 0; i < n; i++)
        {
            System.out.println(a[i]);
        }
        for(int i = 0; i < a.length; i++)
        {
            if(a[i].equals(hoVaTen))
            {
                System.out.println(" " +a[i]);
            }
        }
        xuat();
    }

    public void timVaSua()
    {
        System.out.println("Nhap ho va ten can sua: ");
        String hovaten = sc.nextLine();
        for(SinhVien sv: list)
        {
            sv.inThongTin();
        }
    }

    public void menu()
    {
        System.out.println("_-------MENU---------");
        System.out.println("1. Nhap sinh vien");
        System.out.println("2. Xuat sinh vien");
        System.out.println("3. Xuat danh sach theo diem");
        System.out.println("4. Tim kiem thoe ten");
        System.out.println("5. Tim va sua");
        System.out.println("6. Ket thuc");
        System.out.println("Vui long chon chuc nang: ");
        int n = sc.nextInt();

        switch(n)
        {
            case 1: Nhap(); break;
            case 2: xuat(); break;
            case 3: sapXep(); break;
            case 4: timKiem(); break;
            case 5: timVaSua(); break;
            case 6: System.exit(0);
            default: System.out.println("Nhap sai!!");
        }
        while(true);
    }
}
