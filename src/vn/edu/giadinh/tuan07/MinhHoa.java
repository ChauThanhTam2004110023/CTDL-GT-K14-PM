package vn.edu.giadinh.tuan07;

import javax.print.attribute.standard.MediaSize.NA;

public class MinhHoa {
    int id;
    String name;

    public MinhHoa(int id, String name)
    {
        this.id = id;
        this.name = name;
    }

    public String toString()
    {
        return "MinhHoan [id= " + id + ", name= " + name + "]";
    }
}
