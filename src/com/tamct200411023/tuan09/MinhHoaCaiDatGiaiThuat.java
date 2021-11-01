package com.tamct200411023.tuan09;

public class MinhHoaCaiDatGiaiThuat {
    public static int search(int arr[], int x)
    {
        int n = arr.length;
        for(int i = 0; i < n; i++)
        {
            if(arr[i] == x)
            {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {20, 3, 6, 12, 1, 8, 20, 10};
        int x = 10;
        int result = search(arr, x);
        if(result == -1)
        {
            System.out.println("Element is not present in array");
        }
        else
        {
            System.out.println("Element is present at index: " +result);
        }
    }
}
