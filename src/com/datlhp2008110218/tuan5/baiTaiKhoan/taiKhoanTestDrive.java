package com.datlhp2008110218.tuan5.baiTaiKhoan;

public class taiKhoanTestDrive {
    public static void main(String[] args) {
        // hàm tạo mặc định
        taiKhoan tk = new taiKhoan();
        System.out.println("Tên ngân hàng: " + tk.tenNganHang);
        System.out.println();

        // hàm tạo 1 tham số
        taiKhoan tk1 = new taiKhoan("Lại Huỳnh Phát Đạt");
        System.out.println("Tên khách hàng: " + tk1.tenTaiKhoan);
        System.out.println();

        // hàm tạo 2 tham số
        taiKhoan tk2 = new taiKhoan("30/04/2002", "188/10 - Đồng Tháp");
        System.out.println("Ngày Sinh: " + tk2.namSinh);
        System.out.println("Địa chỉ: " + tk2.diaChi);
        System.out.println();

        // hàm tạo 3 tham số
        taiKhoan tk3 = new taiKhoan("0236787909", "200.000 VNĐ", "01/07/2020");
        System.out.println("Số tài khoản: " + tk3.soTaiKhoan);
        System.out.println("Số dư: " + tk3.soDu);
        System.out.println("Ngày cấp thẻ: " + tk3.ngayCapThe);
        System.out.println();

    }

}
