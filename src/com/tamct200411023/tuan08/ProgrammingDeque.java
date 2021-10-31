package com.tamct200411023.tuan08;

import java.util.ArrayDeque;
import java.util.Deque;

public class ProgrammingDeque {
    public static void main(String[] args) {
        Deque<String> D = new ArrayDeque<String>();
        D.offer("TITV 1");
        D.offer("Nguyen Van A");
        D.offer("Nguyen Van B");
        D.offer("TITV 2");
        D.offer("TITV 4");
        D.offer("TITV 0");

        while(true)
        {
            String ten = D.poll();
            {
                if(ten == null)
                {
                    break;
                } 
            }
            System.out.println(ten);
        }
    }
}
