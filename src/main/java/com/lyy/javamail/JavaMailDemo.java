/*
 * Nothing is impossible to a willing heart
 */

package com.lyy.javamail;

import javax.mail.Address;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.io.UnsupportedEncodingException;
import java.util.Date;
import java.util.Properties;

/**
 * @autohor liuyouyun
 * @date 2019/9/4 - 17:26
 */
public class JavaMailDemo {
    public static void main(String[] args) {
        Properties props = new Properties();
        props.setProperty("mail.transport.protocol", "smtp");  // 使用协议smtp
        props.setProperty("mail.smtp.host", "smtp.qq.com");  // 协议地址
        props.setProperty("mail.smtp.port", "465");  // 协议端口
        props.setProperty("mail.smtp.auth", "true");  // 需要授权

        // QQ：SSL安全认证
        props.setProperty("mail.smtp.socketFactory.class", "java.net.ssl.SSLSocketFactory");
        props.setProperty("mail.smtp.socketFactory.fallback", "false");
        props.setProperty("mail.smtp.socketFactory.port", "465");

        Session session = Session.getInstance(props);

        // 创建邮件
        MimeMessage message = createMimeMessage();
    }



    // MimeMessage:邮件
    public static MimeMessage createMimeMessage(Session session, String send, String receive)
            throws MessagingException, UnsupportedEncodingException {
        MimeMessage message = new MimeMessage(session);
        // 邮件：标题、正文、收件人、 {附件、图片}
        Address address = new InternetAddress(send, "发件人的名字", "UTF-8");

        message.setFrom(address);
        message.setSubject("这是标题", "UTF-8");
        message.setContent("正文内容", "UTF-8");
        // 收件人类型：TO普通收件人、CC抄送、BCC密送
        message.setRecipient(MimeMessage.RecipientType.TO,
                new InternetAddress(receive, "收件人A", "UTF-8"));
        message.setRecipient(MimeMessage.RecipientType.CC,
                new InternetAddress(receive, "收件人A", "UTF-8"));
        message.setRecipient(MimeMessage.RecipientType.BCC,
                new InternetAddress(receive, "收件人A", "UTF-8"));

        message.setSentDate(new Date());
    }


}
