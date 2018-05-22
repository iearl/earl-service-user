package com.ants.service.user.dao;

import java.util.List;
import java.util.Map;

import com.ants.facade.user.entity.TArchivesLog;
import com.ants.facade.user.entity.TFeedInfo;

/**  
 * @ClassName: TArchivesLogDao  
 * @Description: TODO(日志操作Dao接口)  
 * @author 马高伟
 * @date 2018年4月21日  
 *    
 */
public interface TArchivesLogDao {
	public long insert(TArchivesLog record);
	public List<TArchivesLog> selectTArchivesLogByMap(Map<String, Object> testMap);
	public long getTotal(Map<String, Object> testMap);
}
