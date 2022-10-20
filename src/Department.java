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

    public void setDepartment_id(int department_id) {
        this.department_id = department_id;
    }
    public void setDepartment_name(String department_name) {
        this.department_name = department_name;
    }
    public void setCollege(College college) {
        this.college = college;
    }
    public int getDepartment_id() {
        return department_id;
    }
    public String getDepartment_name() { return department_name; }
    public College getCollege() { return college; }


    @Override
    public String toString() {
        return "Department{" +
                "department_id=" + department_id +
                ", department_name='" + department_name + '\'' +
                ", college=" + college +
                '}';
    }
}
