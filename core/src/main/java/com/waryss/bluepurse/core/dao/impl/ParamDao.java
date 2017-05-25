package com.waryss.bluepurse.core.dao.impl;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.waryss.bluepurse.core.dao.IParamDao;
import com.waryss.bluepurse.core.entity.param.BucketTypeEntity;
import com.waryss.bluepurse.core.entity.param.RecurrencyEntity;
import com.waryss.bluepurse.core.entity.param.StatusEntity;
import com.waryss.bluepurse.core.entity.param.UserGroupEntity;

@Repository
public class ParamDao extends GenericDao<Object, Long> implements IParamDao {

	@Override
	public BucketTypeEntity findDefaultBucketType() {
		return (BucketTypeEntity) getDefaultFromIndicator(BucketTypeEntity.class);
	}

	@Override
	public RecurrencyEntity findDefaultRecurrence() {
		return (RecurrencyEntity) getDefaultFromIndicator(RecurrencyEntity.class);
	}

	@Override
	public StatusEntity findDefaultStatus() {
		return (StatusEntity) getDefaultFromIndicator(StatusEntity.class);
	}

	@Override
	public UserGroupEntity findDefaultUserGroup() {
		return (UserGroupEntity) getDefaultFromIndicator(UserGroupEntity.class);
	}


	private <T> Object getDefaultFromIndicator(Class<T> clazz){
		CriteriaBuilder builder = entityManager.getCriteriaBuilder();
		CriteriaQuery<T> query = builder.createQuery(clazz);
		Root<T> root = query.from(clazz);
		query.where(builder.equal(root.get("inddefaul"), true));
		return entityManager.createQuery(query).getSingleResult();
	}

}
