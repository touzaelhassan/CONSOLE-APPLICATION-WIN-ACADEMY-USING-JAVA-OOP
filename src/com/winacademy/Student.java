package com.winacademy;

import java.util.ArrayList;
import java.util.Date;

public class Student  extends User{

    private User user;
    private Subject subject;

    public Student(){}

    public Student(User user, Subject subject) {
        this.user = user;
        this.subject = subject;
    }

    public Student(int user_id, String user_firstname, String user_lastname, String user_email, String user_phone, Date student_date, ArrayList<Student> students) {
        super(user_id, user_firstname, user_lastname, user_email, user_phone);
    }

    @Override
    public String toString() {
        return "Student{" +
                "user=" + user +
                ", subject=" + subject +
                '}';
    }
}
