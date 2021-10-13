package com.datlhp2008110218.tuan5.baiCOW;

public class cowTestDrive {
    public static void main(String[] args) {
        // hàm tạo mặc định
        cow conBo = new cow();
        System.out.println("Cân nặng: " + conBo.weight +" kg");
        System.out.println();

        // hàm tạo 1 tham chiếu
        cow conBo1 = new cow("Bò Sữa");
        System.out.println("Giống loài: " + conBo1.giongLoai);
        System.out.println();

        // hàm tạo 2 tham chiếu
        cow conBo2 = new cow(15.0, 2.0);
        System.out.printf("Cân nặng: " + conBo2.weight + " kg");
        System.out.println();
        System.out.printf("Chiều cao: " + conBo2.height + " m");
        System.out.println();
        System.out.println();

        // hàm tạo 3 tham chiếu
        cow conBo3 = new cow("Đen trắng", "Hà Lan và Châu Âu", "Cỏ");
        System.out.println("Màu sắc: " + conBo3.mauSac);
        System.out.println("Nguồn gốc: " + conBo3.xuatXu);
        System.out.println("Thức ăn: " + conBo3.thucAn);
        System.out.println();

    }

}
