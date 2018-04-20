package com.ants.service.user.dao;

import java.util.List;

import com.ants.common.core.dao.BaseDao;
import com.ants.facade.user.entity.TMenuInfo;
import com.ants.facade.user.entity.UserInfo;

/**
 * @ClassName: TMenuInfoDao
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author 马高伟
 * @date 2018年4月10日
 * 
 */
public interface TMenuInfoDao extends BaseDao<TMenuInfo>{
	// 查询所有菜单
	List<TMenuInfo> selectListTMenuInfo();
}
