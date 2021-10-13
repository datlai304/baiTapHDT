package com.datlhp2008110218.tuan5.xeOto;

public class xe {
    String tenXe;
    String tenHangXe;
    String dongXe;
    String giayPhep;
    int dungTichXang;
    String xuatXuSanXuat;

    // hàm tạo mặc định
    xe() {
        System.out.println("Xe moto của hãng Kawasaki");
    }

    // hàm tạo 1 tham số
    xe(String xSX) {
        xuatXuSanXuat = xSX;
    }

    // hàm tạo 2 tham số
    xe(String tX, String tH) {
        tenXe = tX;
        tenHangXe = tH;
    }

    // hàm tạo 3 tham số
    xe(String tX, String dX, String gp) {
        tenXe = tX;
        dongXe = dX;
        giayPhep = gp;
    }

}
