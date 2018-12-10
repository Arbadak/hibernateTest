package com.arbadak.dbapi.dao;

import com.arbadak.dbapi.entity.DocData;

import java.sql.SQLException;

public interface DocDataDAO {

/// Slave table, cause this no delete or list function needed

    ///Create
    void add(DocData docData) throws SQLException;

    ///read
    DocData getById (Integer id) throws SQLException;

    ///Update
    void  update (DocData docData) throws SQLException;

}
