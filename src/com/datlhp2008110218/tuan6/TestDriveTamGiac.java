package com.datlhp2008110218.tuan6;

import java.util.Scanner;

public class TestDriveTamGiac {
    public static void main(String[] args) {
        TamGiac tgiac = new TamGiac();
        System.out.println("Nhập một trạng thái");
        System.out.println("1. Nhấp chuột");
        System.out.println("2. Không nhấp chuột và thoát chương trình");
        System.out.print("Vui lòng chọn: ");

        Scanner sc = new Scanner(System.in);
        int nhapChuot = sc.nextInt();
        System.out.println();

        // nếu chọn nhấp chuột thì boolearn = true
        if (nhapChuot == 1) {
            tgiac.trangThaiNhapChuot = true;
        } else {
            tgiac.trangThaiNhapChuot = false;
        }

        // 3 chức năng khi nhấp chuột
        if (tgiac.trangThaiNhapChuot) {
            tgiac.xoay();
            System.out.println("Phát tệp âm thanh có đuôi " + TamGiac.tenTepAmThanh);
            tgiac.playMusic("Ring ring ring");
        } else
            System.out.println("Thoát chương trình");
        sc.close();
    }

}
