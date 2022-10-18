public class Teacher extends User {

    private Subject subject;

    public Teacher(){}

    public Teacher(Subject subject) {
        this.subject = subject;
    }

    public Teacher(int user_id, String user_name, String user_email, Subject subject) {
        super(user_id, user_name, user_email);
        this.subject = subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }
    public Subject getSubject() {
        return subject;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                super.toString()
                +
                "subject=" + subject +
                '}';
    }
}
