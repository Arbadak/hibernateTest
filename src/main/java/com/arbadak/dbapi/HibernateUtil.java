package com.arbadak.dbapi;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil
{
/*    private static SessionFactory sessionFactory =null;

   static {
        try {
            //creates the session factory from hibernate.cfg.xml
            sessionFactory = new Configuration().configure().buildSessionFactory();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }*/

    private static final  SessionFactory sessionFactory = buildSessionFactory();

    private static SessionFactory buildSessionFactory(){

        try { return new  Configuration().configure().buildSessionFactory(); }
        catch (Throwable e) {
            System.err.println("*******Startup SessionFactory problem: "+e);
            throw new ExceptionInInitializerError(e);
        }
    }
    public static SessionFactory getSessionFactory() { return sessionFactory; }

    public static void shutdown() {getSessionFactory().close();}
}