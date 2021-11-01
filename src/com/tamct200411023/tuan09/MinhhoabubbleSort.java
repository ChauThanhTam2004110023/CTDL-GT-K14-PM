package com.tamct200411023.tuan09;

import java.util.Arrays;

public class MinhhoabubbleSort {
    //XẮP XẾP MINH HỌA 
    public static void bubbleSort(int[] arr)
    {
        int n = arr.length;
        int temp = 0;
        for(int i = 0; i < n; i++)
        {
            for(int j = 1; j < (n-i); j++)
            {
                if(arr[j - 1] < arr[j])
                {
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {5, 2, 1, 7, 15, 19};
        System.out.println("Mang lưu chọn: " +Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println("Mang duoc sap xep: " +Arrays.toString(arr));
    }
}
