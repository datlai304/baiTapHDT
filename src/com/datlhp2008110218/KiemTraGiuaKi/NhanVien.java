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
        super(hoTen, diaChi);
        this.heSoLuong = heSoLuong;
    }


    public float getHeSoLuong() {
        return heSoLuong;
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
        return super.toString() + "Lương: " + getHeSoLuong() +" VNĐ";
    }
}
