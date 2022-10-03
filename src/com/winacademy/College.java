package com.winacademy;

public class College {

    private int college_id;
    private String college_name;

    public  College(){
    }

    public College(int college_id, String college_name) {
        this.college_id = college_id;
        this.college_name = college_name;
    }

    @Override
    public String toString() {
        return "College{" +
                "college_id=" + college_id +
                ", college_name='" + college_name + '\'' +
               // ", colleges=" + colleges +
                '}';
    }
}
