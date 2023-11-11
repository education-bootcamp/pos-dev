package com.devstack.pos.dao.custom.impl;

import com.devstack.pos.dao.custom.UserRoleDao;
import com.devstack.pos.db.HibernateUtil;
import com.devstack.pos.entity.UserRole;
import org.hibernate.Criteria;
import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.criterion.Projections;
import org.hibernate.query.Query;

import java.util.List;

public class UserRoleDaoImpl implements UserRoleDao {
    @Override
    public boolean create(UserRole userRole) {
       try(Session session = HibernateUtil.getSession()){
           session.save(userRole);
       }
       return true;
    }

    @Override
    public UserRole find(Long id) {
        return null;
    }

    @Override
    public boolean remove(Long id) {
        return false;
    }

    @Override
    public boolean modify(UserRole userRole) {
        return false;
    }

    @Override
    public List<UserRole> loadAll() {
        try(Session session= HibernateUtil.getSession()){
            Query<UserRole> userRoleQuery = session.createQuery("FROM UserRole", UserRole.class);
            return userRoleQuery.list();
        }
    }

    @Override
    public boolean isExists() {
        try(Session session= HibernateUtil.getSession()){
           /* Criteria criteria = session.createCriteria(UserRole.class);
            criteria.setProjection(Projections.rowCount());
            Long count = (Long) criteria.uniqueResult();*/
            Query query = session.createQuery("SELECT COUNT(*) FROM UserRole");
            Long count =(Long) query.getSingleResult();
            System.out.println(count);
            return count>0;
        }
    }
}
