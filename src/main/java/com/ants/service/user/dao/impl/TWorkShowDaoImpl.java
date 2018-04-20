package com.ants.service.user.dao.impl;

import org.springframework.stereotype.Repository;

import com.ants.common.core.dao.BaseDaoImpl;
import com.ants.facade.user.entity.TWorkShow;
import com.ants.service.user.dao.TWorkShowDao;

/**  
 * @ClassName: TWorkShowDaoImpl  
 * @Description: TODO(这里用一句话描述这个类的作用)  
 * @author 马高伟
 * @date 2018年4月19日  
 *    
 */
@Repository("tWorkShowDao")
public class TWorkShowDaoImpl extends BaseDaoImpl<TWorkShow> implements TWorkShowDao{

	//插入工作经验信息
	@Override
	public long insert(TWorkShow record) {
		return super.getSqlSession().insert("insertTWorkShow", record);
	}
}
