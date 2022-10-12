package com.nhnacademy.edu.springframework.messagesender;

public class User {
    private final String number;
    private final String email;

    public User(String number, String email) {
        this.number = number;
        this.email = email;
    }

    public String getNumber() {
        return number;
    }


    public String getEmail() {
        return email;
    }

}
