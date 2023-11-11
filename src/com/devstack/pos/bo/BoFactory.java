package com.devstack.pos.bo;

import com.devstack.pos.bo.custom.impl.UserBoImpl;
import com.devstack.pos.bo.custom.impl.UserRoleBoImpl;
import com.devstack.pos.dao.custom.impl.UserDaoImpl;

public class BoFactory {
    private BoFactory(){}
    public enum BoType{
        USER,USER_ROLE
    }
    public static <T> T getBo(BoType type){
        switch (type){
            case USER:
                return (T) new UserBoImpl();
            case USER_ROLE:
                return (T) new UserRoleBoImpl();
            default:
                return null;
        }
    }
}
