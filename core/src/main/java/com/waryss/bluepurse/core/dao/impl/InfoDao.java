package com.waryss.bluepurse.core.dao.impl;

import java.util.List;

import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.waryss.bluepurse.core.dao.IInfoDao;
import com.waryss.bluepurse.core.entity.param.InfoEntity;

@Repository
public class InfoDao extends GenericDao<InfoEntity, Integer>implements IInfoDao {

	@SuppressWarnings("unchecked")
	@Override
	public InfoEntity findPingInfo() {
		Query query = entityManager.createNamedQuery("findInfoByCode", InfoEntity.class);
		query.setParameter("code", "health");
		List<InfoEntity> result = query.getResultList();
		InfoEntity info = (result.size() > 0) ? result.get(0) : null;
		return info;
	}

}
