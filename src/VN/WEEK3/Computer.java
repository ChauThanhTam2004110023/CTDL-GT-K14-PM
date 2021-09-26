package VN.WEEK3;

public class Computer {
    String nhaSanXuat;
    double namSanXuat;
    String heDieuHanh;
    String ram;
    String cpu;
    double gia;
    double namBaoHanh;

    Computer(String nha, double nam, String he, String r, String CPU, double g, double nambaohanh)
    {
        nhaSanXuat = nha;
        namSanXuat = nam;
        heDieuHanh = he;
        ram = r;
        cpu = CPU;
        gia = g;
        namBaoHanh = nambaohanh;
    }
}
