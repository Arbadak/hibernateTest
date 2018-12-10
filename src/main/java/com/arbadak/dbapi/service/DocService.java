package com.arbadak.dbapi.service;

import com.arbadak.dbapi.SessionUtil;
import com.arbadak.dbapi.dao.DocDAO;
import com.arbadak.dbapi.entity.Doc;
import org.hibernate.Session;

import java.sql.SQLException;

public class DocService extends SessionUtil implements DocDAO {
    @Override
    public Doc getById(Integer id) throws SQLException {
        Doc doc= null;
        openTransactionSession();
        Session session = getSession();
        doc = (Doc) session.get(Doc.class, id);
        closeTransactionSession();
        return doc;
    }
}
