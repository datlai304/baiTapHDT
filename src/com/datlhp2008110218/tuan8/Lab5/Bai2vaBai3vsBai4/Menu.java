package com.datlhp2008110218.tuan8.Lab5.Bai2vaBai3vsBai4;

import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        DanhSachSinhVien dssv = new DanhSachSinhVien();
        int num = 0;
        do {
            System.out.println("1. Nhập danh sách sinh viên");
            System.out.println("2. Xuất thông tin danh sách sinh viên");
            System.out.println("3. Xuất danh sách sinh viên có học lực giỏi");
            System.out.println("4. Sắp xếp danh sách sinh viên theo điểm");
            System.out.println("5. Kết thúc");
            System.out.print("Nhập: ");
            num = sc.nextInt();
            switch (num) {
            case 1:
                System.out.println("1.CNTT");
                System.out.println("2.KT");
                System.out.print("Nhập ngành học: ");
                int luaChon = sc.nextInt();
                sc.nextLine();
                if (luaChon == 1) {
                    String nganhHoc = "Công nghệ thông tin";
                    System.out.println("Nhập mã sinh viên: ");
                    String maSinhVien = sc.nextLine();
                    System.out.println("Nhập tên: ");
                    String ten = sc.nextLine();
                    System.out.println("điểm Java");
                    double diemJAVA = sc.nextDouble();
                    System.out.println("điểm html");
                    double diemHtml = sc.nextDouble();
                    System.out.println("điểm css");
                    double diemCSS = sc.nextDouble();
                    SinhVienGD svIT = new SinhVienIT(diemJAVA, diemHtml, diemCSS);
                    double diem = svIT.getDiem();
                    System.out.println(diem);
                    SinhVienGD sv = new SinhVienIT(nganhHoc, maSinhVien, ten, diem);
                    dssv.themSinhVien(sv);
                }
                if (luaChon == 2) {
                    String nganhHoc = "Khoa kinh tế";
                    System.out.println("Nhập mã sinh viên: ");
                    String maSinhVien = sc.nextLine();
                    System.out.println("Nhập tên: ");
                    String ten = sc.nextLine();
                    System.out.println("điểm Marketing");
                    double diemMarketing = sc.nextDouble();
                    System.out.println("điểm Sales");
                    double diemSale = sc.nextDouble();
                    SinhVienGD svBiz = new SinhVienBiz(diemMarketing, diemSale);
                    double diem = svBiz.getDiem();
                    System.out.println(diem);
                    SinhVienGD sv = new SinhVienBiz(nganhHoc, maSinhVien, ten, diem);
                    dssv.themSinhVien(sv);
                }

                break;
            case 2:
                dssv.inDanhSachSinhVien();

                break;

            // case 3 : dssv.xuatDSSVHocLucGioi();

            // break;
            // case 4 : System.out.println("D");
            // break;
            default:
                System.out.println("Nhập lại");
            }

        } while (num >= 1 && num <= 4);

    }

}
