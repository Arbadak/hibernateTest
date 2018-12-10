package com.arbadak.dbapi.dao;

import com.arbadak.dbapi.entity.Organization;

import java.sql.SQLException;
import java.util.List;

public interface OrganizationDAO {

    ///According technical task there is no delete method neeeded, so it shall no implemented.

    //create
    void add (Organization organization) throws SQLException;

    ///read
    List<Organization> getAll() throws SQLException;
    Organization getById (Integer id) throws SQLException;

    ///update

    void update(Organization organization) throws SQLException;


}
