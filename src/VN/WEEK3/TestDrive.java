package VN.WEEK3;

public class TestDrive {
    public static void main(String[] args) {
        Cow cow;
        cow = new Cow(15);
        System.out.println("Weight: " +cow.weight);
        cow.weight = 15;

        cow = new Cow(5);
        System.out.println("Weight: " +cow.weight);
        cow.weight = 5;
    }
}
