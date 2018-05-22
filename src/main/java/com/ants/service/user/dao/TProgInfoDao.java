package com.ants.service.user.dao;

import java.util.List;
import java.util.Map;

import com.ants.facade.user.entity.TProgInfo;

/**  
 * @ClassName: TProgInfoDao  
 * @Description: TODO(这里用一句话描述这个类的作用)  
 * @author 马高伟
 * @date 2018年4月21日  
 *    
 */
public interface TProgInfoDao {
	public List<TProgInfo> selectManageProgInfoByMapList(Map<String, Object> map);
	public long selectManageProgInfoByMapCount(
			Map<String, Object> map);
	public long deleteProgInfoByList(List<String> list);
	public List<TProgInfo> selectTProgInfoByMap(Map<String, Object> map);
	public List<TProgInfo> selectByMap(Map<String, Object> map);
	public long insert(TProgInfo record);
}
