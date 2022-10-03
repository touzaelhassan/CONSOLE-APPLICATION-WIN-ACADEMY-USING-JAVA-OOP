package com.winacademy;

import java.util.ArrayList;

public class Room {

    private int room_id;
    private String room_name;
    private int places;
    public Department department;
    //public ArrayList<Room> rooms;

    public Room(){}

    public Room(int room_id, String room_name, int places, Department department) {
        this.room_id = room_id;
        this.room_name = room_name;
        this.places = places;
        this.department = department;
    }

    public int getRoom_id() {
        return room_id;
    }

    public void setRoom_id(int room_id) {
        this.room_id = room_id;
    }

    public String getRoom_name() {
        return room_name;
    }

    public void setRoom_name(String room_name) {
        this.room_name = room_name;
    }

    public int getPlaces() {
        return places;
    }

    public void setPlaces(int places) {
        this.places = places;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    //public ArrayList<Room> getRooms() {
       // return rooms;
    //}

    //public void setRooms(ArrayList<Room> rooms) {
        //this.rooms = rooms;

    @Override
    public String toString() {
        return "Room{" +
                "room_id=" + room_id +
                ", room_name='" + room_name + '\'' +
                ", places=" + places +
                ", department=" + department +
                '}';
    }
    //}
}
