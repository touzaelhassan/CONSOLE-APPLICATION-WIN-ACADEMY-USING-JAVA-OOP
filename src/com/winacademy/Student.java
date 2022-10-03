package com.winacademy;

import java.util.ArrayList;
import java.util.Date;

public class Student  extends User{

    private Date student_date;
    private ArrayList<Student> students;

    public Student(){}

    public Student(Date student_date, ArrayList<Student> students) {
        this.student_date = student_date;
        this.students = students;
    }

    public Student(int user_id, String user_firstname, String user_lastname, String user_email, String user_phone, Date student_date, ArrayList<Student> students) {
        super(user_id, user_firstname, user_lastname, user_email, user_phone);
        this.student_date = student_date;
        this.students = students;
    }

    public Date getStudent_date() {
        return student_date;
    }

    public void setStudent_date(Date student_date) {
        this.student_date = student_date;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }
}
