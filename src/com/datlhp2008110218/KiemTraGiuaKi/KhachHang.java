package com.datlhp2008110218.KiemTraGiuaKi;

public class KhachHang extends Nguoi{
    private String tenCongTy;
    private double giaTriHoaDon;
    
    KhachHang(String tenCongTy, Double giaTriHoaDon){
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
        return "Tên Công ty: " + getTenCongTy() +" Hóa đơn của khách hàng: " + getGiaTriHoaDon() +" VNĐ";
    }
}
