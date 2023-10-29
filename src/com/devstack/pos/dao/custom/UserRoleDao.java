package com.devstack.pos.dao.custom;

import com.devstack.pos.dao.CrudDao;
import com.devstack.pos.entity.UserRole;

public interface UserRoleDao extends CrudDao<UserRole,Long> {
    public boolean isExists();
}
