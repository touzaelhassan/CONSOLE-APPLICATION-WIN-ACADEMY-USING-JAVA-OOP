package com.winacademy;

import java.sql.Date;
import java.util.ArrayList;

public class Teacher extends User{

    private Date start_date;
    private Subject subject;
    private ArrayList<Teacher> teachers;


    public Teacher(){}

    public Teacher(Date start_date, Subject subject) {
        this.start_date = start_date;
        this.subject = subject;
    }

    public Teacher(int user_id, String user_firstname, String user_lastname, String user_email, String user_phone, Date start_date, Subject subject) {
        super(user_id, user_firstname, user_lastname, user_email, user_phone);
        this.start_date = start_date;
        this.subject = subject;
    }

    public Date getStart_date() {
        return start_date;
    }

    public void setStart_date(Date start_date) {
        this.start_date = start_date;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }


    public ArrayList<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(ArrayList<Teacher> teachers) {
        this.teachers = teachers;
    }
}
