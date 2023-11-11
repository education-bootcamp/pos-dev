package com.devstack.pos.bo.custom;

import com.devstack.pos.dto.UserDto;
import com.devstack.pos.entity.User;

import java.util.List;

public interface UserBo {
    public void initializeSystem();
    public List<UserDto> loadAllUsers(String searchText);
}
