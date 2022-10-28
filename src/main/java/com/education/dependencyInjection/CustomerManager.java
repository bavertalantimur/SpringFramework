package com.education.dependencyInjection;

public class CustomerManager implements ICustomerService {



    private ICustomerDal customerDal;
    int a;
    public CustomerManager(ICustomerDal customerDal) {
        this.customerDal = customerDal;
    }

    // setter injection
    /* public void setCustomerDal(ICustomerDal customerDal){
    this.customerDal=customerDal;
    }
     */

    public void add(){

        customerDal.add();

    }




}
