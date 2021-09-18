package vn.edu.giadinh.tuan02;

import java.util.Scanner;

public class Lab3Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào số lượng phần tử: ");
        int n = sc.nextInt();
        int [] a = new int [n];
        // nhap mang
        System.out.println("Nhập vào từng phàn tử của mảng: ");
        for (int i = 0; i < n; i++) {
            System.out.print("Phần tử thứ ");
            System.out.printf(" %d: ", i);
            a[i] = sc.nextInt();

        }
        System.out.println("Mảng vừa nhập là: " );
        for (int i = 0; i < n;i++) {
            System.out.printf("%d ", + a[i]);
        }
        // Sắp xếp tăng dần
        System.out.println("\nSắp xếp mảng tăng dần: ");
        for (int i = 0; i < n;i++) {
            for (int j = i + 1; j < n;j++) {
                if (a[i] > a[j]) {
                    int temp = a[i];
                    a[i]     = a[j];
                    a[j]     = temp;
                }
            }
        }
        for (int i = 0; i < n;i++) {
            System.out.printf("%d ", + a[i]);
        }
        // tìm phần tử nhỏ nhất
        System.out.println("\nPhần tử có giá trị nhỏ nhất là: ");
        int min = a[0];
        for (int i = 0; i < n;i++) {
            if (min < a[i]) {
                a[i] = min;
            }
        }
        System.out.printf("%d\n",  + min);
        /* code bị lỗi

        int tbCong = 0;
        int tong = 0, count = 1;
        for (int i  = 0; i < n; i++) {
            if (a[i] % 3 == 0) {
                    tong = tong + a[i]; 
                    count++;
            }
        }
        tbCong = tong / (count-1);
        System.out.printf("%d", tbCong);
       */ 
    }
}


    

