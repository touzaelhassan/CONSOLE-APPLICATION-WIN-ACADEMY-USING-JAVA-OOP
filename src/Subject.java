public class Subject {

    private int subject_id;
    private String subject_name;
    private Room room;

    public Subject(){}

    public Subject(int subject_id, String subject_name, Room room) {
        this.subject_id = subject_id;
        this.subject_name = subject_name;
        this.room = room;
    }

    public void setSubject_id(int subject_id) {
        this.subject_id = subject_id;
    }
    public void setSubject_name(String subject_name) {
        this.subject_name = subject_name;
    }
    public void setRoom(Room room) {
        this.room = room;
    }
    public int getSubject_id() {
        return subject_id;
    }
    public String getSubject_name() {
        return subject_name;
    }
    public Room getRoom() {
        return room;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "subject_id=" + subject_id +
                ", subject_name='" + subject_name + '\'' +
                ", room=" + room +
                '}';
    }
}
