package com.winacademy;

import java.util.ArrayList;

public class College {

    private int college_id;
    private String college_name;
    private ArrayList<College> colleges;

    public  College(){}

    public College(int college_id, String college_name, ArrayList<College> colleges) {
        this.college_id = college_id;
        this.college_name = college_name;
        this.colleges = colleges;
    }

    public int getCollege_id() {
        return college_id;
    }

    public void setCollege_id(int college_id) {
        this.college_id = college_id;
    }

    public String getCollege_name() {
        return college_name;
    }

    public void setCollege_name(String college_name) {
        this.college_name = college_name;
    }

    public ArrayList<College> getColleges() {
        return colleges;
    }

    public void setColleges(ArrayList<College> colleges) {
        this.colleges = colleges;
    }
}
