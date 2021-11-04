package com.datlhp2008110218.KiemTraGiuaKi;

public class Nguoi {
    private String hoTen;
    private String diaChi;

    Nguoi(){};
    Nguoi(String hoTen, String diaChi){
        this.hoTen = hoTen;
        this.diaChi = diaChi;
    }



    @Override
    public String toString() {
        return "Họ tên: " + hoTen + "Địa Chỉ:  " + diaChi;
    }
}
