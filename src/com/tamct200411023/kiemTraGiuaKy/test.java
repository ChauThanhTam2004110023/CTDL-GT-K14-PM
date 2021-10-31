package com.tamct200411023.kiemTraGiuaKy;

public class test {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add("Vàng");
        myLinkedList.add("Xanh");
        myLinkedList.add("Đỏ");
        myLinkedList.add("Tím");
        myLinkedList.print();

        //Thêm màu
        myLinkedList.add("Đen");
        myLinkedList.add("Trắng");
        myLinkedList.print();
    }
}
