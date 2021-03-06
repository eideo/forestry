package com.forestry.dao.sys.impl;

import org.springframework.stereotype.Repository;

import com.forestry.core.dao.BaseDao;
import com.forestry.dao.sys.ForestryTypeDao;
import com.forestry.model.sys.ForestryType;

/**
 * @author Yang Tian
 * @email 1298588579@qq.com
 */
@Repository
public class ForestryTypeDaoImpl extends BaseDao<ForestryType> implements ForestryTypeDao {

	public ForestryTypeDaoImpl() {
		super(ForestryType.class);
	}

}
