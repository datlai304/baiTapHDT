package com.datlhp2008110218.tuan5.xeOto;

public class xeTestDrive {
    public static void main(String[] args) {
        // hàm tạo mặc định
        xe chiecXe = new xe();
        System.out.println();

        // hàm tạo 1 tham số
        xe chiecXe1 = new xe("Nhật Bản");
        System.out.println("Quốc gia sản xuất: " + chiecXe1.xuatXuSanXuat);
        System.out.println();

        // hàm tạo 2 tham số;
        xe chiecXe2 = new xe("Kawasaki Ninja H2R", "Kawasaki");
        System.out.println("Tên xe: " + chiecXe2.tenXe);
        System.out.println("Hãng sãn xuất: " + chiecXe2.tenHangXe);
        System.out.println();

        // hàm tạo 3 tham số
        xe chiecXe3 = new xe("Kawasaki Ninja H2R", "Xe Moto", "Có");
        System.out.println("Tên xe: " + chiecXe3.tenXe);
        System.out.println("Dòng xe: " + chiecXe3.dongXe);
        System.out.println("Giáy phép: " + chiecXe3.giayPhep);
        System.out.println();
    }

}
