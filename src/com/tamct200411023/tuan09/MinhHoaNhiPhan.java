package com.tamct200411023.tuan09;

public class MinhHoaNhiPhan {
    //private static int binarySearch;

    int binarySearch(int arr[], int x)
    {
        int l = 0, r = arr.length - 1;
        while(l <= r)
        {
            int m = l + (r - l)/2;
            if(arr[m] == x)
            {
                return m;
            }
            if(arr[m] < x)
            {
                //return binarySearch(arr, l);
                l = m + 1;
            }
            else
            {
                r = m -1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        MinhHoaNhiPhan mh = new MinhHoaNhiPhan();
        int arr[] = {2,3,4,10,40};
        //int n = arr.length;
        int x = 10;
        int result = mh.binarySearch(arr, x);
        if(result == -1)
        {
            System.out.println("Phan tu khong ton tai.");
        }
        else
        {
            System.out.println("Phan tu duôc sap xep la: " +"index" +result);
        }
    }
}
