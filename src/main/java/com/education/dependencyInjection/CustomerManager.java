package com.education.dependencyInjection;

public class CustomerManager {
    private ICustomerDal customerDal;
    int a;
    public CustomerManager(ICustomerDal customerDal) {
        this.customerDal = customerDal;
    }

    public void add(){

        customerDal.add();

    }




}
