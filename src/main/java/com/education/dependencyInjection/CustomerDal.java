package com.education.dependencyInjection;

public class CustomerDal implements ICustomerDal {
    public void add(){
        System.out.println("Oracle veritabanı eklendi");
    }
}
