package com.datlhp2008110218.tuan6;

import java.util.Scanner;

public class TestDriveHinhVuong {
    public static void main(String[] args) {
        HinhVuong hv = new HinhVuong();
        System.out.println("Nhập một trạng thái");
        System.out.println("1. Nhấp chuột");
        System.out.println("2. Không nhấp chuột và thoát chương trình");
        System.out.print("Vui lòng chọn: ");

        Scanner sc = new Scanner(System.in);
        int nhapChuot = sc.nextInt();
        System.out.println();


        // nếu chọn nhấp chuột thì boolearn = true
        if (nhapChuot == 1) {
            hv.trangThaiNhapChuot = true;
        } else {
            hv.trangThaiNhapChuot = false;
        }

        // 3 chức năng khi nhấp chuột
        if (hv.trangThaiNhapChuot) {
            hv.xoay();
            System.out.println("Phát tệp âm thanh có đuôi " + HinhVuong.tenTepAmThanh);
            hv.playMusic("Ping ping ping");
        } else
            System.out.println("Thoát chương trình");
        sc.close();
    }

}
