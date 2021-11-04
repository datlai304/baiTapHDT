package com.datlhp2008110218.KiemTraGiuaKi;
import java.util.ArrayList;

public class DanhSachQuanLi {
    private ArrayList<Nguoi> danhSach;

    DanhSachQuanLi(){
        danhSach = new ArrayList<Nguoi>();
    }

    DanhSachQuanLi(ArrayList<Nguoi> danhSach) {
        this.danhSach = danhSach;
    }
    public void themNguoi(Nguoi ng) {
        this.danhSach.add(ng);
    }

    public void inDanhSachQuanLi() {
        for (Nguoi nguoi : danhSach) {
            System.out.println(nguoi);
        }
    }


}
