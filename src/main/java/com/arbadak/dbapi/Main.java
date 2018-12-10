package com.arbadak.dbapi;
import com.arbadak.dbapi.entity.Country;
import com.arbadak.dbapi.entity.Office;
import com.arbadak.dbapi.service.CountryService;
import com.arbadak.dbapi.service.OfficeService;
import org.hibernate.SessionFactory;

import java.awt.*;
import java.util.List;


public class Main {

    public static void main(String[] args) {

        //SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

        CountryService countryService = new CountryService();
        OfficeService officeService = new OfficeService();


        try {
            ///System.out.println(countryService.getById(1).toString());
           // List<Office> zz=officeService.getbyOrgID(2);
          //  System.out.println(officeService.getbyOrgID(2));
            System.out.println(officeService.getById(4));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
