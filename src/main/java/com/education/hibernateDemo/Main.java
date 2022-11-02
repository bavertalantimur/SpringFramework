package com.education.hibernateDemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {

        SessionFactory factory=new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(City.class)
                .buildSessionFactory();
        Session session=factory.getCurrentSession();

        try {
            session.beginTransaction();
            List<City> cities=session.createQuery("from City").getResultList();
            for(City city:cities){
                System.out.println(city.getName());
            }

            /*List<String> countrycodes=session.createQuery("select  c.countryCode from City c group by c.countryCode").getResultList();
            for (String countrycode: countrycodes){
                System.out.println(countrycode);
            }*/
            /* INSERT
            City city=new City();
            city.setName("TURKEY");
            city.setCountryCode("TR");
            city.setId(3);
            city.setDistrict("siverek");
            city.setPopulation(645656);
            session.save(city);*/

            /* DELETE
            City city=session.get(City.class,3);
            city.setName("siverek");
            city.setDistrict("turkey");*/
            /*
            City city=session.get(City.class,3);
            session.delete(city);*/

            session.getTransaction().commit();

        }finally {
            factory.close();
        }
    }
}
