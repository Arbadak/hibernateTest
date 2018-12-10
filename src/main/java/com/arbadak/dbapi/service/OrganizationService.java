package com.arbadak.dbapi.service;

import com.arbadak.dbapi.SessionUtil;
import com.arbadak.dbapi.dao.OrganizationDAO;
import com.arbadak.dbapi.entity.Organization;
import org.hibernate.Session;

import java.sql.SQLException;
import java.util.List;

public class OrganizationService extends SessionUtil implements OrganizationDAO {

    @Override
    public void add(Organization organization) throws SQLException {
        openTransactionSession();
        Session session=getSession();
        session.save(organization);
        closeTransactionSession();
    }

    @Override
    public List<Organization> getAll() throws SQLException {
        List<Organization> organizations=null;
        Session session=getSession();
        organizations = session.createCriteria(Organization.class).list();
        closeTransactionSession();
        return organizations;
    }

    @Override
    public Organization getById(Integer orgId) throws SQLException {
        Organization organization = null;
        openTransactionSession();
        Session session=getSession();
        organization = (Organization) session.get(Organization.class, orgId);
        closeTransactionSession();
        return organization;
    }

    @Override
    public void update(Organization organization) throws SQLException {
        openTransactionSession();
        Session session=getSession();
        session.update(organization);
        closeTransactionSession();

    }
}
