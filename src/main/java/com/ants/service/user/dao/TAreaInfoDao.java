/**  

* <p>Title: TAreaInfoDao.java</p>  

* <p>Description: </p>  

* <p>Copyright: Copyright (c) 2018</p>  

* <p>Company: www.baidudu.com</p>  

* @author shenlan  

* @date 2018年4月14日  

* @version 1.0  

*/  
package com.ants.service.user.dao;

import java.util.List;
import java.util.Map;

import com.ants.facade.user.entity.TAreaInfo;

/**  
 * @ClassName: TAreaInfoDao  
 * @Description: TODO(这里用一句话描述这个类的作用)  
 * @author 马高伟
 * @date 2018年4月14日  
 *    
 */
public interface TAreaInfoDao {
	public List<TAreaInfo> selectTAreaList(String province);
	
	public List<Map<String,String>> searchAreaNameById(Map<String,String> mapCon);
}
