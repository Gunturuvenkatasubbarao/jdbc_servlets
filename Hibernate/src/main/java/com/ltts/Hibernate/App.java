package com.ltts.Hibernate;

import javax.security.auth.login.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Configuration cfg = new Configuration();
        cfg.Configure("hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();
        Transaction t = session.beginTransactio();
        Employee e = new Employee();
        e.setEmpid(101);
        e.setEname("subbu");
        e.setAddress("Mysore");
        t.commit();
        session.save(e);
        factory.close();
        session.close();
    }
}
