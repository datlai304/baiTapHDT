package com.datlhp2008110218.lab1;

import java.util.Scanner;

public class Lab1Bai1 {
    public static void main(String[] args) {
        Scanner dieuKhien;
        dieuKhien = new Scanner(System.in);
        System.out.println("Họ Và Tên: ");
        String hoTen = dieuKhien.nextLine();
        System.out.println("Điểm Trung Binh: ");
        double diemTB = dieuKhien.nextDouble();
        System.out.printf("%s %.2f", hoTen , diemTB);
        dieuKhien.close();
    }
    
}
