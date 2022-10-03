package com.winacademy;

public class Admin extends User{

    public Admin() {
    }

    public Admin(int user_id, String user_firstname, String user_lastname, String user_email, String user_phone) {
        super(user_id, user_firstname, user_lastname, user_email, user_phone);
    }
}

