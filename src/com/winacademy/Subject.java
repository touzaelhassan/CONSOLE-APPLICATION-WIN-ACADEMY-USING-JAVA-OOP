package com.winacademy;

import java.util.ArrayList;

public class Subject {

    private int subject_id;
    private String subject_name;
    private Room room;
    private ArrayList<Subject> subjects;

    public Subject(){}

    public Subject(int subject_id, String subject_name, Room room) {
        this.subject_id = subject_id;
        this.subject_name = subject_name;
        this.room = room;
    }

    public int getSubject_id() {
        return subject_id;
    }

    public void setSubject_id(int subject_id) {
        this.subject_id = subject_id;
    }

    public String getSubject_name() {
        return subject_name;
    }

    public void setSubject_name(String subject_name) {
        this.subject_name = subject_name;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public ArrayList<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(ArrayList<Subject> subjects) {
        this.subjects = subjects;
    }
}
