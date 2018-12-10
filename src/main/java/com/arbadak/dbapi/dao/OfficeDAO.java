package com.arbadak.dbapi.dao;

import com.arbadak.dbapi.entity.Office;

import java.sql.SQLException;
import java.util.List;

public interface OfficeDAO {

    ///According technical task there is no delete method neeeded, so it shall no implemented.

    ///create
    void add(Office office) throws SQLException;

    ///read
    List<Office> getbyOrgID(Integer orgId) throws SQLException;
    Office getById(Integer id) throws SQLException;

    ///update
    void update(Office office) throws SQLException;

}
