package com.education.dependencyInjection;

public class Main {
    public static void main(String[] args) {
        CustomerManager manager=new CustomerManager(new CustomerDal());

        CustomerManager smanager=new CustomerManager(new MysqlCustomerDal());
        CustomerManager manager2=new CustomerManager(new MysqlCustomerDal());
        smanager.add();
        manager.add();
        manager2.add();
    }
}
