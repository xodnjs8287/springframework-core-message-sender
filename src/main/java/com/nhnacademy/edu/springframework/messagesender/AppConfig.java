package com.nhnacademy.edu.springframework.messagesender;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration

public class AppConfig {




    @Bean
    public MessageSender smsMessageSender() {
       return new SmsMessageSender();
    }

    @Bean(destroyMethod = "")
    public MessageSender emailMessageSender() {
      return new EmailMessageSender();
    }


}
