package com.datlhp2008110218.tuan6;



public class TestDriveTamGiac {
    public static void main(String[] args) {
        System.out.println("Nhập một trạng thái");
        System.out.println("1. Nhấp chuột");
        System.out.println("2. Không nhấp chuột và thoát chương trình");
        TamGiac tgiac = new TamGiac(1);
        System.out.println();

        // 3 chức năng khi nhấp chuột

        if (tgiac.trangThaiNhapChuot) {
            tgiac.xoay();
            tgiac.sound(".AIF", "Ring ring ring");
            tgiac.playMusic();
        }
        else 
            tgiac.exit(); 

    }
       
}
