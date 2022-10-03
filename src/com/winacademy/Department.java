package com.winacademy;

import java.util.ArrayList;

public class Department {

    private int department_id ;
    private String department_name;
    private College college;
    private Teacher manager_id;
    private ArrayList<Department> departments;

    public Department(){}

    public Department(int department_id, String department_name, College college, Teacher manager_id) {
        this.department_id = department_id;
        this.department_name = department_name;
        this.college = college;
        this.manager_id = manager_id;
    }

    public int getDepartment_id() {
        return department_id;
    }

    public void setDepartment_id(int department_id) {
        this.department_id = department_id;
    }

    public String getDepartment_name() {
        return department_name;
    }

    public void setDepartment_name(String department_name) {
        this.department_name = department_name;
    }

    public College getCollege() {
        return college;
    }

    public void setCollege(College college) {
        this.college = college;
    }

    public Teacher getManager_id() {
        return manager_id;
    }

    public void setManager_id(Teacher manager_id) {
        this.manager_id = manager_id;
    }

    public ArrayList<Department> getDepartments() {
        return departments;
    }

    public void setDepartments(ArrayList<Department> departments) {
        this.departments = departments;
    }

}
