package com.tamct200411023.tuan04;

public class xe {
    String tenChuXe;
    String hangSanXuat;
    String dongXe;
    String giayPhep;
    double dungTichXang;

    xe(String ten, String hang, String dong, String phep, double l)
    {
        tenChuXe = ten;
        hangSanXuat = hang;
        dongXe = dong;
        giayPhep = phep;
        dungTichXang = l;
    }

    void inThongTin()
    {
        System.out.println("Ten chu xe: " +tenChuXe);
        System.out.println("Hang san xuat: " +hangSanXuat);
        System.out.println("Dong xe: " +dongXe);
        System.out.println("Giay phep: " +giayPhep);
        System.out.println("Dung tich xang: " +dungTichXang);
    }
}
