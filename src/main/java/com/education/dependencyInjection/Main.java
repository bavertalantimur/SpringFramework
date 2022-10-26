package com.education.dependencyInjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");

        CustomerManager manager=new CustomerManager(context.getBean("database",ICustomerDal.class));

        manager.add();
        /*
        CustomerManager manager=new CustomerManager(new CustomerDal());
        CustomerManager smanager=new CustomerManager(new MysqlCustomerDal());
        CustomerManager manager2=new CustomerManager(new MysqlCustomerDal());
         manager.add();
        smanager.add();

        manager2.add();*/
    }
}
