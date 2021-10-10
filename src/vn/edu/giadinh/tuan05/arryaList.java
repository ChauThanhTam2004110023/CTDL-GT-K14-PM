package vn.edu.giadinh.tuan05;

import java.util.ArrayList;

public class arryaList {
    public static void main(String[] args) {
        ArrayList a = new ArrayList<>();
        a.add("Chau tam");
        a.add(true);
        a.add(1);
        a.add(2.5);
      
        Integer i = (Integer)a.get(2);
        System.out.println(a);
    }
}
