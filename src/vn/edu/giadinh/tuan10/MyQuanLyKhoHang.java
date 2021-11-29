package vn.edu.giadinh.tuan10;

import java.util.Scanner;

public class MyQuanLyKhoHang {
   public void MyQuanLyKhoHang()
   {
       add("Den", 10, 10, 2020);
       add("Trang", 20, 20, 2021);
       add("Vang", 30, 30, 2022);
       add("Tim", 40, 40, 2023);
       add("Nau", 50, 50, 2024);
       add("Do", 60, 60, 2025);
   }
   Node head = null;
   Node tail = null;
   Node current = null;
   Node previous;
   Scanner sc = new Scanner(System.in);

   void add(String ten, int gia, int sl, int ngay)
   {
       MyQuanLyKhoHang();
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
       MyQuanLyKhoHang();
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

}
