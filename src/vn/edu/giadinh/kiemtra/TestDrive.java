package vn.edu.giadinh.kiemtra;

import java.util.Scanner;

public class TestDrive {
    static MyQuanLyKhoHang ql = new MyQuanLyKhoHang();
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        menu();
    }

    static void menu()
    {
        System.out.println("----------MENU----------");
        System.out.println("Nhập thông tin");
        System.out.println("In danh sách");
        System.out.println("Tìm");
        int n = sc.nextInt();
        switch(n)
        {
            case 1: themHang(); break;
            case 2: inThongTin(); break;
            case 3: tim(); break;
        }
    }

    static void nhanEnterDeTiepTuc()
    {
        System.out.println("Nhấn enter để tiếp tục");
        sc.nextLine();
    }
    static void themHang()
    {
        while(true)
        {
            ql.nhapThongTin();
            System.out.println("Thêm hàng (Y/N): ");
            if(sc.nextLine().equals("n"))
            {
                break;
            }
        }
        nhanEnterDeTiepTuc();
        menu();
    }
    static void inThongTin()
    {
        ql.inDanhSach();
        nhanEnterDeTiepTuc();
        menu();
    }
    static void tim()
    {
        System.out.println("Nhập tên hàng cần tìm: ");
        String tenHangHoa = sc.nextLine();
        ql.timRoiIn(tenHangHoa);
        nhanEnterDeTiepTuc();
        menu();
    }
}
