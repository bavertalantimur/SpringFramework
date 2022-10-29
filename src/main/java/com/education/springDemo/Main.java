package com.education.springDemo;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

    /*    ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("demoApplicationContext.xml");

        ICustomerDal customerDal=context.getBean("database", ICustomerDal.class);
        customerDal.add();*/


        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(IocConfig.class);

        /*ICustomerDal customerDal=context.getBean("database", ICustomerDal.class);
        customerDal.add();*/
        ICustomerService customerService=context.getBean("service", ICustomerService.class);
        customerService.add();




    }
}
