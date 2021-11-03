package com.datlhp2008110218.tuan8.Lab5.Bai2vaBai3vsBai4;

public class SinhVienBiz extends SinhVienGD {
    private double diemMarketing;
    private double diemSale;
    private double diem;

    
    SinhVienBiz(String ten, String nganh, double diemMarketing, double diemSale){
        super(ten, nganh);
        this.diemMarketing = diemMarketing;
        this.diemSale = diemSale;
    }
    // code bai 4
    SinhVienBiz(double diemMarketing, double diemSale){
        this.diemMarketing = diemMarketing;
        this.diemSale  = diemSale;
    }
    SinhVienBiz(String nganh, String maSinhVien, String ten, double diem) {
        super(nganh, maSinhVien, ten, diem);
    }

    private double setDiem(){
        diem = ((2 * diemMarketing) + diemSale) / 3;
        return diem;
    }

    public double getDiem(){
        return setDiem();
    }


    
    
}
