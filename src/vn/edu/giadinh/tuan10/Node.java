package vn.edu.giadinh.tuan10;

public class Node {
    String tenHangHoa;
    double giaNhap;
    double soLuongTonKho;
    int ngayNhapKho;

    Node next;

    public Node()
    {

    }

    public Node(String ten, Double gia, Double sl, int ngay)
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

   /* String tenHangHoa;
   String giaNhap;
   String soLuongTonKho;
   String ngayNhapKho;

    Node next;

    public Node()
    {

    }

    public Node(String ten, String gia, String sl,String ngay)
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
   }  */
}
