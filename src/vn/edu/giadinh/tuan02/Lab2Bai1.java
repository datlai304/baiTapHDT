package vn.edu.giadinh.tuan02;

import java.util.Scanner;

public class Lab2Bai1 {
    public static void main(String[] args) {
        Scanner giaiPTBac1 = new Scanner(System.in);
        System.out.println("Nhập vào a: ");
        int a = giaiPTBac1.nextInt();   
        System.out.println("Nhập vào b: ");    
        int b = giaiPTBac1.nextInt();
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phương trình có vô sô nghiệm");
            } else {
                System.out.println("Phương trình vô nghiệm");
            }
        } else {
            double nghiem = (double) - b / a;
            System.out.println("Phương trình có nghiệm: ");
            System.out.printf("%.2f", nghiem);
        }
        giaiPTBac1.close();
}





}