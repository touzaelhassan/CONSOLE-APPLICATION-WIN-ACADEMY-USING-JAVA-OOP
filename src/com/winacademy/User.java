package com.winacademy;

public class User {

    private int user_id ;
    private String user_firstname;
    private String user_lastname;
    private String user_email;
    private String user_phone;

    public User(){}

    public User(int user_id, String user_firstname, String user_lastname, String user_email, String user_phone) {
        this.user_id = user_id;
        this.user_firstname = user_firstname;
        this.user_lastname = user_lastname;
        this.user_email = user_email;
        this.user_phone = user_phone;
    }

    @Override
    public String toString() {
        return "User{" +
                "user_id=" + user_id +
                ", user_firstname='" + user_firstname + '\'' +
                ", user_lastname='" + user_lastname + '\'' +
                ", user_email='" + user_email + '\'' +
                ", user_phone='" + user_phone + '\'' +
                '}';
    }
}
