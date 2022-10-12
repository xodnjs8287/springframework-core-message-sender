package com.nhnacademy.edu.springframework.messagesender;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;


public class SmsMessageSender implements MessageSender {





    public SmsMessageSender() {
        System.out.println("==========SmsMessageSender created===");
    }


    public void init(){
        System.out.println("Sms is intializing");
    }

    public void close(){
        System.out.println("=====Sms close====");
    }
    @Override
    public void sendMessage(User user, String message) {
        System.out.println("SMS message sent to  "+user.getNumber() + "  message: " + message);
    }


    @Override
    public String toString() {
        return  "Sms 메세지임";
    }
}
