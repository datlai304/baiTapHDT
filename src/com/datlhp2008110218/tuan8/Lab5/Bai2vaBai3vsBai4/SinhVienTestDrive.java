package com.datlhp2008110218.tuan8.Lab5.Bai2vaBai3vsBai4;

public class SinhVienTestDrive {
    public static void main(String[] args) {
    //     SinhVienIT sinhvien = new SinhVienIT("Lại Huỳnh Phát Đạt", 7,8,9);
    //     sinhvien.inRaManHinh();
    
    SinhVienGD sinhvien = new SinhVienBiz("Đạt", "CNTT", 7, 8);
    sinhvien.inRaManHinh();
    System.out.println();
    SinhVienIT sv = new SinhVienIT("Lại Huỳnh Phát Đạt", "CNTT", 6.5, 6, 7);
    sv.inRaManHinh();
    }
}
