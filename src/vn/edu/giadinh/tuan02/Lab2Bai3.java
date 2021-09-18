package vn.edu.giadinh.tuan02;

import java.util.Scanner;

public class Lab2Bai3 {
    public static void main(String[] args)
    {
        Scanner tinhDien = new Scanner(System.in);
        System.out.println("Nhập vào số điện sử dụng ");
        double soDienSuDung = tinhDien.nextDouble();
        if (soDienSuDung <= 50) {
            double giaTien = soDienSuDung * 1000;
            System.out.print("Số tiền điện tháng này là: ");
            System.out.printf("%.0f", + giaTien);
            System.out.print(" VND");
        } else {
            double giaTien = 50 * 1000 + ((soDienSuDung - 50) * 1200);
            System.out.println("Số tiền điện tháng này là: ");
            System.out.printf("%.0f", + giaTien);
            System.out.print(" VND");
        }
        tinhDien.close();
        
    }
    
}
