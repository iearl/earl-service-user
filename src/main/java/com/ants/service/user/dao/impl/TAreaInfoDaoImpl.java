/**  

* <p>Title: TAreaInfoDaoImpl.java</p>  

* <p>Description: </p>  

* <p>Copyright: Copyright (c) 2018</p>  

* <p>Company: www.baidudu.com</p>  

* @author shenlan  

* @date 2018年4月14日  

* @version 1.0  

*/  
package com.ants.service.user.dao.impl;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.ants.common.core.dao.BaseDaoImpl;
import com.ants.facade.user.entity.TAreaInfo;
import com.ants.service.user.dao.TAreaInfoDao;

/**  
 * @ClassName: TAreaInfoDaoImpl  
 * @Description: TODO(这里用一句话描述这个类的作用)  
 * @author 马高伟
 * @date 2018年4月14日  
 *    
 */
@Repository("tAreaInfoDao")
public class TAreaInfoDaoImpl extends BaseDaoImpl<TAreaInfo> implements TAreaInfoDao{
	
	public List<Map<String,String>> searchAreaNameById(Map<String,String> mapCon){
		return super.getSqlSession().selectList("searchAreaNameById", mapCon);
	}
	
	@Override
	public List<TAreaInfo> selectTAreaList(String province) {
		return super.getSqlSession().selectList("selectTAreaList", province);
	}

}
