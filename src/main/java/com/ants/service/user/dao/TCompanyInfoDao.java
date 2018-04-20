/**  

* <p>Title: TCompanyInfoDao.java</p>  

* <p>Description: </p>  

* <p>Copyright: Copyright (c) 2018</p>  

* <p>Company: www.baidudu.com</p>  

* @author shenlan  

* @date 2018年4月15日  

* @version 1.0  

*/  
package com.ants.service.user.dao;

import com.ants.facade.user.entity.TCompanyInfo;

/**  
 * @ClassName: TCompanyInfoDao  
 * @Description: TODO(这里用一句话描述这个类的作用)  
 * @author 马高伟
 * @date 2018年4月15日  
 *    
 */
public interface TCompanyInfoDao {
	
	public int updateByPrimaryKey(TCompanyInfo record);
	public TCompanyInfo selectTComInfoByUId(Integer uId);
	
	public long insert(TCompanyInfo record);
}
