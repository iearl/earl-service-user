package com.ants.service.user.dao;

import java.util.List;
import java.util.Map;

import com.ants.facade.user.entity.TRecruitInfo;

/**  
 * @ClassName: TRecruitInfoDao  
 * @Description: TODO(职位操作接口)  
 * @author 马高伟
 * @date 2018年4月16日  
 *    
 */
public interface TRecruitInfoDao {
	public List<TRecruitInfo> selectManageRecInfoByMapList(Map<String, Object> map) ;
	public long selectManageAlyInfoByMapCount(Map<String, Object> map) ;
	
	public List<Map<String, String>> searchSevenDayCount(Map<String, String> map);
	public long updateTRecruitInfoByRecId(TRecruitInfo record);
	public long insert(TRecruitInfo record);
	public List<TRecruitInfo> selectByMap(Map<String, Object> map);
	public long getTotal(Map<String, Object> testMap);
	public long deleteTRecruitInfoByMap(List<Map<String,Object>> list);
}
