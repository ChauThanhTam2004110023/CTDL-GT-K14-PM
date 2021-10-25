package com.tamct200411023.tuan08;

import java.util.Stack;

public class StackDemoPrograming {
   public static void main(String[] args) {
    Stack<String> stack = new Stack<>();

    stack.push("Welcome");
    stack.push("To");
    stack.push("Data Structure and Algotithm");

    System.out.println(stack);

    String poped = stack.pop();
    System.out.println("Đã lấy ra từ danh sach stack " +poped);

    System.out.println("Phân tử còn lại của stack: ");
    System.out.println(stack);

    String phanTuDuocThem = stack.peek();
    System.out.println("Them phan tu dinh: " +phanTuDuocThem);

    System.out.println(stack);
   }
    
}
