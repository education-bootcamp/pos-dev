package com.devstack.pos.dao.custom;

import com.devstack.pos.dao.CrudDao;
import com.devstack.pos.entity.User;
import com.devstack.pos.util.ResponseData;

public interface UserDao extends CrudDao<User,Long> {
    public ResponseData login(String username, String password);
}
