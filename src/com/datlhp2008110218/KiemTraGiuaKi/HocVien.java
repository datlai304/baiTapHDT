package com.datlhp2008110218.KiemTraGiuaKi;

public class HocVien extends Nguoi {
    private String tenHocVien;
    private String diaChiHocVien;
    private float diemMonHoc1;
    private float diemMonHoc2;
    static  int soLuongHV = 0;
    private float diemTB;

    HocVien(){};
    HocVien(float diemMonHoc1, float diemMonHoc2){
        this.diemMonHoc1 = diemMonHoc1;
        this.diemMonHoc2 = diemMonHoc2;
    }

    HocVien(String ten, String diaChi, float diemMonHoc1, float diemMonHoc2) {
        super(ten, diaChi);
        this.diemMonHoc1 = diemMonHoc1;
        this.diemMonHoc2 = diemMonHoc2;
    }

    HocVien(String hoTen, String diaChi, float diemTB){
        super(hoTen, diaChi);
        this.diemTB = diemTB;
    }
    public String getTenHocVien() {
        return tenHocVien;
    }

    public String getDiaChiHocVien(){
        return diaChiHocVien;
    }

    private float setDiemTB(){
        diemTB = (diemMonHoc1 + diemMonHoc2) / 2;
        return diemTB;
    }
    public float getDiemTB(){
        return setDiemTB();
    }

    public void setDiemMonHoc1(float diemMonHoc1) {
        if (diemMonHoc1 >0 && diemMonHoc1 <10) {
            this.diemMonHoc1 = diemMonHoc1;
        } else  
            System.out.println("Vui lòng nhập lại");
    }
    public void setDiemMonHoc2(float diemMonHoc2) {
        if (diemMonHoc2 >0 && diemMonHoc2 <10) {
            this.diemMonHoc2 = diemMonHoc2;
        } else  
            System.out.println("Vui lòng nhập lại");
    }

    


    @Override
    public String toString() {
        return super.toString() + "Điểm trung bình: " + getDiemTB();
    }
}
