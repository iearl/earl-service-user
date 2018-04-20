package com.ants.service.user.dao.impl;

import org.springframework.stereotype.Repository;

import com.ants.common.core.dao.BaseDaoImpl;
import com.ants.facade.user.entity.TBaseInfo;
import com.ants.service.user.dao.TBaseInfoDao;

/**  
 * @ClassName: TBaseInfoDaoImpl  
 * @Description: TODO(用户基础信息表操作)  
 * @author 马高伟
 * @date 2018年4月13日  
 *    
 */
@Repository("tBaseInfoDao")
public class TBaseInfoDaoImpl extends BaseDaoImpl<TBaseInfo> implements TBaseInfoDao{
	
	public long insert(TBaseInfo record){
		return super.getSqlSession().insert("insertTBaseUser", record);
	}
	public TBaseInfo selectByPrimaryKey(Integer uId){
		return super.getSqlSession().selectOne("selectByuId", uId);
	}

	@Override
	public long updateByPrimaryKey(TBaseInfo record) {
		return super.getSqlSession().update("updateBaseInfoByUId", record);
	}

}
