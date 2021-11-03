package com.datlhp2008110218.tuan8.Lab4.BaiTapSanPham;

import java.util.ArrayList;

public class SanPhamTest {
    public static void main(String[] args) {
        SanPham sp1 = new SanPham();
        sp1.setTen("Áo");
        sp1.setGia(300000);
        sp1.setGiamGia(5);
        sp1.xuatThongTin();
        System.out.println();

        SanPham sp2 = new SanPham();
        sp2.setTen("Giày");
        sp2.setGia(550000);
        sp2.setGiamGia(3);
        sp2.xuatThongTin();
        System.out.println();


        SanPham sp3 = new SanPham("Balo", 350000, 5);
        SanPham sp4 = new SanPham("Nón", 150000);
        sp3.xuatThongTin();
        System.out.println();
        sp4.xuatThongTin();
       

        System.out.println();

       

        ArrayList<SanPham> list = new ArrayList<>();
        SanPham sp5 = new SanPham("Dép", 150000);
        SanPham sp6 = new SanPham("Áo thun", 250000);
        SanPham sp7 = new SanPham("Quần", 350000);
        SanPham sp8 = new SanPham("Váy", 450000);
        SanPham sp9 = new SanPham("Túi xách", 550000);

        list.add(sp5);
        list.add(sp6);
        list.add(sp7);
        list.add(sp8);
        list.add(sp9);
     

        for (SanPham spm : list)
            spm.xuatThongTin();
    }
}
