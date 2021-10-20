package com.datlhp2008110218.tuan6;

import java.util.Scanner;

public class TestDriveHinhTron {
    public static void main(String[] args) {
        HinhTron htron = new HinhTron();
        System.out.println("Nhập một trạng thái");
        System.out.println("1. Nhấp chuột");
        System.out.println("2. Không nhấp chuột và thoát chương trình");
        System.out.print("Vui lòng chọn: ");

        Scanner sc = new Scanner(System.in);
        int nhapChuot = sc.nextInt();
        System.out.println();


        // nếu chọn nhấp chuột thì boolearn = true
        if (nhapChuot == 1) {
            htron.trangThaiNhapChuot = true;
        } else {
            htron.trangThaiNhapChuot = false;
        }

        // 3 chức năng khi nhấp chuột
        if (htron.trangThaiNhapChuot) {
            htron.xoay();
            System.out.println("Phát file âm thanh có đuôi " + HinhTron.tenTepAmThanh);
            htron.playMusic("Ten Ten Ten");
        } else
            // không nhấp chuột thì thoát chương trình
            System.out.println("Thoát chương trình");
        sc.close();
    }

}
