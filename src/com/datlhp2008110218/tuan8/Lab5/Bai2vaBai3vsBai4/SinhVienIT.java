package com.datlhp2008110218.tuan8.Lab5.Bai2vaBai3vsBai4;

public class SinhVienIT extends SinhVienGD{
    private double diemJava;
    private double diemCSS;
    private double diemHtml;
    private double diem;


    SinhVienIT(String nganh, String maSinhVien,String ten, double diem) {
        super(nganh, maSinhVien, ten, diem);
    }
    SinhVienIT(double diemJAVA,double  diemHtml,double diemCSS) {
        this.diemJava = diemJAVA;
        this.diemHtml = diemHtml;
        this.diemCSS = diemCSS;
    }

    SinhVienIT(String ten, String nganh, double diemJava, double diemCSS, double diemHtml){
        super(ten,nganh);
        this.diemJava = diemJava;
        this.diemCSS  = diemCSS;
        this.diemHtml = diemHtml;
    }

    SinhVienIT(String ten, String nganh, String hocLuc) {
        super(ten, nganh, hocLuc);
    }
    SinhVienIT( ) {};

    private double setDiem() {
        diem = ((2 * diemJava) + diemCSS + diemHtml) / 4;
        return diem;
    }

    public double getDiem(){
        return setDiem();
    }

}
