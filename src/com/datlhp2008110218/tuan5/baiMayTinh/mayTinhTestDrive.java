package com.datlhp2008110218.tuan5.baiMayTinh;

public class mayTinhTestDrive {
    public static void main(String[] args) {
        // hàm tạo mặc định
        mayTinh mt = new mayTinh();
        System.out.println("Năm bảo hành: " + mt.namBaoHanh);
        System.out.println();

        // hàm tạo 1 tham số
        mayTinh mt1 = new mayTinh("24.000.000 VNĐ");
        System.out.println("Giá tiền: " + mt1.gia);
        System.out.println();

        // hàm tạo 2 tham số
        mayTinh mt2 = new mayTinh("Acer", "2021");
        System.out.println("Nhà sản xuất: " + mt2.tenNhaSanXuat);
        System.out.println("Năm sản xuất: " + mt2.namSanXuat);
        System.out.println();

        // hàm tạo 3 tham số
        mayTinh mt3 = new mayTinh("Window 10", "Intel Core i5-11300H", "8 GB, 3200MHz");
        System.out.println("Hệ điều hành: " + mt3.heDieuHanh);
        System.out.println("CPU: " + mt3.cpu);
        System.out.println("RAM: " + mt3.ram);
        System.out.println();
    }

}
