/**
 * Create with Eclipse IDE
 * @Title: SimpleMailService.java
 * @Package com.vanke.house.sub.utils.email
 */
package com.vanke.house.sub.utils.email;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;

/**
 * Todo: 纯文本邮件服务类
 * Date: 2013年12月13日 下午10:33:51
 * User: Binj.pan@gmail.com
 *
 */

public class SimpleMailService {

    private static Logger logger = LoggerFactory.getLogger(SimpleMailService.class);

    private JavaMailSender mailSender;

    private String textTemplate;

    @Value("${mail.smtp.username}")
    private String fromMail;


    public void sendNotificationMail(String[] toUserNames){
        SimpleMailMessage msg = new SimpleMailMessage();
        msg.setTo(toUserNames);
        msg.setFrom(fromMail);
        msg.setSubject("文本邮件");
        msg.setText("纯文本邮件测试！！！");
        try {
            mailSender.send(msg);
            logger.info("纯文本邮件已发送至",StringUtils.join(msg.getTo(), ","));
        } catch (MailException e) {
            logger.error("纯文本邮件构造失败",e);
            e.printStackTrace();
        } catch (Exception e) {
            logger.error("纯文本邮件发送失败",e);
            e.printStackTrace();
        }
    }

    /**
     * @param mailSender the mailSender to set
     */
    public void setMailSender(JavaMailSender mailSender) {
        this.mailSender = mailSender;
    }

    /**
     * @param textTemplate the textTemplate to set
     */
    public void setTextTemplate(String textTemplate) {
        this.textTemplate = textTemplate;
    }

}
