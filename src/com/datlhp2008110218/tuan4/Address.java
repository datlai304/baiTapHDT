package com.datlhp2008110218.tuan4;

public class Address {
    int diaChi;
    String quocTich;
    String queQuan;

    Address(int a, String b, String c) 
    {
        diaChi = a;
        quocTich = b;
        queQuan = c;
    }

    void showAddress ()
    {
        System.out.println("Địa chỉ: "+ diaChi);
        System.out.println("Quốc tịch: " + quocTich);
        System.out.println("Quê quán: "+ queQuan);
    }

    
}
