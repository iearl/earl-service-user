package com.ants.service.user.dao.impl;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.ants.common.core.dao.BaseDaoImpl;
import com.ants.facade.user.entity.TFeedInfo;
import com.ants.service.user.dao.TFeedInfoDao;

/**  
 * @ClassName: TFeedInfoDaoImpl  
 * @Description: TODO(这里用一句话描述这个类的作用)  
 * @author 马高伟
 * @date 2018年4月23日  
 *    
 */
@Repository("tFeedInfoDao")
public class TFeedInfoDaoImpl extends BaseDaoImpl<TFeedInfo> implements TFeedInfoDao {
	@Override
	public List<TFeedInfo> selectTFeedInfoByMap(Map<String, Object> testMap) {
		return super.getSqlSession().selectList("selectTFeedInfoByMap", testMap);
	}
	public long updateByPrimaryKey(TFeedInfo record) {
		return super.getSqlSession().update("updateTFeedInfoDao", record);
	}

	@Override
	public long getTotal(Map<String, Object> testMap) {
		return super.getSqlSession().selectOne("selectTFeedInfoCountByMap", testMap);
	}
	public long insert(TFeedInfo record){
		return super.getSqlSession().insert("insertTFeedInfo", record);
	}
}
