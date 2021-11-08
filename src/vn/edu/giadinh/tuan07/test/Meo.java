package vn.edu.giadinh.tuan07.test;

public class Meo {
    String ten;
    int tuoi;
    String mausac;
    String giong;
    Meo next;

    Meo(){}

    Meo(String name,int age,String color,String sex){
        ten = name;
        tuoi = age;
        mausac = color;
        giong = sex;
    }

    public void inThongTin(){
        System.out.println("-------------------");
        System.out.println("Tên: "+ten);
        System.out.println("Tuổi: "+tuoi);
        System.out.println("Màu Sắc: "+mausac);
        System.out.println("Giới Tính: "+giong);
    }
}
