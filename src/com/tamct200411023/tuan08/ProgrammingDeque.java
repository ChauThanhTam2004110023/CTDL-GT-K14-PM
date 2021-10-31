package com.tamct200411023.tuan08;

import java.util.Deque;
import java.util.LinkedList;

public class ProgrammingDeque {
    public static void main(String[] args) {
        Deque<String> D = new LinkedList<String>();
        D.offer("TITV 1");
        D.offer("Nguyen Van A");
        D.offer("Nguyen Van B");
        D.offer("TITV 2");
        D.offer("TITV 4");
        //D.offer("TITV 0");

        System.out.println(D);
        System.out.println(D.pop());
        System.out.println(D.poll());
        System.out.println(D.pollFirst());
        System.out.println(D.pollLast());
    }
}
