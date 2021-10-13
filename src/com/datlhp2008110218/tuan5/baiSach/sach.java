package com.datlhp2008110218.tuan5.baiSach;

public class sach {
    String tenSach;
    String gia;
    String tenNhaXB;
    int namXB;
    String soLuong;
    String loai;

    // hàm tạo mặc định
    sach() {
        tenNhaXB = "Nhã Nam";
    }

    // ham tạo 1 tham số
    sach(int nXB) {
        namXB = nXB;
    }

    // hàm tạo 2 tham số
    sach(String tS, String g) {
        tenSach = tS;
        gia = g;

    }

    // hàm tạo 3 tham số
    sach(String tS, String sl, String l) {
        tenSach = tS;
        soLuong = sl;
        loai = l;

    }

    void showThongTin() {
        System.out.println("Tên sách: " + tenSach);
        System.out.println("Tên nhà xuất bản: " + tenNhaXB);
        System.out.println("Giá tiền: " + gia);
    }

}
