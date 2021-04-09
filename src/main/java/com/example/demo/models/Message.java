package com.example.demo.models;

/**
 * Created by Miwa Guhrés
 * Date: 2021-04-09
 * Time: 13:08
 * Project: LiveSpringInitializrDemo
 * Copyright: MIT
 */
public class Message {

    protected boolean status;
    protected String message;

    public Message(boolean status, String message) {
        this.status = status;
        this.message = message;
    }

    public boolean isStatus(){
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
