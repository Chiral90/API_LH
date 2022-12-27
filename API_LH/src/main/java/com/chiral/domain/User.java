/*package com.chiral.domain;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity(name = "member")
@NoArgsConstructor
@Getter
public class User {
	@Id
    @Column(name = "user_id")
    private String userId;

    @Column(name = "user_name")
    private String    userName;
    private String    password;
    private String    email;
    private String    role;          // ROLE_USER, ROLE_ADMIN
    @CreationTimestamp
    private Timestamp createDate;

    *//**
     * @param username
     * @param password
     *//*
    public User(String userId, String userName, String password) {
        this.userId   = userId;
        this.userName = userName;
        this.password = password;
    }

    *//**
     * @param username
     * @param password
     *//*
    public User(String userId, String userName, String password, String email) {
        this.userId   = userId;
        this.userName = userName;
        this.password = password;
        this.email    = email;
    }

    *//**
     * @param username
     * @param password
     *//*
    public User(String userId, String userName, String password, String email, String role) {
        this.userId   = userId;
        this.userName = userName;
        this.password = password;
        this.email    = email;
        this.role     = role;
    }

    public void setRole( String role ) {
        this.role = role;
    }

    public List<String> getRoles() {
        if ( this.role.length() > 0 ) {
            return Arrays.asList(this.role.split(","));
        }

        return new ArrayList<String>();
    }

    @Override
    public String toString() {
        return "User [userId=" + userId + ", userName=" + userName + ", password=" + password + ", email=" + email
                + ", role=" + role + ", createDate=" + createDate + "]";
    }
}
*/