package com.datlhp2008110218.tuan7.Shape;

public class ShapeTestDrive {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Triangle triangle = new Triangle();
        Square square = new Square();
        Amoeba amoeba = new Amoeba(".hif", 25, 36);

        circle.hinhDang();
        circle.xoay();
        circle.nameFileMusic();
        circle.playMusic();
        System.out.println();

        triangle.hinhDang();
        triangle.xoay();
        triangle.nameFileMusic();
        triangle.playMusic();
        System.out.println();

        square.hinhDang();
        square.xoay();
        square.nameFileMusic();
        square.playMusic();
        System.out.println();

        amoeba.hinhDang();
        amoeba.xoay();
        amoeba.nameFileMusic();
        amoeba.playMusic();

    }
}
