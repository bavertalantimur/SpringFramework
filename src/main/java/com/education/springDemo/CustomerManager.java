package com.education.springDemo;



public class CustomerManager implements ICustomerService {



    private ICustomerDal customerDal;
    int a;
    public CustomerManager(ICustomerDal customerDal) {
        this.customerDal = customerDal;
    }



    public void add(){

        customerDal.add();

    }




}
