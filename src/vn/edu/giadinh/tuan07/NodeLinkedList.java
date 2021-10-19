package vn.edu.giadinh.tuan07;

public class NodeLinkedList {
    
    Node head = null;
    Node tail = null;

    public NodeLinkedList() {}

    void add(int data)
    {
        //Tạo Node 
        Node newNode = new Node(data);
        if(head == null) 
        {
            //Thêm vò ds rỗng
            head = newNode;
            tail = newNode;
        }    
        else
        {
            tail.next = newNode;
            tail = newNode;
        }
    }

    void remove()
    {

    }

    void print()
    {
        Node current = head;
        if(head == null)
        {
            System.out.println("Danh sách rỗng");
            return ;
        }

        System.out.println("Các nút trong danh sách");
        while(current != null)
        {
            System.out.println(current.data);
            current = current.next;
        }
    }

    void find()
    {

    }

}
