package com.waryss.bluepurse.core.dao;

import com.waryss.bluepurse.core.entity.param.InfoEntity;

public interface IInfoDao extends IGenericDao<InfoEntity, Integer> {

	InfoEntity findPingInfo();
}
