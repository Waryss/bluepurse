package com.waryss.bluepurse.core.dao;

import java.util.List;

import com.waryss.bluepurse.core.entity.OutEntity;
import com.waryss.bluepurse.core.entity.UserEntity;

public interface IOutDao extends IGenericDao<OutEntity, Long> {

	OutEntity findByIdAndUser(Long id, UserEntity user);

	List<OutEntity> findByUser(UserEntity user);
}
