package com.nhnacademy.edu.springframework.messagesender;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

import java.util.List;



public class MessageSenderService {
    private  final List<MessageSender> messageSender;


    @Value("${from}")
    private String name;



    @Autowired
    public MessageSenderService( @Qualifier("smsMessageSender")List<MessageSender> messageSender) {
        this.messageSender = messageSender;
        System.out.println(messageSender);
    }


//    @Autowired
//    public MessageSenderService(MessageSender messageSender) {
//
//        System.out.println("----------constructor injection--------");
//        this.messageSender = messageSender;
//    }


    public void doSendMessage(User user, String message){
        System.out.println("from :" + name);
        messageSender.forEach( m -> m.sendMessage(user,message));



    }




}
