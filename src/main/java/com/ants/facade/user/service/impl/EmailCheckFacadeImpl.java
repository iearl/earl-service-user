package com.ants.facade.user.service.impl;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ants.facade.user.service.EmailCheckFacade;
import com.ants.service.user.biz.EmailCheckBiz;
/**  
 * @ClassName: TUserInfoFacade  
 * @Description: TODO(这里用一句话描述这个类的作用)  
 * @author 马高伟
 * @date 2018年4月4日  
 *    
 */
@Service("emailCheckFacade")
public class EmailCheckFacadeImpl implements EmailCheckFacade{
	
	@Autowired
	private EmailCheckBiz emailCheckBiz;
	
	//用户注册时邮箱校验
	@Override
	public boolean registerMail(String toMail, String code, Date date) {
		return emailCheckBiz.registerMail(toMail, code, date);
	}

	//用户找回时邮箱校验
	@Override
	public boolean resetMail(String toMail, String code, Date date) {
		return emailCheckBiz.resetMail(toMail, code, date);
	}

	

}
