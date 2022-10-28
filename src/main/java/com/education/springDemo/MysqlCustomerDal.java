package com.education.springDemo;


public class MysqlCustomerDal implements ICustomerDal {
    String connectionString;
    public String getConnectionString() {
        return connectionString;
    }

    public void setConnectionString(String connectionString) {
        this.connectionString = connectionString;
    }


    @Override
    public void add() {
        System.out.println("Connection String: "+this.connectionString);

        System.out.println("Mysql veri tabanına ekledi");
    }
}