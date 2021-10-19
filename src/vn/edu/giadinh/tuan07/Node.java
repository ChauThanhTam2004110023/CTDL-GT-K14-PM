package vn.edu.giadinh.tuan07;

public class Node {
    //Nội Dung
    //Khai bao biến
    int data;

    //Liên Kết Node
    //Tham chiếu liên kết đến node tiếp theo
    Node next;

    public Node() {}

    public Node(int d)
    {
        data = d;
    }

    public Node(int d, Node node)
    {
        next = node;
        data = d;
    }
    
}
