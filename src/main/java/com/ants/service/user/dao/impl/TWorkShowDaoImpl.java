package com.ants.service.user.dao.impl;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.ants.common.core.dao.BaseDaoImpl;
import com.ants.facade.user.entity.TWorkShow;
import com.ants.facade.user.service.TWorkShowFacade;
import com.ants.service.user.dao.TWorkShowDao;

/**  
 * @ClassName: TWorkShowDaoImpl  
 * @Description: TODO(这里用一句话描述这个类的作用)  
 * @author 马高伟
 * @date 2018年4月19日  
 *    
 */
@Repository("tWorkShowDao")
public class TWorkShowDaoImpl extends BaseDaoImpl<TWorkShow> implements TWorkShowDao{

	//插入工作经验信息
	@Override
	public long insert(TWorkShow record) {
		return super.getSqlSession().insert("insertTWorkShow", record);
	}
	
	public List<TWorkShow> selectManageWorkShowInfoByMapList(
			Map<String, Object> map) {
		return super.getSqlSession().selectList("selectManageWorkShowInfoByMapList", map);
	}
	public long selectManageWorkShowInfoByMapCount(Map<String, Object> map) {
		return super.getSqlSession().selectOne("selectManageWorkShowInfoByMapCount",map);
	}
	
	public List<Map<String,String>> selectTWorkShowListByUId(Integer uId){
		return super.getSqlSession().selectList("selectTWorkShowListByUId", uId);
	}
}
