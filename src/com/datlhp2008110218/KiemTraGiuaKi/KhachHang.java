package com.datlhp2008110218.KiemTraGiuaKi;

public class KhachHang extends Nguoi{
    private String tenCongTy;
    private double giaTriHoaDon;
    
    KhachHang(String ten, String diaChi, String tenCongTy, Double giaTriHoaDon){
        super(ten, diaChi);
        this.tenCongTy = tenCongTy;
        this.giaTriHoaDon = giaTriHoaDon;
    };
    public double getGiaTriHoaDon() {
        return giaTriHoaDon;
    }
    public String getTenCongTy(){
        return tenCongTy;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString() + " Tên công ty " + getTenCongTy() + " Giá trị hóa đơn" + getGiaTriHoaDon();
    }
}
