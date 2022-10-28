package com.education.dependencyInjection.carExample;

public class Car   {
    DieselEngine engine;

    public void drive(){

        String engineStart=engine.start();
        System.out.println(engineStart);
        engine.start();
    }
}
