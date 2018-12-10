package com.arbadak.dbapi.service;

import com.arbadak.dbapi.SessionUtil;
import com.arbadak.dbapi.dao.UserDAO;
import com.arbadak.dbapi.entity.User;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import java.sql.SQLException;
import java.util.List;

public class UserService extends SessionUtil implements UserDAO {

    @Override
    public void add(User user) throws SQLException {
        openTransactionSession();
        Session session=getSession();
        session.save(user);
        closeTransactionSession();
    }

    @Override
    public List<User> getAll(Integer officeId) throws SQLException {
        List<User> user=null;
        openTransactionSession();
        Session session=getSession();
        user = (List)session.createCriteria(User.class ).createCriteria("organizationId").add(Restrictions.eq("orgId", officeId)).list();
        closeTransactionSession();
        return user;
    }

    @Override
    public User getById(Integer id) throws SQLException {
        User user = null;
        openTransactionSession();
        Session session=getSession();
        user = (User)session.get(User.class, id);
        closeTransactionSession();
        return user;
    }

    @Override
    public void update(User user) throws SQLException {
        openTransactionSession();
        Session session=getSession();
        session.update(user);
        closeTransactionSession();

    }
}
