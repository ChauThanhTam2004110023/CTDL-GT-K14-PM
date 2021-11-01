package com.tamct200411023.tuan09;

import java.util.Arrays;

public class MinhoaInsertionSort {
    //XẮP XẾP CHÈN
    public static void insertionSort(int[] arr)
    {
        int n = arr.length;
        for(int i = 0; i < n; ++i)
        {
            int key = arr[i];
            int j = i - 1;
            while(j >= 0 && arr[j]  > key)
            {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
    public static void main(String[] args) {
        int arr[] = {16, 5, 2, 1, 20, 4, 25};
        System.out.println("Mang: " +Arrays.toString(arr));
        insertionSort(arr);
        System.out.println("Mang duoc sap xep: " +Arrays.toString(arr));
    }
}
