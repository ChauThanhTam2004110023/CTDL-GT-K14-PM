package vn.edu.giadinh.tuan07;

import java.util.LinkedList;

public class duyetLinkedList {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        //Them phan tu
        list.add("\t Java");
        list.add("\t Python");
        list.add("\t C");
        list.add("\t JavaScript");
        //Xuat cac phan tu cua list
        System.out.println("Cac phan tu co trong list: ");
        System.out.println(list);
    }
}
