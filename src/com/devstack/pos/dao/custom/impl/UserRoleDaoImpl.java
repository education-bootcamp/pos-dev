package com.devstack.pos.dao.custom.impl;

import com.devstack.pos.dao.custom.UserRoleDao;
import com.devstack.pos.db.HibernateUtil;
import com.devstack.pos.entity.UserRole;
import org.hibernate.Hibernate;
import org.hibernate.Session;

import java.util.List;

public class UserRoleDaoImpl implements UserRoleDao {
    @Override
    public boolean create(UserRole userRole) {
        return false;
    }

    @Override
    public UserRole find(Integer integer) {
        return null;
    }

    @Override
    public boolean remove(Integer integer) {
        return false;
    }

    @Override
    public boolean modify(UserRole userRole) {
        return false;
    }

    @Override
    public List<UserRole> loadAll() {
        return null;
    }

    @Override
    public boolean isExists() {
        try(Session session= HibernateUtil.getSession()){
            session.get();
        }
    }
}
