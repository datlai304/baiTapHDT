package com.datlhp2008110218.tuan6;

public class HinhVuong {
    boolean trangThaiNhapChuot;
    String amThanh;
    static String tenTepAmThanh;

    HinhVuong() {
        tenTepAmThanh = ".AIF";
    }

    void xoay() {
        System.out.println("Hình vuông xoay 360 độ");
    }

    void playMusic(String amThanh) {
        System.out.println("Phát ra tiếng chuông");
        System.out.println(amThanh);
    }

}
