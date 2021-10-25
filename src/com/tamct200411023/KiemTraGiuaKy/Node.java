package com.tamct200411023.KiemTraGiuaKy;

public class Node {
      //Noi dung
      String data;

      //Lien ket den node tiep theo
      //Tham chieu
      Node next; //Bien tham chieu node
  
      public Node(){}
  
      public Node(String d)
      {
          data = d;
      }
  
      public Node(String d, Node n)
      {
          next = n;
          data = d;
      }
}
