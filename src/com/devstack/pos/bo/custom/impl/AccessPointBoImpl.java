package com.devstack.pos.bo.custom.impl;

import com.devstack.pos.bo.custom.AccessPointBo;
import com.devstack.pos.dao.DaoFactory;
import com.devstack.pos.dao.custom.AccessPointDao;
import com.devstack.pos.dto.AccessPointDto;
import com.devstack.pos.entity.AccessPoint;

public class AccessPointBoImpl implements AccessPointBo {

    private AccessPointDao accessPointDao = DaoFactory.getDao(DaoFactory.DaoType.ACCESS_POINT);

    @Override
    public boolean createAccessPoint(AccessPointDto dto) {
        return accessPointDao.create(
                new AccessPoint(dto.getPropertyId(), dto.getPointName())
        );
    }
}
