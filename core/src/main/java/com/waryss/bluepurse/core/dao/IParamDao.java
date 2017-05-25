
package com.waryss.bluepurse.core.dao;

import com.waryss.bluepurse.core.entity.param.BucketTypeEntity;
import com.waryss.bluepurse.core.entity.param.RecurrencyEntity;
import com.waryss.bluepurse.core.entity.param.StatusEntity;
import com.waryss.bluepurse.core.entity.param.UserGroupEntity;

public interface IParamDao extends IGenericDao<Object, Long> {

	BucketTypeEntity findDefaultBucketType();

	RecurrencyEntity findDefaultRecurrence();

	StatusEntity findDefaultStatus();

	UserGroupEntity findDefaultUserGroup();
}
