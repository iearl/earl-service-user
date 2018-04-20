package com.ants.service.user.dao;

import com.ants.common.core.dao.BaseDao;
import com.ants.facade.user.entity.TBaseInfo;

/**
 * @ClassName: TBaseInfoDao
 * @Description: TODO(用户基础信息dao接口)
 * @author 马高伟
 * @date 2018年4月13日
 * 
 */
public interface TBaseInfoDao extends BaseDao<TBaseInfo> {

	public long updateByPrimaryKey(TBaseInfo record);

	public long insert(TBaseInfo record);

	public TBaseInfo selectByPrimaryKey(Integer uId);
}
