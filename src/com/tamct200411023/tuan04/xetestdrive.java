package com.tamct200411023.tuan04;

public class xetestdrive {
    public static void main(String[] args) {
        xe[] Xe = new xe[10];

        xe Xe1 = new xe("Chau Tam", "Honda", "Wave", "A1", 3l);
        
        xe Xe2 = new xe("Chau Tam Thanh", "Yamaha", "sirut", "A1", 3l);

        Xe[1] = Xe1;
        Xe[2] = Xe2;

        Xe[1].inThongTin();
        Xe[2].inThongTin();


    }
}
