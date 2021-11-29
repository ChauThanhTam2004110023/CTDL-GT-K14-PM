package vn.edu.giadinh.tuan10;

import java.util.Scanner;

public class Test {
    static MyQuanLyKhoHang ql = new MyQuanLyKhoHang();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        menu();
    }
    static void menu()
    {
        System.out.println("----------MENU----------");
        System.out.println("In danh sach");
        System.out.println("Tim kien danh sach");
        System.out.println("Them danh sach");
        int n = sc.nextInt();
        switch(n)
        {
            //case 1: themHang(); break;
            case 2: inThongTin(); break;
            case 3: tim(); break;
            default:
            {
                System.out.println("Du lieu khong dung");
                nhanEnterDeTiepTuc();
                menu();
                break;
            }
        }
    }
    static void nhanEnterDeTiepTuc()
    {
        System.out.println("Nhan enter de tiep tuc");
        sc.nextLine();
    }
    /* static void nhapThongTin()
    {
        ql.nhapThongTin();
        nhanEnterDeTiepTuc();
        menu();;
    }
    /* static void themHang()
    {
        while(true)
        {
            ql.add(ten, gia, sl, ngay);
            System.out.println("Them Hang (y/n): ");
            if(sc.nextLine().equals("n"))
            {
                break;
            }
        }
        nhanEnterDeTiepTuc();
        menu();
    } */

    static void inThongTin()
    {
        ql.inDS();
        nhanEnterDeTiepTuc();
        menu();
    }
    static void tim()
    {
        System.out.println("Nhap ten hang hoa can tim: ");
        String tenHangHoa = sc.nextLine();
        ql.timXongInthongTin(tenHangHoa);
        nhanEnterDeTiepTuc();
        menu();
    }
}

