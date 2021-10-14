package vn.edu.giadinh.tuan06;

public class MinhHoa {
    public static void main(String[] args) {
        Integer so1;
        Integer so2;
        
        so1 = 5;

        so2 = 10;

        System.out.println("So 1: " +so1.intValue());
    }

    public void swap(Integer i1, Integer i2)
    {
        int temp = i1.intValue();

        i1 = new Integer(i2.intValue());
        
    }
}
