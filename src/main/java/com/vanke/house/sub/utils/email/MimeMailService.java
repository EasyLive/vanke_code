/**
 * Create with Eclipse IDE
 * @Title: MimeMailService.java
 * @Package com.vanke.house.sub.utils.email
 */
package com.vanke.house.sub.utils.email;

import java.io.File;
import java.io.IOException;
import java.util.Map;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeUtility;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.ui.freemarker.FreeMarkerTemplateUtils;
import org.springframework.web.servlet.view.freemarker.FreeMarkerConfigurer;

import freemarker.template.Template;
import freemarker.template.TemplateException;

/**
 * Todo: MIME邮件服务类
 * Date: 2013年12月13日 下午10:33:34
 * User: Binj.pan@gmail.com
 *
 */
public class MimeMailService {

    private static Logger logger = LoggerFactory.getLogger(MimeMailService.class);

    private static final String DEFAULT_ENCODING="utf-8";

    private JavaMailSender mailSender ;
    private FreeMarkerConfigurer freeMarkerConfigurer;

    @Value("${mail.smtp.username}")
    private String fromUser;


    /**
     * 发送MIME格式邮件
     */
    public void sendNotificationMail(String[] usernames, String freemarkerName, Map<String, Object> model, String filePath){
        MimeMessage msg = mailSender.createMimeMessage();
        try {
            MimeMessageHelper helper = new MimeMessageHelper(msg,true, DEFAULT_ENCODING);
//			收件人String String[]
            helper.setTo(usernames);
//			发件人
            helper.setFrom(fromUser);
//			标题
            helper.setSubject("MIME邮件");
//			邮件内容
            helper.setText(getContentHtml(freemarkerName, model),true);
            if(StringUtils.isNotEmpty(filePath)){
//				邮件附件
                File file = new File(filePath);
                helper.addAttachment(MimeUtility.encodeWord("附件123"), file);
            }
            mailSender.send(msg);
            logger.info("MIME邮件已发送至{}",StringUtils.join(usernames));
        } catch (MessagingException e) {
            logger.error("构建邮件失败",e);
        }  catch (Exception e) {
            logger.error("邮件发送失败",e);
        }
    }

    public String getContentHtml(String freemarkerName, Map<String, Object> model){
        String htmlText = "";
        try {
            Template template = freeMarkerConfigurer.getConfiguration().getTemplate(freemarkerName);
            htmlText = FreeMarkerTemplateUtils.processTemplateIntoString(template, model);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (TemplateException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return htmlText;
    }



    /**
     * @param mailSender the mailSender to set
     */
    public void setMailSender(JavaMailSender mailSender) {
        this.mailSender = mailSender;
    }


    /**
     * @param freeMarkerConfigurer the freeMarkerConfigurer to set
     */
    public void setFreeMarkerConfigurer(FreeMarkerConfigurer freeMarkerConfigurer) {
        this.freeMarkerConfigurer = freeMarkerConfigurer;
    }

}
