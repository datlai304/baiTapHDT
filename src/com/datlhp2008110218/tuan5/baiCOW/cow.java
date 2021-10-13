package com.datlhp2008110218.tuan5.baiCOW;

public class cow {
    double weight;
    double height;
    String giongLoai;
    String xuatXu;
    String thucAn;
    String mauSac;

    // hàm tạo mặc định
    cow() {
        weight = 1.0;
    }

    // hàm tạo 1 tham chiếu
    cow(String gl) {
        giongLoai = gl;
    }

    // hàm tạo 2 tham chiếu
    cow(Double w, Double h) {
        weight = w;
        height = h;
    }

    // hàm tạo 3 tham chiếu
    cow(String ms, String xs, String tA) {
        mauSac = ms;
        xuatXu = xs;
        thucAn = tA;
    }

}
