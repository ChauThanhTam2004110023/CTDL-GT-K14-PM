package com.tamct200411023.kiemtragiuakylan2;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListBook {
    static ArrayList<Book> dsbook = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    static void themSach(Book book)
    {
        dsbook.add(book);
    }

    static void nhapDanhSach(Scanner sc )
    {
        Book book;
        System.out.println("Nhập số lượng sách cần nhập: ");
        int n = sc.nextInt();
        for(int i = 0; i < n; i++)
        {
            System.out.println("Sách thú: " +i+1+ ": ");
            book = new Book();
            book.nhapThongTin();
            themSach(book);
        }
    }

    static void hienThiDanhSach()
    {
        for(Book book: dsbook)
        {
            book.inThongTin();
        }
    }

    static void timKiem(String name)
    {
        for(Book book: dsbook)
        {
            if(name.equals(book.getsach()));
            {
                book.inThongTin();
            }
        }
    }
}
