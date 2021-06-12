package com.prezrohit.Twelfth;

import com.opensymphony.xwork2.ActionSupport;

public class User extends ActionSupport {
    private String userName;
    private String password;

    public String execute() {
        return "success";
    }

    public void validate() {
        if (userName == null || userName.trim().equals("")) {
            addFieldError("name", "The name is required");
        }
        if (password == null || password.length() < 8)
            addFieldError("password", "Password must be of at least length 8");
    }

    public String getName() {
        return userName;
    }

    public void setName(String name) {
        this.userName = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
