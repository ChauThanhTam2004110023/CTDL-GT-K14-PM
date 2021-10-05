package com.tamct200411023.tuan03;

public class testmaytinh {
    public static void main(String[] args) {
        maytinh mayTinh;
        mayTinh = new maytinh("Oppo", 2021, "window 10", "Ram 8GB", "CPU intel", 20000, 2023);
        System.out.println("Nha san xuat: " +mayTinh.nhaSanXuat);
        System.out.println("Nam san xuat: " +mayTinh.namSanXuat);
        System.out.println("He dieu hanh: " +mayTinh.heDieuHanh);
        System.out.println("Ram: " +mayTinh.ram);
        System.out.println("Cpu: " +mayTinh.cpu);
        System.out.println("Gia: " +mayTinh.gia);
        System.out.println("Nam bao hanh: " +mayTinh.namBaoHanh);
    }
}
