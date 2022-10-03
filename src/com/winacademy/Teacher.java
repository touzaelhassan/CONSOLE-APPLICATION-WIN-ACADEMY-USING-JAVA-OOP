package com.winacademy;

import java.sql.Date;

public class Teacher extends User{

    private User user;
    private Subject subject;


    public Teacher(){}

    public Teacher( User user, Subject subject) {

        this.subject = subject;
        this.user = user;

    }

    public Teacher(int user_id, String user_firstname, String user_lastname, String user_email, String user_phone, Subject subject) {
        super(user_id, user_firstname, user_lastname, user_email, user_phone);
        this.subject = subject;
    }



    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "subject=" + subject +
                '}';
    }
}
