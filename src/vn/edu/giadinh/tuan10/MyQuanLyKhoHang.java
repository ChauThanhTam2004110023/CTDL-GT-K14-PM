package vn.edu.giadinh.tuan10;

import java.util.Date;
import java.util.Scanner;

public class MyQuanLyKhoHang {
   public MyQuanLyKhoHang()
   {
       add("Den", 10, 10, 20-11-2020);
       add("Trang", 20, 20, 1-2-2021);
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
   Date date = new Date();

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

}
