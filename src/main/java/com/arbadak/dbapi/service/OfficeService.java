package com.arbadak.dbapi.service;

import com.arbadak.dbapi.SessionUtil;
import com.arbadak.dbapi.dao.OfficeDAO;
import com.arbadak.dbapi.entity.Office;
import com.arbadak.dbapi.entity.Organization;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class OfficeService  extends SessionUtil implements OfficeDAO {

    @Override
    public void add(Office office) throws SQLException {
    openTransactionSession();
    Session session=getSession();
    session.save(office);
    closeTransactionSession();
    }

    @Override
    public List<Office> getbyOrgID(Integer orgId) throws SQLException {
        List<Office> office=null;
        openTransactionSession();
        Session session=getSession();
      //  office = session.createCriteria(Office.class).list();
        //office = (List<Office>) session.createCriteria(Office.class ).add(Restrictions.eq("organizationId", orgId)).uniqueResult();
        office = (List)session.createCriteria(Office.class ).createCriteria("organizationId").add(Restrictions.eq("orgId", orgId)).list();
       /* for(Iterator<Office> iterator=office.iterator(); iterator.hasNext();){
            Integer currentOfficeOrgId=iterator.next().getOrganizationId().getOrgId();
            if(currentOfficeOrgId!=orgId){ iterator.remove();}
        }*/
    closeTransactionSession();
        return office;
    }

    @Override
    public Office getById(Integer id) throws SQLException {
    Office office = null;
    openTransactionSession();
    Session session=getSession();
    office = (Office)session.get(Office.class, id);
    closeTransactionSession();
        return office;
    }

    @Override
    public void update(Office office) throws SQLException {
        openTransactionSession();
        Session session=getSession();
        session.update(office);
        closeTransactionSession();
    }
}