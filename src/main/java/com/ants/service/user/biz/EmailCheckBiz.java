package com.ants.service.user.biz;

import java.util.Date;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.mail.MailException;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Service;

import com.ants.common.utils.DateUtil;

/**
 * @ClassName: EmailCheckBiz
 * @Description: TODO(执行邮箱校验业务逻辑类)
 * @author 马高伟
 * @date 2018年4月4日
 * 
 */
@Service("emailCheckBiz")
public class EmailCheckBiz {
	private MailSender mailSender;
	private SimpleMailMessage mailMessage;
	private static final Log log = LogFactory.getLog(EmailCheckBiz.class);
	private static final String subject = "51直聘 专注只为更好";

	private static final String fromMail = "dc_magaowei@163.com";
	
	public boolean registerMail(String toMail, String code, Date date) {
		boolean flag;
		SimpleMailMessage mailMessage1 = new SimpleMailMessage();
		mailMessage1.setSubject(subject);
		mailMessage1.setTo(toMail);
		mailMessage1.setFrom(fromMail);
		SimpleMailMessage message = new SimpleMailMessage(mailMessage1);
		// 设置email内容,
		message.setText("尊敬的用户：您于"+DateUtil.formatDate(date)+"发送验证码，您本次的邮箱验证码是"+code+",验证码5分钟后失效！！！");
		try {
			mailSender.send(message);
			flag = true;
			log.info("向用户"+toMail+"发送成功注册验证码成功！！！");
		} catch (MailException e) { 
			flag = false;
			log.error("向用户"+toMail+"发送注册验证发送失败！！！"+e);
		}
		return flag;
	}

	public boolean resetMail(String toMail, String code, Date date) {
		boolean flag;
		SimpleMailMessage mailMessage1 = new SimpleMailMessage();
		mailMessage1.setSubject(subject);
		mailMessage1.setTo(toMail);
		mailMessage1.setFrom(fromMail);
		SimpleMailMessage message = new SimpleMailMessage(mailMessage1);
		// 设置email内容,
		message.setText("尊敬的用户：您于"+DateUtil.formatDate(date)+"发送验证码，您本次的邮箱验证码是"+code+",验证码5分钟后失效！！！");
		try {
			mailSender.send(message);
			flag = true;
			log.info("向用户"+toMail+"发送重置验证码成功！！！");
		} catch (MailException e) { 
			flag = false;
			log.error("向用户"+toMail+"发送重置验证发送失败！！！"+e);
		}
		return flag;
	}

	public MailSender getMailSender() {
		return mailSender;
	}

	public void setMailSender(MailSender mailSender) {
		this.mailSender = mailSender;
	}

	public SimpleMailMessage getMailMessage() {
		return mailMessage;
	}

	public void setMailMessage(SimpleMailMessage mailMessage) {
		this.mailMessage = mailMessage;
	}

}
