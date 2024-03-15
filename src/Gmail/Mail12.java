/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Gmail;

import java.util.Date;
import java.util.Properties;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import static Until.ramdom.generateRandom;



public class Mail12 {
    
 public static void sendmail(String recipientEmail, String randomCode) {
        final String from = "thuatnhcps26351@fpt.edu.vn";
        final String password = "ipnxneknrppdyffb";

        // Properties : Khai bao thuoc tinh
        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");

        // Tao Authenticator
        Authenticator auth = new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(from, password);
            }
        };

        // Phien lam viec
        Session session = Session.getInstance(props, auth);

        // Gui mail
        try {
            // Tao Tin nhan
            MimeMessage smg = new MimeMessage(session);
            // Nguoi Gui
            smg.setFrom(new InternetAddress(from));
            // Nguoi nhan
            smg.setRecipients(Message.RecipientType.TO, InternetAddress.parse(recipientEmail, false));
            // Tieu de email
            smg.setSubject("Mã của bạn là:");
            // Ngay gui
            smg.setSentDate(new Date());

            // Noi dung         
            smg.setText(randomCode);
            Transport.send(smg);
            System.out.println("Gửi email thành công!");

        } catch (MessagingException ex) {
            ex.printStackTrace();
        }
    }
 
}