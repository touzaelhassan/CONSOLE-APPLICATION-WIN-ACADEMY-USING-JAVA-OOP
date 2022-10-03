package com.winacademy;

import java.util.ArrayList;

public class Department {

    private int department_id ;
    private String department_name;
    private College college;

    public Department(){}

    public Department(int department_id, String department_name, College college) {
        this.department_id = department_id;
        this.department_name = department_name;
        this.college = college;
    }

    @Override
    public String toString() {
        return "Department{" +
                "department_id=" + department_id +
                ", department_name='" + department_name + '\'' +
                ", college=" + college +
                '}';
    }

}
