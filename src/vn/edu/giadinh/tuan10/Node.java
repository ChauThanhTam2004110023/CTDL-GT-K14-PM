package vn.edu.giadinh.tuan10;

import java.util.Date;

public class Node {
    String tenHangHoa;
    int giaNhap;
    int soLuongTonKho;
    int ngayNhapKho;
    Date ngay;
    
    Date date;
    Node next;

    public Node()
    {

    }

    public Node(String ten, int gia, int sl, int ngay)
    {
        tenHangHoa = ten;
        giaNhap = gia;
        soLuongTonKho = sl;
        ngayNhapKho = ngay;
    }

    public void inThongTin()
   {
       System.out.println("--------------");
       System.out.println("Tên hàng hoa: " +tenHangHoa);
       System.out.println("Giá nhập: " +giaNhap);
       System.out.println("Số lượng tồn kho: " +soLuongTonKho);
       System.out.println("Ngày nhập kho: " +ngayNhapKho);
   }
}
