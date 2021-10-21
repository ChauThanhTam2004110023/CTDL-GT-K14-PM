package com.tamct200411023.tuan07;

public class MyLinkedList {
    Node head = null;
    Node tail = null;

    public MyLinkedList(){}

    void add(String data)
    {
        Node newNode = new Node(data);
        if(head == null)
        {
            head = newNode;
            tail = newNode;
        }
        else
        {
            tail.next = newNode;
            tail = newNode;
        }
    }
    void remove(){
       
    }

    void print()
    {
        Node current = head;

        if(head == null)
        {
            System.out.println("Danh Sach rong!!");
            return;
        }

        System.err.println("Cac nut trong danh sach ");
        while(current != null)
        {
            System.out.println(current.data);
            current = current.next;
        }
    }

    void find(){}

}
