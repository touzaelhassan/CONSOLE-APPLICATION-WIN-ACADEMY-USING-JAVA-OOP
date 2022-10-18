public class Student extends User {

    private Subject subject;

    public Student() { }

    public Student(Subject subject) {
        this.subject = subject;
    }

    public Student(int user_id, String user_name, String user_email, Subject subject) {
        super(user_id, user_name, user_email);
        this.subject = subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }
    public Subject getSubject() {
        return subject;
    }

    public String toString() {
        return "Student{" +
                super.toString()
                +
                "subject=" + subject +
                '}';
    }
}
