package com.arbadak.dbapi.dao;

import com.arbadak.dbapi.entity.Doc;

import java.sql.SQLException;

public interface DocDAO {

        /// Cause this is only catalog, no list read, create or delete are needed;

        ///Read
        Doc getById (Integer id) throws SQLException;
    }



