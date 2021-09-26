package VN.WEEK3;

public class TestComputer {
    public static void main(String[] args) {
        Computer computer;
        computer = new Computer("Oppo", 2021, "window 10", "Ram 8GB", "CPU intel", 20000, 2023);
        System.out.println("Nha san xuat: " +computer.nhaSanXuat);
        System.out.println("Nam san xuat: " +computer.namSanXuat);
        System.out.println("He dieu hanh: " +computer.heDieuHanh);
        System.out.println("Ram: " +computer.ram);
        System.out.println("Cpu: " +computer.cpu);
        System.out.println("Gia: " +computer.gia);
        System.out.println("Nam bao hanh: " +computer.namBaoHanh);
    }
}
