package vn.edu.giadinh.kiemtra;

import java.util.Scanner;

public class MyQuanLyKhoHang {
    public MyQuanLyKhoHang()
    {
       add("Vang", 10, 10, 20-11-2021);
       add("Tim", 20, 20, 16-10-2021);
       add("Trang", 30, 30, 15-5-2021);
       add("Xanh", 40, 40, 6-9-2021);
       add("Den", 50, 50, 6-6-2021);
       add("Nau", 60, 60, 16-9-2021);
       add("Do", 70, 70, 29-5-2021);
       add("Duong", 80, 80, 30-4-2021);
       add("Cham", 90, 90, 23-8-2021);
       add("Luc", 11, 11, 13-2-2021);
       add("Sac", 12, 12, 12-1-2021);
       add("Cam", 13, 13, 4-12-2021);
       add("Huong", 14, 14, 2-3-2021);
       add("La", 15, 15, 6-8-2021);
       add("La cam", 16, 16, 6-7-2021);
       add("Hong", 17, 17, 4-5-2021);
       add("Tham", 18, 18, 1-12-2021);
       add("Sen", 20, 20, 12-9-2021);
       add("Do nhat", 19, 19, 12-6-2021);
       add("Bac", 21, 21, 8-8-2021);

    }
    Node head = null;
    Node tail = null;
    Node current = null;
    Node previous;
    Node snap;
    Node full;
    Node temp;
    Scanner sc = new Scanner(System.in);

    Node themHang()
    {
        System.out.println("Tên hàng hóa: ");
        String tenHangHoa = sc.nextLine();
        sc.nextLine();
        System.out.println("Giá nhập: ");
        int giaNhap = sc.nextInt();
        System.out.println("Số lượng tồn kho: ");
        int soLuongTonKho = sc.nextInt();
        System.out.println("Ngày nhập kho: ");
        int ngayNhapKho = sc.nextInt();
        Node node = new Node(tenHangHoa, giaNhap, soLuongTonKho, ngayNhapKho); 
        return node;
    } 

    void add()
    {
        Node newNode = themHang();
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
        Node newNode = themHang();
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
        Node newNode = themHang();
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
            Node newNode = themHang();
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
        /* current.soLuongTonKho = current.soLuongTonKho;
        current.ngayNhapKho = current.ngayNhapKho; */
    }

    void tangDan()
    {
        inDS();
        current = head;
        while(current != null)
        {
            temp = current;
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
           temp = current;
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
