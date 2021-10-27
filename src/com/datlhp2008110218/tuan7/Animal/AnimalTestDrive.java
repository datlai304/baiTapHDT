package com.datlhp2008110218.tuan7.Animal;

import java.util.Scanner;

public class AnimalTestDrive {
    public static void main(String[] args) {
        Hippo hippo = new Hippo();
        Dog dog = new Dog();
        Wolf wolf = new Wolf();
        Cat cat = new Cat();
        Lion lion = new Lion();
        Tiger tiger = new Tiger();
        System.out.println("1.Dog");
        System.out.println("2.Wolf");
        System.out.println("3.Cat");
        System.out.println("4.Lion");
        System.out.println("5.Tiger");
        System.out.println("6.Hippo");
        System.out.print("Vui lòng nhấp chuột vào một số: ");
        Scanner sc = new Scanner(System.in);
        int menu = sc.nextInt();
        sc.close();
        System.out.println();

        if (menu == 1) {
            dog.hinhAnh();
            dog.nhomLoai();
            dog.tiengKeu();
            dog.roam();
            dog.an();
            dog.ngu();
            dog.moiTruongSinhSong();
            dog.giuNha();
            System.out.println();
        }

        if (menu == 2) {
            wolf.hinhAnh();
            wolf.nhomLoai();
            wolf.tiengKeu();
            wolf.roam();
            wolf.an();
            wolf.ngu();
            wolf.moiTruongSinhSong();
            wolf.dacDiemNhanBiet();
            System.out.println();
        }

        if (menu == 3) {
            cat.hinhAnh();
            cat.nhomLoai();
            cat.tiengKeu();
            cat.roam();
            cat.an();
            cat.ngu();
            cat.moiTruongSinhSong();
            cat.batChuot();
            System.out.println();
        }

        if (menu == 4) {
            lion.hinhAnh();
            lion.nhomLoai();
            lion.tiengKeu();
            lion.roam();
            lion.an();
            lion.ngu();
            lion.moiTruongSinhSong();
            lion.dacDiemNhanBiet();
            System.out.println();
        }

        if (menu == 5) {
            tiger.hinhAnh();
            tiger.nhomLoai();
            tiger.tiengKeu();
            tiger.roam();
            tiger.an();
            tiger.ngu();
            tiger.moiTruongSinhSong();
            tiger.dacDiemNhanBiet();
            System.out.println();
        }

        if (menu == 6) {
            hippo.hinhAnh();
            hippo.tiengKeu();
            hippo.roam();
            hippo.an();
            hippo.ngu();
            hippo.moiTruongSinhSong();
            hippo.soThich();
        }
    }
}
