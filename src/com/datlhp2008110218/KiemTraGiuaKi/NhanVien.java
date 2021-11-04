package com.datlhp2008110218.KiemTraGiuaKi;

public class NhanVien extends Nguoi{
    private float heSoLuong;
    private float luong;
    private String tenNhanVien;
    private String diaChiNhanVien;


    NhanVien(float heSoLuong){
        this.heSoLuong = heSoLuong;
    }

    NhanVien(String hoTen, String diaChi, float heSoLuong){
        this.tenNhanVien = hoTen;
        this.diaChiNhanVien = diaChi;
        this.heSoLuong = heSoLuong;
    }


    private float getTinhHeSoLuong(){
        luong = (heSoLuong * 1500000);
        return luong;
    }
    public float getLuong() {
        return getTinhHeSoLuong();
    }

    public String getTenNhanVien() {
        return tenNhanVien;
    }

    public String getDiaChiNhanVien() {
        return diaChiNhanVien;
    }


    public float setTinhLuong(){
        return getTinhHeSoLuong();
    }

    @Override
    public String toString() {
        return "Tên nhân viên: " + getTenNhanVien() + " Địa chỉ nhân viên: " + getTenNhanVien() +
        " Lương của nhân viên: " + setTinhLuong();
    }
}
