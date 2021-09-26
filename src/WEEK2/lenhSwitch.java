package WEEK2;

import java.util.Scanner;

public class lenhSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Nhap tu 1 den 7: ");
        n = sc.nextInt();

        switch(n)
        {
            case 1: System.out.println("Thu Hai"); break;
            case 2: System.out.println("Thu Ba"); break;
            case 3: System.out.println("Thu Tu"); break;
            case 4: System.out.println("Thu Nam"); break;
            case 5: System.out.println("Thu Sau"); break;
            case 6: System.out.println("Thu Bay"); break;
            case 7: System.out.println("Chu Nhat"); break;
            default: System.out.println("Du lieu nhap sai"); break;
        }
    }
}
