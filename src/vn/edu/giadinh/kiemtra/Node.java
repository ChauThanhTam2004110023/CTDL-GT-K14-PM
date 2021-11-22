package vn.edu.giadinh.kiemtra;

public class Node {
    String tenHangHoa;
    double giaNhap;
    double soLuongTonKho;
    int ngayNhapKho;

    Node next;

    public Node()
    {

    }

    public Node(String ten, double gia, double sl, int ngay)
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