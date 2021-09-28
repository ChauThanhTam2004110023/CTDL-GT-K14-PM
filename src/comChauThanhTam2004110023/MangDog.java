package comChauThanhTam2004110023;

public class MangDog {
    public static void main(String[] args) {
        Dog[] MangDog = new Dog[7];
        Dog dog1 = new Dog("KIKI", "Đen", 10);
        Dog dog2 = new Dog("QUA", "Vàng", 15);
        Dog dog3 = new Dog("LILI", "Nâu", 20);
        Dog dog4 = new Dog("LACKI", "Trang", 25);
        Dog dog5 = new Dog("BUBU", "Đo", 30);
        Dog dog6 = new Dog("KIKI", "Tim", 35);

        MangDog[1] = dog1;
        MangDog[2] = dog2;
        MangDog[3] = dog3;
        MangDog[4] = dog4;
        MangDog[5] = dog5;
        MangDog[6] = dog6;

        MangDog[1].inThongTin();
        MangDog[2].inThongTin();
        MangDog[3].inThongTin();
        MangDog[4].inThongTin();
        MangDog[5].inThongTin();
        MangDog[6].inThongTin();






    }
}
