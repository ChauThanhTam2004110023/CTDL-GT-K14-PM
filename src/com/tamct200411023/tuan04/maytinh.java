package com.tamct200411023.tuan04;

public class maytinh {
    String hang;
    String ram;
    String cpu;
    String vga;

    public maytinh(String h, String r, String c, String v)
    {
        hang = h;
        ram = r;
        cpu = c;
        vga = v;
    }

    void inThongTin()
    {
        System.out.println(" --Thông Tin-- ");
        System.out.println("Hãng sản xuất: " +hang);
        System.out.println("Ram " +ram);
        System.out.println("CPU: " +cpu);
        System.out.println("VGA: " +vga);
    }
}
