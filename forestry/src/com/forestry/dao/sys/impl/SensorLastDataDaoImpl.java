package com.forestry.dao.sys.impl;

import org.springframework.stereotype.Repository;

import com.forestry.core.dao.BaseDao;
import com.forestry.dao.sys.SensorLastDataDao;
import com.forestry.model.sys.SensorLastData;

/**
 * @author Yang Tian
 * @email 1298588579@qq.com
 */
@Repository
public class SensorLastDataDaoImpl extends BaseDao<SensorLastData> implements SensorLastDataDao {

	public SensorLastDataDaoImpl() {
		super(SensorLastData.class);
	}

}
