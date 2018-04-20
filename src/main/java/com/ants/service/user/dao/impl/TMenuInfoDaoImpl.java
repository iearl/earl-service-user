package com.ants.service.user.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.ants.common.core.dao.BaseDaoImpl;
import com.ants.facade.user.entity.TJobInfo;
import com.ants.facade.user.entity.TMenuInfo;
import com.ants.service.user.dao.TJobInfoDao;
import com.ants.service.user.dao.TMenuInfoDao;

/**  
 * @ClassName: TMenuInfoDaoImpl  
 * @Description: TODO(这里用一句话描述这个类的作用)  
 * @author 马高伟
 * @date 2018年4月10日  
 *    
 */
@Repository("tMenuInfoDao")
public class TMenuInfoDaoImpl extends BaseDaoImpl<TMenuInfo> implements TMenuInfoDao{

	@Override
	public List<TMenuInfo> selectListTMenuInfo() {
		return super.getSqlSession().selectList("selectListTMenuInfo");
	}

}
