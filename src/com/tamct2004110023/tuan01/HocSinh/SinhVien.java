import java.util.Scanner;

public class SinhVien
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ho va ten vao: ");
		String hoVaTen = sc.nextLine();
		System.out.println("Nhap ma so sinh vien vao: ");
		long maSoSinhVien = sc.nextLong();

		System.out.println("Nhap diem mon Toan: ");
		float diemToan = sc.nextFloat();
		System.out.println("Nhap diem mon Hoa: ");
		float diemHoa = sc.nextFloat();
		System.out.println("Nhap diem mon Ly: ");
		float diemLy = sc.nextFloat();
		
		System.out.println("Ho va Ten: " +hoVaTen);
		System.out.println("Ma so sinh vien: " +maSoSinhVien);
		System.out.println("Diem mon Toan la: " +diemToan);
		System.out.println("Diem mon Hoa la: " +diemHoa);
		System.out.println("Diem mon Ly la: " +diemLy);
		float trungBinhCong = (float)(diemToan + diemHoa + diemLy)/3;
		System.out.println("Trung Binh Cong ");
		System.out.println(diemToan+ " + " +diemHoa+ " + " +diemLy+ "/3"+ "=" +trungBinhCong);
	}
}