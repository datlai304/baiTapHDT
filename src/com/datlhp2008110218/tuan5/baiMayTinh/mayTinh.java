package com.datlhp2008110218.tuan5.baiMayTinh;

public class mayTinh {
    String tenNhaSanXuat;
    String namSanXuat;
    String heDieuHanh;
    String ram;
    String cpu;
    String gia;
    String namBaoHanh;

    // hàm tạo mặc định
    mayTinh() {
        namBaoHanh = "2 năm";
    }

    // hàm tạo 1 tham số
    mayTinh(String g) {
        gia = g;
    }

    // hàm tạo 2 tham số
    mayTinh(String nsx, String n) {
        tenNhaSanXuat = nsx;
        namSanXuat = n;

    }

    // hàm tạo 3 tham số
    mayTinh(String hdh, String c, String r) {
        heDieuHanh = hdh;
        cpu = c;
        ram = r;
    }

}
