package com.waryss.bluepurse.core.dao.impl;

import java.util.List;

import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.waryss.bluepurse.core.dao.IOutDao;
import com.waryss.bluepurse.core.entity.OutEntity;
import com.waryss.bluepurse.core.entity.UserEntity;

@Repository
public class OutDao extends GenericDao<OutEntity, Long> implements IOutDao {

	@Override
	public OutEntity findByIdAndUser(Long id, UserEntity user) {
		Query query = entityManager.createNamedQuery("findOutsByUser", OutEntity.class);
		query.setParameter("user", user);
		query.setParameter("id", id);
		return (query.getResultList().isEmpty()) ? null : (OutEntity) query.getResultList().get(0);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<OutEntity> findByUser(UserEntity user) {
		Query query = entityManager.createNamedQuery("findOutsByUser", OutEntity.class);
		query.setParameter("user", user);
		return query.getResultList();
	}
}
