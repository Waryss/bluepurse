package com.waryss.bluepurse.core.dao.impl;

import org.springframework.stereotype.Repository;

import com.waryss.bluepurse.core.dao.IUserDao;
import com.waryss.bluepurse.core.entity.UserEntity;

@Repository
public class UserDao extends GenericDao<UserEntity, Long>implements IUserDao {
}
