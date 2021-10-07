package com.tamct200411023.tuan04;

public class nhanvientestdrive {
    public static void main(String[] args) {
        nhanvien[] nhanVien = new nhanvien[10];

        nhanvien nhanVien1 = new nhanvien("Chau Tam", "280A", "Cty cong nghe", 2002, 23000);
        nhanvien nhanVien2 = new nhanvien("Chau Tam Thanh", "280B", "Cty cong nghe", 2003, 23000);
         
        nhanVien[1] = nhanVien1;
        nhanVien[2] = nhanVien2;

        nhanVien[1].inThongTin();
        nhanVien[2].inThongTin();
    }
}
