package com.tamct200411023.tuan03;

public class testxe {
    public static void main(String[] args) {
        xe Xe;
        Xe = new xe("Châu Thanh Tâm", "Honda", "Wave", "A1", 4l);
        System.out.println("Ten chu xe: " +Xe.tenChuXe);
        System.out.println("Hãng sản xuất: " +Xe.hangSanXuat);
        System.out.println("Dòng xe: " +Xe.dongXe);
        System.out.println("Giây phep: " +Xe.giayPhep);
        System.out.println("Dung tich xang: " +Xe.dungTichXang);
    }
}
