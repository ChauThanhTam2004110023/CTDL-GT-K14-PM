package comChauThanhTam2004110023.Tuan04;

import java.util.Arrays;

public class CTGtMinhHoaMang {
    public static void main(String[] args) {
        int[] mangSoNguyen;

        mangSoNguyen = new int[5];

        double mangSoThuc[] = new double[10];

        mangSoNguyen[0] = 2;

        //Khai bao khoi tao gia tri mang
        double diemMonHoc[] = new double[]{10, 5, 6, 8, 9};

        System.out.println("Mang diem mon hoc: " +Arrays.toString(diemMonHoc));
        diemMonHoc[0] = diemMonHoc[1];


        String tenSinhVien[] = {"Tam", "Tai", "Trung"};

    }
}
