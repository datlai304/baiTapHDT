package com.datlhp2008110218.tuan6;

public class TamGiac {
    boolean trangThaiNhapChuot;
    String amThanh;
    static String tenTepAmThanh;

    TamGiac() {
        tenTepAmThanh = ".AIF";
    }

    void xoay() {
        System.out.println("Tam giác xoay 360 độ");
    }

    void playMusic(String amThanh) {
        System.out.println("Phát ra tiếng chuông");
        System.out.println(amThanh);
    }

}
