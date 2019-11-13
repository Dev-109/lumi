package com.example.lumi;

public class DataStructure {

    private String username;
    private String password;


    public DataStructure() {

    }

    public DataStructure(String username, String password) {
        this.username = username;
        this.password = password;

    }

    public String getUsername() {
        return username;
    }

    public void setPassword(String name) {
        this.password = name;
    }
}