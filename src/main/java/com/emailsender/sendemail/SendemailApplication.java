package com.emailsender.sendemail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class SendemailApplication {
    @Autowired
    private sendEmail senderservice;
    

        
       @EventListener(ApplicationReadyEvent.class)
       public void sendEmail(){
           senderservice.send(EmailForm.email,EmailForm.subject, EmailForm.msg);
           
       }

}
