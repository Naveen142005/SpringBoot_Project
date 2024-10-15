package com.example.demo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class userLogin {
    @Id
    // @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userId;
    private String userPassword;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    @Override
    public String toString() {
        return "userLogin [userId=" + userId + ", userPassword=" + userPassword + "]";
    }
    

}
