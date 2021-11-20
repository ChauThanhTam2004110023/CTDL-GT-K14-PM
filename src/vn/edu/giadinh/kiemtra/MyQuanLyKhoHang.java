package vn.edu.giadinh.kiemtra;

import java.util.Scanner;

public class MyQuanLyKhoHang {
    public MyQuanLyKhoHang()
    {
        
    }
    Node head = null;
    Node tail = null;
    Node current = null;
    Node previous = null;
    Scanner sc = new Scanner(System.in);
    Node nhapThongTin()
    {
        System.out.println("Nhập tên hàng hóa: ");
        String tenHangHoa = sc.nextLine();
        sc.nextLine();
        System.out.println("Nhập giá: ");
        double giaNhap = sc.nextDouble();
        System.out.println("Nhập số lượng tồn kho: ");
        double soLuongTonKho = sc.nextDouble();
        System.out.println("Ngày nhập kho: ");
        int ngayNhapKho = sc.nextInt();
        Node node = new Node(tenHangHoa, giaNhap, soLuongTonKho, ngayNhapKho);
        return node;
    }

    void add()
    {
        Node node = nhapThongTin();
        if(head == null)
        {
            head = node;
            tail = node;
        }
        else
        {
            tail.next = node;
            tail = node;
        }
    }

    void inDanhSach()
    {
        Node current = head;
        if(head == null)
        {
            System.out.println("Không có kết quả cần tim");
            return;
        }
        System.out.println("Kết quả cần tìm la: ");
        while(current != null)
        {
            current.inThongTin();
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

    void timXongRoiIn(String tenHangHoa)
    {
        if(true == tim(tenHangHoa))
        {
            current.inThongTin();
        }
        else
        {
            System.out.println("Khong tim thay");
        }
    }

    void timKiemDauDS()
    {
        previous = head;
        while(current != null)
        {
            if(previous.next == current)
            {
                return;
            }
            previous = previous.next;
        }
    }

    void timHangRoiThemVaoDangTruoc(String tenHangHoa)
    {
        if(true == tim(tenHangHoa))
        {
            if(current == head)
            {
                addHead();
            }
            else
            {
                themDangTruoc();
            }
        }
        else
        {
            System.out.println("Không tìm thấy");
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

    void themDangTruoc()
    {
        timDangTruoc();
        Node node = nhapThongTin();
        previous.next = node;
        previous.next.next = current;
    }

    void addHead()
    {
        Node node = nhapThongTin();
        node.next = head;
        head = node;
    }

    /* void timDangTruoc()
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
    } */

    public void xoaDS(String tenHangHoa)
    {
        if(true == tim(tenHangHoa))
        {
            if(current == head)
            {
                xoaDauDS();
            }
            else if(current == tail)
            {
                xoaCuoiDS();
            }
            else
            {
                xoaGiuaDS();
            } 
        }
        else
        {
            System.out.println("Không tìm thấy");
        }
    }

    public void xoaDauDS()
    {
        head = head.next;
    }

    public void xoaCuoiDS()
    {
        current = head;
        while(current != null)
        {
            if(current != null)
            {
                if(current.next == tail)
                {
                    tail = current;
                    current.next = null;
                    return;
                }
                current = current.next;
            }
        }
    }

    public void xoaGiuaDS()
    {
        timDangTruoc();
        current = current.next;
        previous.next = current;
    }

    public void suaDS(String tenHangHoa)
    {
        if(true == tim(tenHangHoa))
        {
            Node node = nhapThongTin();
            current.tenHangHoa = node.tenHangHoa;
        }
        else
        {
            System.out.println("Khong tim thay");
        }
    }
}
