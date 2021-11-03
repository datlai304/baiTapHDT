package com.datlhp2008110218.tuan8.Lab5.Bai1;

public class HinhVuong extends ChuNhat{

    HinhVuong(double a) {
        super(a, a);
    }

    @Override
    public void xuatRaManHinh() {
        System.out.println("Diện tích hình vuông là: " + getDienTich());
    }
}
