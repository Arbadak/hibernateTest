package com.arbadak.dbapi.service;

import com.arbadak.dbapi.SessionUtil;
import com.arbadak.dbapi.dao.DocDataDAO;
import com.arbadak.dbapi.entity.DocData;
import org.hibernate.Session;

import java.sql.SQLException;

public class DocDataService extends SessionUtil implements DocDataDAO {

    @Override
    public void add(DocData docData) throws SQLException {
        openTransactionSession();
        Session session=getSession();
        session.save(docData);
        closeTransactionSession();
    }

    @Override
    public DocData getById(Integer id) throws SQLException {
        DocData docData = null;
        openTransactionSession();
        Session session=getSession();
        docData = (DocData) session.get(DocData.class, id);
        closeTransactionSession();
        return docData;
    }

    @Override
    public void update(DocData docData) throws SQLException {
        openTransactionSession();
        Session session=getSession();
        session.update(docData);
        closeTransactionSession();
    }
}
