package com.datlhp2008110218.tuan8.Lab4.BaiTapSanPham;

public class SanPham {
    private String ten;
    private double gia;
    private int giamGia;
    private double tienGiamGia;
    private double thueThuNhap;
    private double giaSauCung;

    SanPham() {
    }

   

    public SanPham(String t, int g) {
        ten = t;
        gia = g;
    }

    public SanPham(String t, int g, int gg) {
        ten = t;
        gia = g;
        giamGia = gg;
    }

    // thiết lập tên
    public void setTen(String ten) {
        this.ten = ten;
    }

    // lấy tên // để public để tương tác với ARRAYLIST
    public String getTen() {
        return ten;
    }

    // nhập vào giá
    public void setGia(double gia) {
        this.gia = gia;
    }

    // lấy giá // để public để tương tác với ARRAYLIST
    public double getGia() {
        return gia;
    }

    // nhập mã giảm giá
    public void setGiamGia(int giamGia) {
        this.giamGia = giamGia;
    }

    // lấy % giảm giá
    private int getGiamGia() {
        return giamGia;
    }

    // cài đặt thuế
    private double setThueThuNhap() {
        thueThuNhap = gia * 0.1;
        return thueThuNhap;
    }

    // lấy giá trị thuế
    private double getThueNhapKhau() {
        return setThueThuNhap();
    }

    // cài đặt tiền phải trả
    private double setTienSauCung() {
        tienGiamGia = (gia / 100) * giamGia;
        giaSauCung = gia - (tienGiamGia + getThueNhapKhau());
        return giaSauCung;
    }

    // lấy giá trị tiền sau cùng phải trả
    private double getTienSauCung() {
        return setTienSauCung();
    }

    // xuất ra thông tin // interface
    public void xuatThongTin() {
        System.out.println("Tên sản phẩm: " + getTen());
        System.out.printf("Giá sản phẩm: " +" %.0f" + " VNĐ\n" , getGia());
        System.out.println("Giảm giá: " + getGiamGia() + " %");
        System.out.println("Thuế 10% giá bán");
        System.out.printf("Giá sau cùng " + "%.0f" + " VNĐ\n", getTienSauCung());
        System.out.println();
    }

}
