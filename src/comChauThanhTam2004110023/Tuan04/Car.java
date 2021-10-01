package comChauThanhTam2004110023.Tuan04;

import java.util.Arrays;

public class Car {
    public static void main(String[] args) {
        int[] soXe;
        soXe = new int[5];

        double mangSoXe[] = new double[10];

        soXe[0] = 10;

        String tenXe[] = new String[]{"Chau Tam", "honda", "Wave", "A1", "4l"};
        System.out.println("Name Car: " +Arrays.toString(tenXe));
        tenXe[0] = tenXe[1];

    }
}
