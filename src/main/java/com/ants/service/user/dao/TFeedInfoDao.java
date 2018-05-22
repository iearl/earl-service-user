package com.ants.service.user.dao;

import java.util.List;
import java.util.Map;

import com.ants.facade.user.entity.TFeedInfo;

/**  
 * @ClassName: TFeedInfoDao  
 * @Description: TODO(这里用一句话描述这个类的作用)  
 * @author 马高伟
 * @date 2018年4月23日  
 *    
 */
public interface TFeedInfoDao {
	
	public List<TFeedInfo> selectTFeedInfoByMap(Map<String, Object> testMap);
	public long getTotal(Map<String, Object> testMap);
	
	public long updateByPrimaryKey(TFeedInfo record);
	
	public long insert(TFeedInfo record);
}
