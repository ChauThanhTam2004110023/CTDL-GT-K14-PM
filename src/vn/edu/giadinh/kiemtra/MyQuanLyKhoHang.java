package vn.edu.giadinh.kiemtra;

import java.util.Scanner;

public class MyQuanLyKhoHang {
    public MyQuanLyKhoHang()
    {

    }
    Node head = null;
    Node tail = null;
    Node current;
    Node previous;
    Scanner sc = new Scanner(System.in);

    void nhapThongTin()
    {
        System.out.println("Nhập tên hàng hóa: ");
        String tenHangHoa = sc.nextLine();
        sc.nextLine();
        System.out.println("Nhập giá nhập: ");
        double giaNhap = sc.nextDouble();
        System.out.println("Nhap số lượng tồn kho: ");
        double soLuongTonKho = sc.nextDouble();
        System.out.println("Ngày nhập kho: ");
        int ngayNhapKho = sc.nextInt();
        add(tenHangHoa, giaNhap, soLuongTonKho, ngayNhapKho);
    }

    void add(String ten, double gia, double sl, int ngay)
    {
        Node newNode = new Node(ten, gia, sl, ngay);
        if(head == null)
        {
            head = newNode;
            tail = newNode;
        }
        else
        {
            tail.next = newNode;
            tail = newNode;
        }
    }

    void inDanhSach()
    {
        current = head;
        if(head == null)
        {
            System.out.println("Danh sách rỗng");
            return;
        }
        while(current != null)
        {
            current.inThongTin();
            System.out.println();
            current = current.next;
        }
    }

    boolean tim(String tenHangHoa)
    {
        current = head;
        boolean result = false;
        while(current != null)
        {
            if(current.tenHangHoa.equals(tenHangHoa))
            {
                result = true;
                return result;
            }
            current = current.next;
        }
        return result;
    }

    void timRoiIn(String tenHangHoa)
    {
        if(true == tim(tenHangHoa))
        {
            current.inThongTin();
        }
        else
        {
            System.out.println("Không có tron danh sách");
        }
    }

    void timDangTruoc()
    {
        previous = head;
        while(previous != null)
        {
            if(previous.next == current)
            {
                return;
            }
            previous = previous.next;
        }
    }
}
