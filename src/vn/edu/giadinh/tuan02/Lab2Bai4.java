package vn.edu.giadinh.tuan02;

import java.util.Scanner;

public class Lab2Bai4 {
    public static void main(String[] args) { 
        int num = 0; // lệnh chọn
        do {
        System.out.println("===========MENU===========");
        System.out.println("1. Giải phương trình bậc nhất");
        System.out.println("2. Giải phương trình bậc 2");
        System.out.println("3. Tính tiền điện");
        System.out.println("4. Thoát");              
        System.out.print("Vui lòng chọn chương trình thực hiện:");
        Scanner menu = new Scanner(System.in);
        num = menu.nextInt();
                switch (num) {
                    case    1   :   System.out.println("Chương trình Phương trình bậc nhất: "); 
                                    giaiPTBac1();
                                    break;
                    case    2   :   System.out.println("Chương trình bậc hai: ");  
                                    giaiPTBac2(); 
                                    break;
                    case    3   :   System.out.println("Chương trình tính tiền điện: "); 
                                    tinhTienDien();
                                    break;
                    case    4   :   System.out.println("Kết thúc chương trình");
                                    break;

                    default     :   System.out.println("Hãy Chọn lại"); break;
                }  

            } while (num >= 1 && num <=3);  
        } 


// hàm pt bậc nhất
    public static void giaiPTBac1() {
            Scanner giaiPTBac1 = new Scanner(System.in);
            System.out.print("Nhập vào a: ");
            int a = giaiPTBac1.nextInt();   
            System.out.print("Nhập vào b: ");    
            int b = giaiPTBac1.nextInt();
            if (a == 0) {
                if (b == 0) {
                    System.out.println("Phương trình có vô sô nghiệm");
                } else {
                    System.out.println("Phương trình vô nghiệm");
                }
            } else {
                double nghiem = (double) - b / a;
                System.out.print("Phương trình có nghiệm: ");
                System.out.printf("%.2f\n", + nghiem);
            }
    }


// hàm pt bậc 2
    public static void giaiPTBac2() {
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
                System.out.printf("%.2f\n", + nghiemPT1);
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
                System.out.printf("Phuong trinh co 2 nghiem la: ");
                System.out.printf("%.2f và", +nghiemX1);
                System.out.printf(" %.2f\n", +nghiemX2);            }

        }
    }   
// hàm tính tiền điện
    public static void tinhTienDien() 
    {
        Scanner tienDien = new Scanner(System.in);
        System.out.println("Nhập vào số điện sử dụng ");
        double soDienSuDung = tienDien.nextDouble();
        if (soDienSuDung <= 50) {
            double giaTien = soDienSuDung * 1000;
            System.out.print("Số tiền điện tháng này là: ");
            System.out.printf("%.0f", + giaTien);
            System.out.print(" VND\n");
        } else {
            double giaTien = 50 * 1000 + ((soDienSuDung - 50) * 1200);
            System.out.println("Số tiền điện tháng này là: ");
            System.out.printf("%.0f", + giaTien);
            System.out.print(" VND\n");
        }
    }    
}
