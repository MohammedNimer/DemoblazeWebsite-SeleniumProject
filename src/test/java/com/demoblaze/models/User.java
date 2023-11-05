package com.demoblaze.models;

import com.github.javafaker.Faker;

public class User {

    private String userName;
    private String password;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // *******************************************

    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }
    //*********************************************

    public User(){
        Faker faker=new Faker();
        String userName=faker.name().username();
        String password="123456";
        this.userName = userName;
        this.password = password;
    }

}
