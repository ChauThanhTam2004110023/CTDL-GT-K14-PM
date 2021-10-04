import java.util.Scanner;

public class theTichKhoiLapPhuong {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        double canh;
        System.out.println("Nhap canh vao: ");
        canh = sc.nextDouble();

        System.out.println("The tich khoi lap phuong la: ");
        double theTich = (double)(canh * canh * canh);
        System.out.println(canh+ " * " +canh+ " * " +canh+ "=" +theTich);

    }
}
