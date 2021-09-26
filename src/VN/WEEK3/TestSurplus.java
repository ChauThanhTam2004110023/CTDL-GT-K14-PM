package VN.WEEK3;

public class TestSurplus {
    public static void main(String[] args) {
        account Account;
        Account = new account("Châu Thanh Tâm" , 1234 , 16.000);
        System.out.println("Name: " +Account.name);
        System.out.println("Number: " +Account.number);
        System.out.println("Surplus: " +Account.surplus);
    }
}
