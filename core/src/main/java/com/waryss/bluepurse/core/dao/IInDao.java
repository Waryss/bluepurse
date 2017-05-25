package com.waryss.bluepurse.core.dao;

import java.util.List;

import com.waryss.bluepurse.core.entity.InEntity;
import com.waryss.bluepurse.core.entity.UserEntity;

public interface IInDao extends IGenericDao<InEntity, Long> {

	InEntity findByIdAndUser(Long id, UserEntity user);

	List<InEntity> findByUser(UserEntity user);
}
