package com.datlhp2008110218.tuan8.Lab5.Bai2vaBai3vsBai4;

import java.util.Scanner;
public abstract class SinhVienGD {
    private String ten;
    private String nganh;
    private String hocLuc;
    private double diem;
    private String maSinhVien;


    SinhVienGD(){};
    SinhVienGD(String ten, String nganh){
        this.ten = ten;
        this.nganh = nganh;
    }
    // ham tao dung cho bai 4
    SinhVienGD(String nganh, String maSinhVien,String ten, double diem){
        this.nganh = nganh;
        this.maSinhVien = maSinhVien;
        this.ten = ten;
        this.diem = diem;
    }

    public SinhVienGD(String nganh, String ten, String hocLuc) {
        this.nganh = nganh;
        this.ten = ten;
        this.hocLuc = hocLuc;
    }

    private String getTenSV(){
        return ten;
    }

    private String getNganhHoc(){
        return nganh;
    }
    abstract double getDiem();


 
    private String getHocLuc(){
        if (getDiem() < 5 ) {
            return hocLuc = "Học lực yếu";
        }
        if (getDiem() == 0) {
            return hocLuc = "Không đi học";
        }
         if (getDiem() >= 5 && getDiem() <= 6.5){
            return hocLuc ="Học lực trung bình";
        }
        if (getDiem() >= 6.5 && getDiem() < 7.5){
            return hocLuc = "Học lực khá";
        }
        if (getDiem() >= 7.5 && getDiem() <= 9){
            return hocLuc = "Học lực giỏi";
        }
        if (getDiem() >= 9){
            return hocLuc ="Học lực xuât sắc";
        }
        return hocLuc;
    }

    public void inRaManHinh(){
        System.out.println("Họ và tên: " + getTenSV());

        System.out.println("Ngành học: " + getNganhHoc());

        System.out.println("Học lực: " +getHocLuc());

    }


    public void nhapThongTin(Scanner sc) {
        System.out.print("\tNhap ngành học: ");
        nganh = sc.nextLine();
        System.out.print("\tNhap ten: ");
        ten = sc.nextLine();
        System.out.print("\tNhap học lực: ");
        hocLuc = sc.nextLine();
    }

    public void hienThiThongTin() {
        System.out.println("\tNgành: " + nganh);
        System.out.println("\tTen: " + ten);
        System.out.println("\tDiem trung binh: " + hocLuc);
    }

    @Override
    public String toString() {
        return  "Mã sinh viên: " + maSinhVien +" ... "  +  " Tên " + ten + "..." + " Diem: " + diem;
    }

}
