package com.datlhp2008110218.lab2;

import java.util.Scanner;


public class Lab2Bai2 {
    public static void main(String[] args) {
        Scanner giaiPTBac2 = new Scanner(System.in);
        System.out.println("Nhập vào a: ");
        double a = giaiPTBac2.nextDouble();
        System.out.println("Nhập vào b: ");
        double b = giaiPTBac2.nextDouble();
        System.out.println("Nhập vào c: ");
        double c = giaiPTBac2.nextDouble();
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phương trình vô sô nghiệm");
            }else {
                double nghiemPT1 = (-c/b);
                System.out.print("Phương trình có nghiêm là: ");
                System.out.printf("%.2f", + nghiemPT1);
            }
        } if(a != 0) {
            double delta = Math.pow(b,2) - (4*a*c);
            if (delta < 0) {
                System.out.println("Phương trình vô nghiệm");
            }
            if (delta == 0) {
                double nghiemKep = - b / (2 * a);
                System.out.println("Phương trình có nghiệm là: " + nghiemKep);
            }
            if (delta > 0) {
                double nghiemX1 = (-b + Math.sqrt(delta)) / (2 * a);
                double nghiemX2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.printf("Phuong trinh co 2 nghiem la:  ");
                System.out.printf("%.2f và", +nghiemX1);
                System.out.printf(" %.2f", +nghiemX2);            }

        }
        giaiPTBac2.close();
    }
    
}
