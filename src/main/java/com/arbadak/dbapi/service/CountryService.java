package com.arbadak.dbapi.service;

import com.arbadak.dbapi.SessionUtil;
import com.arbadak.dbapi.dao.CountryDAO;
import com.arbadak.dbapi.entity.Country;
import org.hibernate.Session;

import java.sql.SQLException;

public class CountryService  extends SessionUtil implements CountryDAO {


    @Override
    public Country getById(Integer id) throws SQLException {
        Country country = null;
        openTransactionSession();
        Session session = getSession();
        country = (Country) session.get(Country.class, id);
        closeTransactionSession();
        return country;
    }
}
