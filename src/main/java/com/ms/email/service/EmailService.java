package com.ms.email.service;

import com.ms.email.enums.StatusEmail;
import com.ms.email.model.EmailModel;
import com.ms.email.repository.EmailREpository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;


import java.time.LocalDateTime;

@Service
public class EmailService {

    @Autowired
    EmailREpository EmailRepo;

    @Autowired
    JavaMailSender mailSender;

    public EmailModel sendEmail(EmailModel model) {
        model.setSendDateEmail(LocalDateTime.now());
        try{
            SimpleMailMessage msg = new SimpleMailMessage();
            msg.setFrom(model.getEmailFrom());
            msg.setTo(model.getEmailTo());
            msg.setSubject(model.getSubject());
            msg.setText(model.getText());
            mailSender.send(msg);
            model.setStatusEmail(StatusEmail.SENT);

        }catch(MailException e){
            model.setStatusEmail(StatusEmail.ERROR);
        }finally{
            return EmailRepo.save(model);
        }

    }
}
