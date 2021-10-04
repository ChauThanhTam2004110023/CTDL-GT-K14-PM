import java.util.Scanner;

public class phuongTrinhBacNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b, x;
        System.out.println("Nhap a vao: ");
        a = sc.nextDouble();
        System.out.println("Nhap b vao: ");
        b = sc.nextDouble();
        
        if(a == 0)
        {
            if(b == 0)
            {
                System.out.println("Phuong trinh vo so nghiem");
            }
            else
            {
                System.out.println("Phuong trinh vo nghiem");
            }
        }
        else
        {
            x = -b/a;
            System.out.println("Phuong trinh co nghiem la: x" +x);
        }
    }
}
