package org.OJl3g.dao;

import org.OJl3g.entity.Auto;
import org.OJl3g.entity.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class AutoDAO {

    public void create(Auto auto) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.persist(auto);
        transaction.commit();
        session.close();
    }

    public Auto read(int id) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Auto auto = (Auto) session.get(Auto.class, id);
        transaction.commit();
        session.close();
        return auto;
    }

    public void update(Auto auto) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.merge(auto);
        transaction.commit();
        session.close();
    }

    public void delete(Auto auto) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        auto = session.merge(auto);
        session.remove(auto);
        transaction.commit();
        session.close();
    }
}
