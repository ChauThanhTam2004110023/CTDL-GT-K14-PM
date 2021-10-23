package com.tamct200411023.tuan07;

public class Node {

    //Noi dung
    int data;

    //Lien ket den node tiep theo
    //Tham chieu
    Node next; //Bien tham chieu node

    public Node(){}

    public Node(int d)
    {
        data = d;
    }

    public Node(int d, Node n)
    {
        next = n;
        data = d;
    }


}
