package com.arbadak.dbapi;
import com.arbadak.dbapi.entity.Country;
import com.arbadak.dbapi.entity.Office;
import com.arbadak.dbapi.entity.Organization;
import com.arbadak.dbapi.service.CountryService;
import com.arbadak.dbapi.service.OfficeService;
import com.arbadak.dbapi.service.OrganizationService;
import org.hibernate.SessionFactory;

import java.awt.*;
import java.util.List;


public class Main {

    public static void main(String[] args) {
/*
        //SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        OrganizationService organizationService = new OrganizationService();
        CountryService countryService = new CountryService();
        OfficeService officeService = new OfficeService();

        Organization oorg = new Organization();
        oorg.setInn(787878);
        oorg.setKpp(898989);
        oorg.setNameOfOranization("Полноименноя организация ");
        oorg.setShortNameOfOranization("ОООрг");

        Office ofce=new Office();

        ofce.setActive(true);
        ofce.setAddress("Колотушкина 55");
        ofce.setMain(true);
        ofce.setOfficeName("Колотушкино-великий");
        ofce.setPhoneOffice(245847);
        ofce.setOrganizationId(oorg);

        try {
            ///System.out.println(countryService.getById(1).toString());
           // List<Office> zz=officeService.getbyOrgID(2);
          //  System.out.println(officeService.getbyOrgID(2));
            organizationService.add(oorg);
            officeService.add(ofce);
        } catch (Exception e) {
            e.printStackTrace();
        }
        */



    }
}
