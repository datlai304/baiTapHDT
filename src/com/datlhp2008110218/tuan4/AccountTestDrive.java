package com.datlhp2008110218.tuan4;

public class AccountTestDrive 
{
    public static void main(String[] args) 
    {
        Account account;
        account = new Account(123,500);
        account.showData();
        account.napTien(500);
        account.showData();
        account.rutTien(250);
        account.showData();
        Customer customer1 = new Customer("Lại Huỳnh Phát Đạt",2002,"Nam");
        customer1.getName();
        System.out.println();
        Address address = new Address(188, "Sa Đéc","Việt Nam");
        address.showAddress();



    }
    
}
