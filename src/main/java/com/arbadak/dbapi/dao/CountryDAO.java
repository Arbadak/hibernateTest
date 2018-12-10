package com.arbadak.dbapi.dao;

import com.arbadak.dbapi.entity.Country;

import java.sql.SQLException;
import java.util.List;

public interface CountryDAO {


    /// Cause this is only catalog, no list read, create or delete are needed;
    ///Read
    Country getById (Integer id) throws SQLException;


}
