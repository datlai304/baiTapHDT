package com.datlhp2008110218.tuan5.baiNhanVien;

public class nhanVienTestDrive {
    public static void main(String[] args) {
        // hàm tạo mặc định
        nhanVien nv = new nhanVien();
        System.out.println("Địa chỉ cơ sở kinh doanh: " + nv.diaChi);
        System.out.println();

        // hàm tạo 1 tham số
        nhanVien nv1 = new nhanVien("Phục vụ");
        System.out.println("Bộ phận làm việc: " + nv1.boPhanLamVien);
        System.out.println();

        // hàm tạo 2 tham số
        nhanVien nv2 = new nhanVien("Lại Huỳnh Phát Đạt", "30/04/2002");
        System.out.println("Tên nhân viên: " + nv2.tenNhanVien);
        System.out.println("Ngày sinh: " + nv2.ngaySinh);
        System.out.println();

        // hàm tạo 3 tham số
        nhanVien nv3 = new nhanVien("Lại Huỳnh Phát Đạt", "Pha Chế", "6.000.000 VNĐ");
        System.out.println("Tên nhân viên: " + nv3.tenNhanVien);
        System.out.println("Bộ phận làm việc: " + nv3.boPhanLamVien);
        System.out.println("Lương: " + nv3.luong);
        System.out.println();

    }

}
