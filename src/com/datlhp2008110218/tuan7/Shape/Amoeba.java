package com.datlhp2008110218.tuan7.Shape;

public class Amoeba extends Shape {

    private String nameFile;
    private int toaDoX;
    private int toaDoY;

    Amoeba(String n, int x, int y) {
        nameFile = n;
        toaDoX = x;
        toaDoY = y;
    }

    protected void hinhDang() {
        System.out.println("Đây là một hình kiểu Amoeba");
    }

    protected void xoay() {
        System.out.printf("Hình quay theo tọa độ x = " + toaDoX + " và y = " + toaDoY + "\n");
    }

    protected void nameFileMusic() {
        System.out.println("Mở file âm thanh: " + nameFile);
    }
}
