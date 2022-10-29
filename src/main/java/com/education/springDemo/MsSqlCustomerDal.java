package com.education.springDemo;


import org.springframework.stereotype.Component;
// compponent (database) tek yerde çalışır Mysql vermiş olursak main de çalıştırıken hata veririd

//@Component("database")
public class MsSqlCustomerDal  implements  ICustomerDal{
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

        System.out.println("MsSql veri tabanına ekledi");
    }
}
