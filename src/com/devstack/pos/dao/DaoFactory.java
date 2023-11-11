package com.devstack.pos.dao;

import com.devstack.pos.dao.custom.impl.UserDaoImpl;
import com.devstack.pos.dao.custom.impl.UserRoleDaoImpl;

public class DaoFactory {
    private DaoFactory(){}
    public enum DaoType{
        USER,
        USER_ROLE
    }
    public static <T> T getDao(DaoType type){
        switch (type){
            case USER:
                return (T) new UserDaoImpl();
            case USER_ROLE:
                return (T) new UserRoleDaoImpl();
            default:
                return null;
        }
    }
}
