package com.datlhp2008110218.KiemTraGiuaKi;
import java.util.Scanner;

public class QuanLyTestDrive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        DanhSachQuanLi dsql = new DanhSachQuanLi();
        int num = 0;
        System.out.print("Họ và tên:  ");
        String ten = sc.nextLine();
        System.out.print("Dịa chỉ: ");
        String diaChi = sc.nextLine();
        Nguoi ng = new Nguoi(ten, diaChi);
        do {
            System.out.println("1. Thêm học viên");
            System.out.println("2. Thêm nhân viên");
            System.out.println("3. Thêm khách hàng");
            System.out.println("4. In Danh Sách");
            System.out.println("5. Kết thúc");
            System.out.print("Nhập: ");
            num = sc.nextInt();
            switch (num) {
                case 1  : sc.nextLine();
                            System.out.println("Thêm một học viên");
                           
                            System.out.println("điểm môn học 1: ");
                            float diem1 = sc.nextFloat();
                            System.out.println("điểm môn học 2: ");
                            float diem2 = sc.nextFloat();;
                            HocVien hv1 = new HocVien(ten, diaChi, diem1, diem2);
                            dsql.themNguoi(hv1);
                            break;
                case 2  :   sc.nextLine();
                            System.out.println("Nhập hệ số lương ");
                            float a = sc.nextFloat();
                            NhanVien nv = new NhanVien(a);
                            float luong = nv.setTinhLuong();
                            NhanVien nv1 = new NhanVien(ten, diaChi, luong);
                            dsql.themNguoi(nv1);
                            break;
                case 3 :   sc.nextLine();
                            System.out.println("Thêm một khách hàng");
                            System.out.println("Nhập tên công ty: ");
                            String tenCongTy = sc.nextLine();
                            System.out.println("Nhập gia tri hoá đơn: ");
                            double giaTriHoaDon = sc.nextDouble();
                            KhachHang kh = new KhachHang(ten,diaChi,tenCongTy, giaTriHoaDon);
                            dsql.themNguoi(kh);
                            break;
                case 4  :   dsql.inDanhSachQuanLi();
                            break;
                case 5  :   break;
                default :   System.out.print("Nhập lại từ 1 - 5");
    }

        } while (num >= 1 && num <= 4);
    }
}
