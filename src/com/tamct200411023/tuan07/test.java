package com.tamct200411023.tuan07;

public class test {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        System.out.println("-----MENU-----");
        System.out.println("1.NHẬP DANH SÁCH");
        System.out.println("2.IN DANH SÁCH");
        System.out.println("3.TÌM KIẾM ĐẦU DANH SÁCH");
        //System.out.println("4.TÌM KIẾM CUỐI DANH SÁCH");
        System.out.println("5.XÓA ĐẦU DANH SÁCH");
        //System.out.println("6.XÓA CUỐI DANH SÁCH");

        myLinkedList.nhapDanhSach();
        myLinkedList.inDanhSach();
        myLinkedList.timKiemDauDS();
       // myLinkedList.timKiemCuoiDS();
        myLinkedList.xoaDauDS();
        //myLinkedList.xoaCuoiDS();

    }
    
}
