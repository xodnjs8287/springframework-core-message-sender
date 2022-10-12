package com.nhnacademy.edu.springframework.messagesender;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;


public class EmailMessageSender implements MessageSender{



    public EmailMessageSender() {
        System.out.println("=======EmailMessageSender is created");
    }

    public void init(){
        System.out.println("Email is intializing");
    }

    public void close(){
        System.out.println("=====callback close()====");
    }

    @Override

    public void sendMessage(User user, String message) {
        System.out.println("Email message sent to  "+user.getEmail() + "  message: " + message);

    }

    @Override
    public String toString() {
        return "Email 메세지 ";
    }
}
