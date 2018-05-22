package com.ants.service.user.biz;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ants.facade.user.entity.TWorkShow;
import com.ants.facade.user.service.TWorkShowFacade;
import com.ants.service.user.dao.TWorkShowDao;

/**  
 * @ClassName: TWorkShowBiz  
 * @Description: TODO(工作经验业务逻辑类)  
 * @author 马高伟
 * @date 2018年4月19日  
 *    
 */
@Service("tWorkShowBiz")
public class TWorkShowBiz {
	
	@Autowired
	private TWorkShowDao tWorkShowDao;
	
	public List<TWorkShow> selectManageWorkShowInfoByMapList(
			Map<String, Object> map) {
		return tWorkShowDao.selectManageWorkShowInfoByMapList(map);
	}
	public long selectManageWorkShowInfoByMapCount(Map<String, Object> map) {
		return tWorkShowDao.selectManageWorkShowInfoByMapCount(map);
	}
	public long insert(TWorkShow record) {
		return tWorkShowDao.insert(record);
	}
	public List<Map<String,String>> selectTWorkShowListByUId(Integer uId){
		return tWorkShowDao.selectTWorkShowListByUId(uId);
	}
}
