package com.ants.service.user.dao.impl;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.ants.common.core.dao.BaseDaoImpl;
import com.ants.facade.user.entity.TArchivesLog;
import com.ants.facade.user.entity.TFeedInfo;
import com.ants.service.user.dao.TArchivesLogDao;

/**  
 * @ClassName: TArchivesLogDaoImpl  
 * @Description: TODO(这里用一句话描述这个类的作用)  
 * @author 马高伟
 * @date 2018年5月5日  
 *    
 */
@Repository("tArchivesLogDao")
public class TArchivesLogDaoImpl extends BaseDaoImpl<TArchivesLog> implements TArchivesLogDao{
	//插入日志信息
	public long insert(TArchivesLog record){
		return super.getSqlSession().insert("insertTArchivesLog", record);
	}
	public List<TArchivesLog> selectTArchivesLogByMap(Map<String, Object> testMap) {
		return super.getSqlSession().selectList("selectTArchivesLogByMap", testMap);
	}
	public long getTotal(Map<String, Object> testMap) {
		return super.getSqlSession().selectOne("selectTArchivesLogCountByMap", testMap);
	}
}
