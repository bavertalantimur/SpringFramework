package com.education.dependencyInjection;

public class MysqlCustomerDal implements ICustomerDal{


    @Override
    public void add() {
        System.out.println("Mysql veri tabanına ekledi");
    }
}
