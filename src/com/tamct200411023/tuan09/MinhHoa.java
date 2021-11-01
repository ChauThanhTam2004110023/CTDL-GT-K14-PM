package com.tamct200411023.tuan09;

import java.util.Arrays;

public class MinhHoa {
    //XẮP XẾP MẢNG
    public static void selectionSort(int[] arr)
    {
        for(int i = 0; i < arr.length - 1; i++)
        {
            int index = i;
            for(int j = i + 1; j < arr.length; j++)
            {
                if(arr[j] < arr[index])
                {
                    index = j;
                }
            }
            int smallerNumber = arr[index];
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        } 
    }
    public static void main(String[] args) {
        int arr[] = {5, 1, 2, 14, 16, 0};
        System.out.println("Mang: " +Arrays.toString(arr));
        selectionSort(arr);
        System.out.println("Mang duoc sap xep: " +Arrays.toString(arr));
    }
}
