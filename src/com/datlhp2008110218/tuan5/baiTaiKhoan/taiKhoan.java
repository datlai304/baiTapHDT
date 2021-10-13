package com.datlhp2008110218.tuan5.baiTaiKhoan;

public class taiKhoan {
    String soDu;
    String soTaiKhoan;
    String tenTaiKhoan;
    String diaChi;
    String tenNganHang;
    String namSinh;
    String ngayCapThe;

    // hàm tạo mặc định
    taiKhoan() {
        tenNganHang = "BIDV";

    }

    // hàm tạo 1 tham số
    taiKhoan(String ten) {
        tenTaiKhoan = ten;

    }

    // hàm tạo 2 tham số
    taiKhoan(String nS, String dc) {
        namSinh = nS;
        diaChi = dc;
    }

    // hàm tạo 3 tham số
    taiKhoan(String stk, String sD, String ngayCap) {
        soTaiKhoan = stk;
        soDu = sD;
        ngayCapThe = ngayCap;
    }
}
