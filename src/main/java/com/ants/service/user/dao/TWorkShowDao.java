package com.ants.service.user.dao;

import java.util.List;
import java.util.Map;

import com.ants.facade.user.entity.TWorkShow;
import com.ants.facade.user.service.TWorkShowFacade;

/**  
 * @ClassName: TWorkShowDao  
 * @Description: TODO(工作经验dao接口)  
 * @author 马高伟
 * @date 2018年4月19日  
 *    
 */
public interface TWorkShowDao {
	
	public List<TWorkShow> selectManageWorkShowInfoByMapList(
			Map<String, Object> map);
	public long selectManageWorkShowInfoByMapCount(Map<String, Object> map);
	public long insert(TWorkShow record);
	
	public List<Map<String,String>> selectTWorkShowListByUId(Integer uId);
}
