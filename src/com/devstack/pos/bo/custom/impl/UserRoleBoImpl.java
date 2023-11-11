package com.devstack.pos.bo.custom.impl;

import com.devstack.pos.bo.custom.UserRoleBo;
import com.devstack.pos.dao.DaoFactory;
import com.devstack.pos.dao.custom.UserRoleDao;
import com.devstack.pos.dto.UserRoleDto;
import com.devstack.pos.entity.UserRole;

import java.util.ArrayList;
import java.util.List;

public class UserRoleBoImpl implements UserRoleBo {
    private UserRoleDao userRoleDao= DaoFactory.getDao(DaoFactory.DaoType.USER_ROLE);
    @Override
    public List<UserRoleDto> loadAllUserRoles() {
        List<UserRoleDto> userRoleDtos = new ArrayList<>();
        for (UserRole roles:userRoleDao.loadAll()
             ) {
            userRoleDtos.add(new UserRoleDto(
                    roles.getPropertyId(), roles.getRoleName(), roles.getRoleDescription()
            ));
        }
        return userRoleDtos;
    }
}
