package vn.edu.giadinh.tuan02;

//import java.util.Scanner;

public class Lab3Bai2 {
    public static void main(String[] args) {
        System.out.println("============BẢNG CỬU CHƯƠNG============)");
        for (int i = 1; i <= 10;i++) {
            System.out.println("Bảng cửu chương "+ i);
            for (int j = 1; j <= 10; j++) {
                System.out.printf("%d x %d = %d\n", +i, +j, j * i);
            }
            System.out.println();

        }

    }
    
}
