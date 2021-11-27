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
        System.out.println("1.Them hang vao danh sách");
        System.out.println("2.In danh sach");
        System.out.println("3.Tìm kiếm đầu danh sách");
        System.out.println("4.Thêm vào đầu danh sách");
        System.out.println("5.Xóa hàng");
        System.out.println("6.Sửa hàng");
        System.out.println("7.Tăng dần");
        System.out.println("8.Giảm dần");
        int n = sc.nextInt();
        switch(n)
        {
            case 1: themHang(); break;
            case 2: inThongTin(); break;
            case 3: tim(); break;
            case 4: themDangTruoc(); break;
            case 5: xoaDS(); break;
            case 6: suaDS(); break;
            case 7: tangDan(); break;
            case 8: giamDan(); break;
            default: 
            {
                System.out.println("Du lieu khong dung");
                nhanEnterDeTiepTuc();
                menu(); break;
            }
        }
    }
    static void nhanEnterDeTiepTuc()
    {
        System.out.println("Nhan enter de tiep tuc");
        sc.nextLine();
    }
    static void nhapThongTin()
    {
        ql.nhapThongTin();
        nhanEnterDeTiepTuc(); 
        menu();
    }
    static void themHang()
    {
        while(true)
        {
            ql.add();
            System.out.println("Them hang (y/n): ");
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
        ql.inDS();
        nhanEnterDeTiepTuc();
        menu();
    }
    static void tim()
    {
        System.out.println("Nhap ten hang can tim: ");
        String tenHangHoa = sc.nextLine();
        ql.timXongInthongTin(tenHangHoa);
        nhanEnterDeTiepTuc();
        menu();
    }
    static void themDangTruoc()
    {
        System.out.println("Nhap ten hang can them: ");
        String tenHangHoa = sc.nextLine();
        ql.timRoiThemVaoDangTruoc(tenHangHoa);
        nhanEnterDeTiepTuc();
        menu();
    }
    static void xoaDS()
    {
        System.out.println("Nhập tên hàng cần xóa: ");
        String tenHangHoa = sc.nextLine();
        ql.xoaDS(tenHangHoa);
        nhanEnterDeTiepTuc();
        menu();
    }
    static void suaDS()
    {
        System.out.println("Nhập hàng cần sửa: ");
        String tenHangHoa = sc.nextLine();
        ql.suaDS(tenHangHoa);
        nhanEnterDeTiepTuc();
        menu();
    }

    static void tangDan()
    {
        ql.tangDan();
        nhanEnterDeTiepTuc();
        menu();
    }
    static void giamDan()
    {
        ql.giamDan();
        nhanEnterDeTiepTuc();
        menu();
    }
}

