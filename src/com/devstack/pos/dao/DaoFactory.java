package com.devstack.pos.dao;

import com.devstack.pos.dao.custom.impl.UserDaoImpl;

public class DaoFactory {
    private DaoFactory(){}
    public enum DaoType{
        USER
    }
    public static <T> T getDao(DaoType type){
        switch (type){
            case USER:
                return (T) new UserDaoImpl();
            default:
                return null;
        }
    }
}
