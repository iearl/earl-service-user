/**  

* <p>Title: TRecruitInfoBiz.java</p>  

* <p>Description: </p>  

* <p>Copyright: Copyright (c) 2018</p>  

* <p>Company: www.baidudu.com</p>  

* @author shenlan  

* @date 2018年4月16日  

* @version 1.0  

*/  
package com.ants.service.user.biz;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ants.facade.user.entity.TRecruitInfo;
import com.ants.service.user.dao.TRecruitInfoDao;

/**  
 * @ClassName: TRecruitInfoBiz  
 * @Description: TODO(这里用一句话描述这个类的作用)  
 * @author 马高伟
 * @date 2018年4月16日  
 *    
 */
@Service("tRecruitInfoBiz")
public class TRecruitInfoBiz {
	@Autowired
	private TRecruitInfoDao tRecruitInfoDao;
	
	public long insert(TRecruitInfo record) {
		return tRecruitInfoDao.insert(record);
	}
	public List<TRecruitInfo> selectByMap(Map<String, Integer> map){
		return tRecruitInfoDao.selectByMap(map);
	}
	public long getTotal(Map<String, Integer> testMap) {
		return tRecruitInfoDao.getTotal(testMap);
	}
}
