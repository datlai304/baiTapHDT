package com.datlhp2008110218.tuan6;


public class TestDriveHinhTron {
    public static void main(String[] args) {
        System.out.println("Nhập một trạng thái");
        System.out.println("1. Nhấp chuột");
        System.out.println("2. Không nhấp chuột và thoát chương trình");
        HinhTron htron = new HinhTron(1);
        System.out.println();



        // 3 chức năng khi nhấp chuột
        if (htron.trangThaiNhapChuot) {
            htron.xoay();
            htron.sound(".AIF", "Ring ring ring");
            htron.playMusic();
        }
        else 
            htron.exit(); 
    }
}
