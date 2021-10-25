package com.tamct200411023.tuan08;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemoPrograming {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        queue.add(8);
        queue.add(9);
        queue.add(10);

        System.out.println(queue);

        //lấy ra phân tử 
        int phanTuDuocLayRa = queue.remove();

        System.out.println("Phần tử được lấy ra: " +phanTuDuocLayRa);

        System.out.println("Phần tử còn lại trong queue");

        System.out.println(queue);

        //Thêm 1 phần tử của queue -- không loại khỏi danh sách
        int phanDuocThem = queue.peek();

        System.out.println("Phần tử vừa được thêm " +phanDuocThem);
        
        System.out.println("Phan tử còn lại trong queue");

        System.out.println(queue);

    }
}
