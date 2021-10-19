package vn.edu.giadinh.tuan07;

import java.util.LinkedList;
import java.util.List;

public class TestMinhHoa {
    public static final int NUM_OF_ELEMENT = 10;

    public static void main(String[] args) {
        List<MinhHoa> minhHoas = new LinkedList<>();
        for(int i = 0; i <= NUM_OF_ELEMENT; i++)
        {
            MinhHoa minhHoa = new MinhHoa(i, "Name: " +i);
            minhHoas.add(minhHoa);
        }
        for(MinhHoa minhHoa: minhHoas)
        {
            System.out.println(minhHoa);
        }
    }
}
