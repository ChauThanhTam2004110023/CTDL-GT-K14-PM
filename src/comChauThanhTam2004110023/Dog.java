package comChauThanhTam2004110023;

public class Dog {
    String name;
    String color;
    int size;

    public Dog(int s)
    {
        size = s;
    }

    public Dog(String nam, String c, int s)
    {
        name = nam;
        color = c;
        size = s;
    }
    void inThongTin()
    {
        System.out.println("Name: " +name);
        System.out.println("Color: " +color);
        System.out.println("Name: " +name);
    }
}
