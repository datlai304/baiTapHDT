package vn.edu.giadinh.tuan02;

import java.util.Scanner;

public class Lab1Bai4 {
    public static void main(String[] args) 
    {
        int a, b, c;
        double delta, ketQua;
        Scanner tinhDelta;
        tinhDelta = new Scanner(System.in);
        System.out.println("Nhao vao a: ");
        a = tinhDelta.nextInt();
        System.out.println("Nhap vao b:");
        b = tinhDelta.nextInt();
        System.out.println("Nhap vao c:");
        c = tinhDelta.nextInt();
        delta = Math.pow(b,2) - (4*a*c);
        ketQua = Math.sqrt(delta);
        System.out.println("Can bac hai cua delta la: " + ketQua);
        tinhDelta.close();
    }
    
}
