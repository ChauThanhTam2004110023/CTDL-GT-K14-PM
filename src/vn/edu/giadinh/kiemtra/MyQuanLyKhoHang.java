package vn.edu.giadinh.kiemtra;

import java.util.Scanner;

public class MyQuanLyKhoHang {
    Node head;
    Node tail;
    Node current;
    Node previous;
    Node snap;
    Node temp;
    Node full;
    Scanner sc = new Scanner(System.in);

    public MyQuanLyKhoHang()
    {
       add("Vang", 10, 10, 2021);
       add("Tim", 20, 20, 2021);
       add("Trang", 30, 30, 2021);
       add("Xanh", 40, 40, 2021);
       add("Den", 50, 50, 2021);
       add("Nau", 60, 60, 2021);
       add("Do", 70, 70, 2021);
       add("Duong", 80, 80, 2021);
       add("Cham", 90, 90, 2021);
       add("Luc", 11, 11, 2021);
       add("Sac", 12, 12, 2021);
       add("Cam", 13, 13, 2021);
       add("Huong", 14, 14, 2021);
       add("La", 15, 15, 2021);
       add("La cam", 16, 16, 2021);
       add("Hong", 17, 17, 2021);
       add("Tham", 18, 18, 2021);
       add("Sen", 20, 20, 2021);
       add("Do nhat", 19, 19, 2021);
       add("Bac", 21, 21, 2021);
       add("Si", 22, 22, 2023);
       
    }

    void add(String ten, int gia, int sl, int ngay)
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
        previous.next = previous.next;
    } 

    void xoaHead()
    {
        current = head;
        if(head == null)
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

    void suaDS(String tenHangHoa, int giaNhap, int soLuongTonKho, int ngayNhapKho)
    {
        if(true == tim(tenHangHoa))
        {
            Node newNode = themHang();
            current.tenHangHoa = newNode.tenHangHoa;
            current.giaNhap = newNode.giaNhap;
            current.soLuongTonKho = newNode.soLuongTonKho;
            current.ngayNhapKho = newNode.ngayNhapKho;
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
            while(full != null)
            {
                if(temp.giaNhap < full.giaNhap)
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
           while(full != null)
           {
               if(temp.giaNhap > full.giaNhap)
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
