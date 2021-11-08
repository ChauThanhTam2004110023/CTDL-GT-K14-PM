package vn.edu.giadinh.tuan07;

public class TestDrive {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        System.out.println("-----MENU-----");
        System.out.println("1.NHAP THONG TIN");
        System.out.println("2.IN DANH SACH");
        System.out.println("3.TIM KIEM DAU DANH SACH");
        //
        System.out.println("4.TIM KIEM CUOI DANH SACH");
        System.out.println("4.XÓA ĐẦU DANH SÁCH");


        linkedList.nhapThongTin();
        linkedList.inDanhSach();
        linkedList.timKiemDauDS();
        System.out.println("Danh sach tao sau khi xoa dau:");
        linkedList.xoaDauDS();
        linkedList.inDanhSach();
    }
}
