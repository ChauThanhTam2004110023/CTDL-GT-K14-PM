package com.ChauThanhTam2004110023.Tuan05;

import java.util.Scanner;

public class mangSoNguyen {
    public static void main(String[] args) {
        int []arr = {3,5,7,9,};
        int newElement = 8;

        //Chiều dài của mảng cũ
        int n = arr.length;
        // Tạo mảng
        int[] newArr = new int[n + 1];
        //Đổi dữ liệu của mảng cũ sang mảng mới 
        for(int i = 0; i < n ; i++)
        {
            newArr[i] = arr[i];
        }
        System.out.println("In mảng cũ ");
        for(int x : arr)
        {
            System.out.println(x);
        }
        //Thêm phần tử mới vào
        newArr[n] = newElement;
        System.out.println("In mảng mới ");
        for(int x : newArr)
        {
            System.out.println(x);
        } 
    }
}
