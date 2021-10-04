import java.util.Scanner;

public class chuViDienTich {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       float chieuDai, chieuRong;
       double a, b;
       System.out.println("Nhap chieu dai a: ");
       chieuDai = sc.nextInt();
       System.out.println("Nhap chieu rong b: ");
       chieuRong = sc.nextInt();

       System.out.println("a: ");
       a = sc.nextDouble();
       System.out.println("b: ");
       b = sc.nextDouble();

       //Ham Math
       System.out.println("Min(a,b)= " +Math.min(a,b));

       System.out.println("Chieu dai a: ");
       System.out.println("Chieu rong b: ");
       System.out.println("Chu vi hinh chu nhat la: ");
       float chuVi = (float)(chieuDai * chieuRong)*2;
       System.out.println(chieuDai+ "*" +chieuRong+ "*2" +"=" +chuVi);
       System.out.println("Dien tich hinh chu nhat la: ");
       float dienTich = (float)(chieuDai * chieuRong);
       System.out.println(chieuDai+ "*" +chieuRong+  "=" +dienTich);
    }
}
