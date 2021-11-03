package com.datlhp2008110218.tuan8.Lab5.Bai2vaBai3vsBai4;

import java.util.ArrayList;

public class DanhSachSinhVien {
    private ArrayList<SinhVienGD> danhSach;


    DanhSachSinhVien(){
        danhSach = new ArrayList<SinhVienGD>();
    }

    DanhSachSinhVien(ArrayList<SinhVienGD> danhSach) {
        this.danhSach = danhSach;
    }
    public void themSinhVien(SinhVienGD sv) {
        this.danhSach.add(sv);
    }

    public void inDanhSachSinhVien() {
        for (SinhVienGD sinhVien : danhSach) {
            System.out.println(sinhVien);
        }
    }

    // public void xuatDSSVHocLucGioi (){
    //     for (SinhVienGD sinhVien : danhSach) {
    //         if (sinhVien.getDiem() >= 7.5 && sinhVien.getDiem() <= 9 ) {
    //             System.out.println("sinhVien");
    //         }
    //     }
    // }

//     public void sapXepTheoDiem(){
//         Collections.sort(this.danhSach, new Comparator<SinhVienGD>() {
            
//         };
}
    
    

