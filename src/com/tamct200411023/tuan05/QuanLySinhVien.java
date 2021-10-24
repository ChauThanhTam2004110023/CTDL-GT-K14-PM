package com.tamct200411023.tuan05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class QuanLySinhVien {
    ArrayList<SinhVien> list = new ArrayList<SinhVien>();
    Scanner sc = new Scanner(System.in);

    public void nhapThongTin()
    {
        System.out.println("Nhap so luong sinh vien: ");
        int n = sc.nextInt();
        while(true)
        {
            for(int i = 0; i < n - 1 ; i++)
            {
                SinhVien sinhVien;
                sinhVien = new SinhVien();
                sinhVien.nhapThongTin();
                sc.nextLine();
                list.add(sinhVien);
            }
            /* SinhVien sinhVien;
            sinhVien = new SinhVien();
            sinhVien.nhapThongTin();
            sc.nextLine();
            list.add(sinhVien); */
        }
    }

    public void xuatThongTin()
    {
        for(SinhVien sinhVien : list)
        {
            sinhVien.inThongTin();
        }
    }

    public void xuatNgauNhien()
    {
        Collections.shuffle(list);
    }

    public void sapDiemTB()
    {
       Collections.sort(list, new Comparator<SinhVien>() {
           public int compare(SinhVien sv1, SinhVien sv2)
           {
               if(sv1.diemTB < sv2.diemTB)
               {
                   return -1;
               }
               else
               {
                   if(sv1.diemTB == sv2.diemTB)
                   {
                       return 0;
                   }
                   else
                   {
                       return 1;
                   }
               }
           }
       });
    } 

    public void timKiemSV()
    {
        System.out.println("Ten sinh vien cn tim: ");
        for(SinhVien sinhVien : list)
        {
            if(sc.nextLine().equals(sinhVien.hoVaTen))
            {
                sinhVien.inThongTin();
            }
        }
    }


}
