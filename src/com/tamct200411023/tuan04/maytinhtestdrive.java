package com.tamct200411023.tuan04;

public class maytinhtestdrive {
    public static void main(String[] args) {
        maytinh[] mayTinh = new maytinh[10];
        
        maytinh mayTinh1 = new maytinh("Samsung", "8GB", "intel", "1080HD");

        mayTinh[1] = mayTinh1;
        
        mayTinh[1].inThongTin();
    }
}
