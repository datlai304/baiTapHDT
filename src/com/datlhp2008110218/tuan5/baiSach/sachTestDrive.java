package com.datlhp2008110218.tuan5.baiSach;

public class sachTestDrive {
    public static void main(String[] args) {
        sach book = new sach(); // ham tạo mặc định
        System.out.println("Tên nhà xuất bản: " + book.tenNhaXB);
        System.out.println();

        sach book0 = new sach(1987); // ham tạo 1 tham số
        System.out.println("Xuất bản lần đầu: " + book0.namXB);
        System.out.println();

        sach book1 = new sach("Rừng Na Uy", "128.000 VNĐ"); // hàm tạo 2 tham số
        System.out.println("Tên Sách: " + book1.tenSach);
        System.out.println("Giá tiền: " + book1.gia);
        System.out.println();

        sach book2 = new sach("Rừng Na Uy", "1 cuốn", "Văn học Nhật Bản"); // hàm tạo 3 tham số
        System.out.println("Tên sách: " + book2.tenSach);
        System.out.println("Số lượng: " + book2.soLuong);
        System.out.println("Thể loại: " + book2.loai);
        System.out.println();

    }

}
