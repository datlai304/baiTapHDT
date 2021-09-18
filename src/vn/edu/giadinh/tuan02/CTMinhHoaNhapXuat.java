package vn.edu.giadinh.tuan02;
import java.util.Scanner;

public class CTMinhHoaNhapXuat {
     public static void main(String[] args) {
        // System.out.printf("Đat Lại " + "Hello " + "Xin Chào ");
        // System.out.println(25+5);
        // System.out.print("Gia Định ");
        // System.out.println("Đào Tạo");
        // System.out.printf("%d nghề", 12);
        float diemKTLapTrinh;

        // biến tham chiếu
        //Scanner bienNhapLieu;
        //new Scanner(System.in); // đối tượng trong vùng nhớ head
        Scanner bienNhapLieu = new Scanner(System.in); // lien kết
        System.out.print("Nhap vao: ");
        diemKTLapTrinh = bienNhapLieu.nextFloat();
        System.out.println("Diem la " + diemKTLapTrinh);
        bienNhapLieu.close();

    }
    
}
