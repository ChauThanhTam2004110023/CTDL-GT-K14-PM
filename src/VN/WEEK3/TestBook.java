package VN.WEEK3;

public class TestBook {
    public static void main(String[] args) {
        book Book;
        Book = new book("Lap trinh Java", 16.000, "Nhà San Xuất Việt Nam", 2021, 20, "Lai Sach Giao Khoa");
        System.out.println("Sach: " +Book.sach);
        System.out.println("Gia: " +Book.gia);
        System.out.println("Nha san xuat: " +Book.nhaSanXuat);
        System.out.println("Nam san xuat: " +Book.namSanXuat);
        System.out.println("So luong: " +Book.soLuong);
        System.out.println("Loai: " +Book.loai);

    }
}
