package com.arbadak.dbapi.dao;

import com.arbadak.dbapi.entity.User;

import java.sql.SQLException;
import java.util.List;

public interface UserDAO {

    ///According technical task there is no delete method neeeded, so it shall no implemented.

    ///create
    void add(User user) throws SQLException;

    ///read
    List<User> getAll(Integer officeId)throws SQLException;
    User getById(Integer id) throws SQLException;

    ///update
    void update(User user) throws SQLException;


}
