package com.datlhp2008110218.tuan6;


public class TestDriveHinhVuong {
    public static void main(String[] args) {
        System.out.println("Nhập một trạng thái");
        System.out.println("1. Nhấp chuột");
        System.out.println("2. Không nhấp chuột và thoát chương trình");
        HinhVuong hv = new HinhVuong(1);

        System.out.println();



        // 3 chức năng khi nhấp chuột
        if (hv.trangThaiNhapChuot) {
            hv.xoay();
            hv.sound(".AIF", "Ring ring ring");
            hv.playMusic();
        }
        else 
            hv.exit(); 

    }

}
