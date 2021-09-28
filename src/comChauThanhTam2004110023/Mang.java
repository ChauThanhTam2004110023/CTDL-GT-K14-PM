package comChauThanhTam2004110023;

import java.util.Scanner;

public class Mang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double mang1[];
        mang1 = new double[10];
        for(int i = 0; i < mang1.length; i++)
        {
            System.out.println("Mang thu i: ");
            mang1[i] = sc.nextDouble();
        }
        double tong = 0;
        for(int i= 0; i < mang1.length; i++)
        {
            tong = tong + mang1[i];
        }
        System.out.println("Tong: " +tong); 
        /* double mang2[];
        mang2 = new double[] {1,2,3,4,5,6,7,8,9,10};
        System.out.println("Mang 2: ");
        for(int i=0; i <= mang2.length; i++)
        {
            System.out.println(i);
        }
        double tong = 0;
        for(int i=0; i < mang2.length; i++)
        {
            tong = tong + mang2[i];
        }
        System.out.println("Tong: " +tong); */

        
    }
}
