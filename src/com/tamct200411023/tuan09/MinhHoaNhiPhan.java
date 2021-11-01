package com.tamct200411023.tuan09;

public class MinhHoaNhiPhan {
    int binarySearch(int arr[], int l, int r, int x)
    {
        if(r >= l)
        {
            int mid = l + (r - 1)/2;
            //Nếu phần tử chính giữa
            if(arr[mid] == x)
            {
                return mid;
            }
            //Phần tử nhỏ hơn ở giữa
            if(arr[mid] > x)
            {
                return binarySearch(arr, l, mid - 1, x);
            }
            else
            {
                return binarySearch(arr, mid + 1, r, x);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        MinhHoaNhiPhan ob = new MinhHoaNhiPhan();
        int arr[] = { 2, 4, 9, 10, 11, 22};
        int n = arr.length;
        int x = 9;
        int result = ob.binarySearch(arr, 0, n - 1, x);
        if (result == -1)
            System.out.println("Phần tử không tồn tại.");
        else
            System.out.println("Phần tử được tìm thấy tại vị trí: " + result);
    }
}
