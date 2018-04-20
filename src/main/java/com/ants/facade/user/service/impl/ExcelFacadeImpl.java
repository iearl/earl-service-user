/**  

* <p>Title: ExcelFacadeImpl.java</p>  

* <p>Description: </p>  

* <p>Copyright: Copyright (c) 2018</p>  

* <p>Company: www.baidudu.com</p>  

* @author shenlan  

* @date 2018年4月8日  

* @version 1.0  

*/  
package com.ants.facade.user.service.impl;

import javax.servlet.ServletOutputStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ants.facade.user.service.ExcelFacade;
import com.ants.service.user.biz.ExcelBiz;

/**  
 * @ClassName: ExcelFacadeImpl  
 * @Description: TODO(这里用一句话描述这个类的作用)  
 * @author 马高伟
 * @date 2018年4月8日  
 *    
 */
@Service("excelFacade")
public class ExcelFacadeImpl implements ExcelFacade{
	
	@Autowired
	private ExcelBiz excelBiz;

	@Override
	public void exportExcel(String sql, String[] titles) {
		exportExcel(sql,titles);
	}
	


}
