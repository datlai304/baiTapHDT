package com.datlhp2008110218.tuan6;

public class HinhTron {
    boolean trangThaiNhapChuot;
    String amThanh;
    static String tenTepAmThanh;
    int click;
    String sound;

    HinhTron(int click) {
        if (click == 1)
            trangThaiNhapChuot = true;
        else    
            trangThaiNhapChuot = false;
    }

    
    void xoay() {
        System.out.println("Hình tròn xoay 360 độ");
    }

    void playMusic() {
        if(trangThaiNhapChuot == true)
            System.out.println("Phát file âm thanh " + sound);
            System.out.println("Phát ra tiếng " +amThanh);
    }

    void sound(String s, String at) {
        sound = s;
        amThanh = at;
    }

    void exit() {
        if (trangThaiNhapChuot == false)
        System.out.println("Thoát chương trình");
    }

}
    

    
