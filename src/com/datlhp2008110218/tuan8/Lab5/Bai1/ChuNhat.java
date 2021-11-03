package com.datlhp2008110218.tuan8.Lab5.Bai1;

public class ChuNhat {
    private double rong;
    private double dai;
    private double chuVi;
    private double dienTich;

    ChuNhat(double dai, double rong){
        this.dai = dai;
        this.rong = rong;
    }

    // public void setRong(double rong) {
    //     this.rong = rong;
    // }

    // private double getRong() {
    //     return rong;
    // }

    // public void setDai(double dai) {
    //     this.dai = dai;
    // }

    // private double getDai() {
    //     return dai;
    // }

    private double setChuVi(){
        chuVi = (dai + rong) * 2;
        return chuVi;
    }

    public double getChuVi(){
        return setChuVi();
    }

    private double setDienTich(){
        dienTich = (dai * rong);
        return dienTich;
    }

    public double getDienTich(){
        return setDienTich();
    }

    public void xuatRaManHinh(){
        System.out.println("Chu vi 2 cạnh là: " + getChuVi());
        System.out.println("Diện tích 2 cạnh là: " + getDienTich());
    }

}
