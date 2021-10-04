import java.util.Scanner;

public class tinhDiemTrungBinh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ho va ten vao: ");
        String hoVaTen = sc.nextLine();
        System.out.println("Nhap ma so sinh vien vao: ");
        Long MSSV = sc.nextLong();

        System.out.println("Diem cac mon thi");
        System.out.println("Nhap diem thi 1 vao: ");
        float diemThi1 = sc.nextFloat();
        System.out.println("Nhap diem thi 2 vao: ");
        float diemThi2 = sc.nextFloat();
        System.out.println("Nhap diem thi 3 vao: ");
        float diemThi3 = sc.nextFloat();

        System.out.println("Diem trung binh ");
        float trungBinhCong = (diemThi1 + diemThi2 + diemThi3) /3;
        System.out.println(diemThi1+ "+" +diemThi2+ "+" +diemThi3+ "/3"+ "=" +trungBinhCong );
    }
}
