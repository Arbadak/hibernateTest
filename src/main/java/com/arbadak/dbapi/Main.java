package com.arbadak.dbapi;
import com.arbadak.dbapi.entity.Country;
import com.arbadak.dbapi.service.CountryService;
import org.hibernate.SessionFactory;


public class Main {

    public static void main(String[] args) {

        //SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

        CountryService countryService = new CountryService();

        try {
            System.out.println(countryService.getById(1).toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
