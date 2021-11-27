package vn.edu.giadinh.kiemtra;

import java.util.Scanner;

public class MyQuanLyKhoHang {
    public MyQuanLyKhoHang()
    {
       add("Vang", 10, 10, 2020);
       add("Tim", 20, 20, 2021);
       add("sen", 30, 30, 2022);
    }

  
    Node head = null;
    Node tail = null;
    Node current = null;
    Node previous;
    Node snap;
    Node full;
    Node temp;
    Scanner sc = new Scanner(System.in);

    Node nhapThongTin()
    {
        System.out.println("Nhập tên hàng hóa: ");
        String tenHangHoa = sc.nextLine();
        sc.nextLine();
        System.out.println("Nhập giá nhập: ");
        int giaNhap = sc.nextInt();
        System.out.println("Nhap số lượng tồn kho: ");
        int soLuongTonKho = sc.nextInt();
        System.out.println("Ngày nhập kho: ");
        int ngayNhapKho = sc.nextInt();
        Node node = new Node(tenHangHoa, giaNhap, soLuongTonKho, ngayNhapKho); 
        return node;
    } 

    void add()
    {
        Node newNode = nhapThongTin();
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

    /* Node nhap()
    {
        Node node = new Node("vang", 10, 10, 2020);
        Node node1 = new Node("trang", 20, 20, 2021);
        Node node2 = new Node("tim", 30, 30, 2022);
        Node node3 = new Node("den", 40, 40, 2023);
        Node node4 = new Node("sen", 50, 50, 2024);
        return node;
    } */

    void add(String ten, int gia, int sl, int ngay)
    {
        Node node = new Node(ten, gia, sl, ngay);
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

    void inDS()
    {
        Node current = head;
        if(head == null)
        {
            System.out.println("Không có kết quả cần tim");
            return;
        }
        System.out.println("Kết quả cần tìm là: ");
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

    void timXongInthongTin(String tenHangHoa)
    {
        if(true == tim(tenHangHoa))
        {
            current.inThongTin();
        }
        else
        {
            System.out.println("Khong tìm thấy");
        }
    }

    void themDauDS()
    {
        Node newNode = nhapThongTin();
        newNode.next = head;
        head = newNode;
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
        Node newNode = nhapThongTin();
        previous.next = newNode;
        previous.next.next = current;
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

    void timRoiThemVaoDangTruoc(String tenHangHoa)
    {
        if(true == tim(tenHangHoa))
        {
            themDauDS();
        }
        else
        {
            themDangTruoc();
        }
    }

    void xoa(String tenHangHoa)
    {
        if(current == head)
        {
            xoaHead();
            return;
        }
        if(current == tail)
        {
            xoaTail();
            return;
        }
        else
        {
            System.out.println("Không tìm thấy để xóa");
        }
        previous.next = previous.next;
    }

    void xoaHead()
    {
        current = head;
        if(head != null)
        {
            System.out.println("Khong co trong danh sach");
            return;
        }
        head = head.next;
        System.out.println("Xoa dau thanh cong");
    }

    void xoaTail()
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

    

    void xoaDS(String tenHangHoa)
    {
        if(true == tim(tenHangHoa))
        {
            if(current == head)
            {
                xoaHead();
            }
            else if(current == tail)
            {
                xoaTail();
            }
        }
    }

    void suaDS(String tenHangHoa)
    {
        if(true == tim(tenHangHoa))
        {
            Node newNode = nhapThongTin();
            current.tenHangHoa = newNode.tenHangHoa;
            return;
        }
        else
        {
            System.out.println("Không có trong danh sách");
        }
    }

    void thongTin()
    {
        temp = new Node();
        temp.tenHangHoa = snap.tenHangHoa;
        temp.giaNhap = snap.giaNhap;
        temp.soLuongTonKho = snap.soLuongTonKho;
        temp.ngayNhapKho = snap.ngayNhapKho;

        snap.tenHangHoa = current.tenHangHoa;
        snap.giaNhap = current.giaNhap;
        snap.soLuongTonKho = current.soLuongTonKho;
        snap.ngayNhapKho = current.ngayNhapKho;

        current.tenHangHoa = temp.tenHangHoa;
        current.giaNhap = temp.giaNhap;
        current.soLuongTonKho = current.soLuongTonKho;
        current.ngayNhapKho = current.ngayNhapKho;
    }

    void tangDan()
    {
        inDS();
        current = head;
        while(current != null)
        {
            full = current;
            snap = current;
            while(full != null)
            {
                if(full.giaNhap < snap.giaNhap)
                {
                    snap = full;
                }
                full = full.next;
            }
            thongTin();
            current = current.next;
        }
    }

   void giamDan()
   {
       inDS();
       current = head;
       while(current != null)
       {
           full = current;
           snap = current;
           while(full != null)
           {
               if(full.giaNhap > snap.giaNhap)
               {
                   snap = full;
               }
               full = full.next;
           }
           thongTin();
           current = current.next;
       }
   }
}
