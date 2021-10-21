package com.tamct200411023.tuan07;

public class Node {

    String data;

    int pos;

    Node next;

    public Node() {}

    public Node(String d)
    {
        data = d;
        next = null;
    }

    public Node(String d, Node node)
    {
        data = d;
        next = node;
    }
}
