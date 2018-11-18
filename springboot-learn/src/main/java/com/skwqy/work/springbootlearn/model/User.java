package com.skwqy.work.springbootlearn.model;

public class User {
    private int id;
    private String username;
    private Integer age;
    private String ctm;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getCtm() {
        return ctm;
    }

    public void setCtm(String ctm) {
        this.ctm = ctm;
    }
}