public class Room {

    private int room_id;
    private String room_name;
    public Department department;

    public Room(){}

    public Room(int room_id, String room_name, Department department) {
        this.room_id = room_id;
        this.room_name = room_name;
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

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Room{" +
                "room_id=" + room_id +
                ", room_name='" + room_name + '\'' +
                ", department=" + department +
                '}';
    }
}
