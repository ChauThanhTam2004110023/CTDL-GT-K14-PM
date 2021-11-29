package vn.edu.giadinh.tuan07;


public class Node {
    
    int id;
    String tenMau;
    double khoiLuong; 
    Node next;
    public Node()
    {
        
    }


    public Node(int di, String ten, double kl)
    {
        id = di;
        tenMau = ten;
        khoiLuong = kl; 
    }

     public void inThongTin()
    {
        System.out.println("\tNhap id: " +id);
        System.out.println("\tNhap mau: " +tenMau);
        System.out.println("\tNhap khoi luong: " +khoiLuong);
    }
   
}
