package com.waryss.bluepurse.core.dao;

import java.util.List;

import com.waryss.bluepurse.core.entity.PurseEntity;
import com.waryss.bluepurse.core.entity.UserEntity;

public interface IPurseDao extends IGenericDao<PurseEntity, Long> {

	List<PurseEntity> findByCreator(UserEntity user);

	/**
	 * @param id
	 * @param user
	 * @return
	 */
	PurseEntity findByIdAndCreator(Long id, UserEntity user);
}
