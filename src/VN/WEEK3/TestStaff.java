package VN.WEEK3;

public class TestStaff {
    public static void main(String[] args) {
        Staff staff;
        staff = new Staff("Châu Thanh Tam", 23.000, "M012", "Bo Phan Tap Doan", 2002);
        System.out.println("Ten: " +staff.tenNhanVien);
        System.out.println("Luong: " +staff.luong);
        System.out.println("Dia chi: " +staff.diaChi);
        System.out.println("Bo phan lam viec: " +staff.boPhanLamViec);
        System.out.println("Ngay sinh: " +staff.ngaySinh);
    }
}
