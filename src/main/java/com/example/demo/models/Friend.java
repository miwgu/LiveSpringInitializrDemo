package com.example.demo.models;

/**
 * Created by Miwa Guhrés
 * Date: 2021-04-08
 * Time: 14:48
 * Project: LiveSpringInitializrDemo
 * Copyright: MIT
 */
public class Friend {
    protected  int id;
    protected  String name;
    protected  String address;
    protected  String tele;

    public Friend(int id, String name, String address, String tele) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.tele = tele;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTele() {
        return tele;
    }

    public void setTele(String tele) {
        this.tele = tele;
    }
}
