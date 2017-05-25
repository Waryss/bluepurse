package com.waryss.bluepurse.core.dao.impl;

import java.util.List;

import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.waryss.bluepurse.core.dao.IInDao;
import com.waryss.bluepurse.core.entity.InEntity;
import com.waryss.bluepurse.core.entity.UserEntity;

@Repository
public class InDao extends GenericDao<InEntity, Long>implements IInDao {

	@Override
	public InEntity findByIdAndUser(Long id, UserEntity user) {
		Query query = entityManager.createNamedQuery("findInByIdAndUser", InEntity.class);
		query.setParameter("user", user);
		query.setParameter("id", id);
		return (query.getResultList().isEmpty()) ? null : (InEntity) query.getResultList().get(0);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<InEntity> findByUser(UserEntity user) {
		Query query = entityManager.createNamedQuery("findInsByUser", InEntity.class);
		query.setParameter("user", user);
		return query.getResultList();
	}
}
