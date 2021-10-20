package com.datlhp2008110218.tuan6;

public class HinhTron {
    boolean trangThaiNhapChuot;
    String amThanh;
    static String tenTepAmThanh;

    HinhTron() {
        tenTepAmThanh = ".AIF";
    }

    void xoay() {
        System.out.println("Hình tròn xoay 360 độ");
    }

    void playMusic(String amThanh) {
        System.out.println("Phát ra tiếng chuông: ");
        System.out.println(amThanh);
    }

}
