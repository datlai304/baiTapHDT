package com.datlhp2008110218.tuan5.baiNhanVien;

public class nhanVien {
    String tenNhanVien;
    String luong;
    String diaChi;
    String boPhanLamVien;
    String ngaySinh;

    // hàm tạo mặc định
    nhanVien() {
        diaChi = "188/10 - Đồng Tháp";
    }

    // hàm tạo 1 tham số
    nhanVien(String bplv) {
        boPhanLamVien = bplv;
    }

    // hàm tạo 2 tham số
    nhanVien(String ten, String nS) {
        tenNhanVien = ten;
        ngaySinh = nS;
    }

    // hàm tạo 3 tham số
    nhanVien(String ten, String bplv, String l) {
        tenNhanVien = ten;
        boPhanLamVien = bplv;
        luong = l;
    }

}
