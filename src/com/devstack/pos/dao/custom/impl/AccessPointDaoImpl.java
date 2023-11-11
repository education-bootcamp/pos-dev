package com.devstack.pos.dao.custom.impl;

import com.devstack.pos.dao.custom.AccessPointDao;
import com.devstack.pos.db.HibernateUtil;
import com.devstack.pos.entity.AccessPoint;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class AccessPointDaoImpl implements AccessPointDao {
    @Override
    public boolean create(AccessPoint accessPoint) {
        try(Session session= HibernateUtil.getSession()){
            Transaction transaction = session.beginTransaction();
            session.save(accessPoint);
            transaction.commit();
            return true;
        }
    }

    @Override
    public AccessPoint find(Long aLong) {
        return null;
    }

    @Override
    public boolean remove(Long aLong) {
        return false;
    }

    @Override
    public boolean modify(AccessPoint accessPoint) {
        return false;
    }

    @Override
    public List<AccessPoint> loadAll() {
        return null;
    }
}
