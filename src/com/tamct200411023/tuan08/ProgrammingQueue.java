package com.tamct200411023.tuan08;

import java.util.PriorityQueue;
import java.util.Queue;

public class ProgrammingQueue {
    public static void main(String[] args) {
        Queue<String> Q = new PriorityQueue<String>();
        Q.offer("10");
        Q.offer("1");
        Q.offer("2");
        Q.offer("20");

        while(true)
        {
            String ten = Q.poll();
            if(ten == null)
            {
                break;
            }
            System.out.println(ten);
        }
    }
}
