import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

    static int choice = 0;

    static ArrayList<College> colleges = new ArrayList<College>();
    static ArrayList<Department> departments = new ArrayList<Department>();
    static ArrayList<Room> rooms = new ArrayList<Room>();
    static ArrayList<Subject> subjects = new ArrayList<Subject>();
    static ArrayList<Teacher> teachers = new ArrayList<Teacher>();
    static ArrayList<Student> students = new ArrayList<Student>();

    public static void main(String[] args) {

        do {

            System.out.println("                            ");
            System.out.println("========== WIN ACADEMY =====");
            System.out.println("                            ");
            System.out.println("[1] - COLLEGES MANAGEMENT");
            System.out.println("[2] - DEPARTMENTS MANAGEMENT");
            System.out.println("[3] - ROOMS MANAGEMENT");
            System.out.println("[4] - SUBJECTS MANAGEMENT");
            System.out.println("[5] - TEACHERS MANAGEMENT");
            System.out.println("[6] - STUDENTS MANAGEMENT");
            System.out.println("                         ");
            System.out.print("Please enter your choice : ");
            Scanner scanner = new Scanner(System.in);
            choice = scanner.nextInt();

            switch(choice) {
                case 1:
                    collegesManagement();
                    break;
                case 2:
                    departmentsManagement();
                    break;
                case 3:
                    roomsManagement();
                    break;
                case 4:
                    subjectsManagement();
                    break;
                case 5:
                    teachersManagement();
                    break;
                case 6:
                    studentsManagement();
                    break;
            }

        } while(choice != 0);
    }

    // Colleges Management

    public static void collegesManagement(){

        int collegeChoice;
        System.out.println("---------- COLLEGES MANAGEMENTS ------");
        System.out.println("[1] - CREATE COLLEGE");
        System.out.println("[2] - READ COLLEGES");
        System.out.println("[3] - UPDATE COLLEGE");
        System.out.println("[4] - DELETE COLLEGE");
        System.out.println("                              ");
        System.out.print("Please enter your choice : ");
        Scanner scanner = new Scanner(System.in);
        collegeChoice = scanner.nextInt();

        switch(collegeChoice) {
            case 1:
                 createCollege();
                break;
            case 2:
                getColleges();
                break;
            case 3:
                updateCollege();
                break;
            case 4:
                deleteCollege();
                break;
        }
    }

    public static void createCollege(){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter College Id : ");
        int collegeId = scanner.nextInt();
        System.out.print("Enter College Name : ");
        String collegeName = scanner.next();
        College college = new College();
        college.setCollege_id(collegeId);
        college.setCollege_name(collegeName);
        colleges.add(college);

    }

    public static College getCollegeById(int collegeId){

        Iterator<College> r = colleges.iterator();

        while (r.hasNext()){
            College college = r.next();
            if(college.getCollege_id() == collegeId){ return college; }
        }
        return null;
    }

    public static void updateCollege(){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter College Index : ");
        int collegeIndex = scanner.nextInt();
        System.out.print("Enter College Name : ");
        String collegeName = scanner.next();
        colleges.set(collegeIndex, new College(collegeIndex + 1,collegeName));

    }

    public static void deleteCollege(){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter College Index : ");
        int collegeIndex = scanner.nextInt();
        colleges.remove(collegeIndex);

    }

    public static void getColleges(){ for (College college1 : colleges){ System.out.println(college1.toString());} }

    // Departments Management

    public static void departmentsManagement(){

        int departmentChoice;
        System.out.println("---------- DEPARTMENTS MANAGEMENTS ------");
        System.out.println("[1] - CREATE DEPARTMENT");
        System.out.println("[2] - READ DEPARTMENTS");
        System.out.println("[3] - UPDATE DEPARTMENT");
        System.out.println("[4] - DELETE DEPARTMENT");
        System.out.println("                             ");
        System.out.print("Please enter your choice :  ");
        Scanner scanner = new Scanner(System.in);
        departmentChoice = scanner.nextInt();

        switch(departmentChoice) {
            case 1:
                createDepartment();
                break;
            case 2:
                getDepartments();
                break;
            case 3:
                updateDepartment();
                break;
            case 4:
                deleteDepartment();
                break;
        }
    }

    public static void createDepartment(){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Department Id : ");
        int departmentId = scanner.nextInt();
        System.out.print("Enter Department Name : ");
        String departmentName = scanner.next();
        System.out.print("Enter College Id : ");
        int collegeId = scanner.nextInt();
        College college = getCollegeById(collegeId);
        Department department = new Department();
        department.setDepartment_id(departmentId);
        department.setDepartment_name(departmentName);
        department.setCollege(college);
        departments.add(department);

    }

    public static Department getDepartmentById(int departmentId){

        Iterator<Department> r = departments.iterator();

        while (r.hasNext()){
            Department department = r.next();
            if(department.getDepartment_id() == departmentId){ return department; }
        }
        return null;
    }

    public static void updateDepartment(){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Department Index : ");
        int departmentIndex = scanner.nextInt();
        System.out.print("Enter Department Name : ");
        String departmentName = scanner.next();
        departments.set(departmentIndex, new Department(departmentIndex + 1, departmentName, new College(1,"mmm")));

    }

    public static void deleteDepartment(){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Department Index : ");
        int departmentIndex = scanner.nextInt();
        departments.remove(departmentIndex);

    }

    public static void getDepartments(){ for (Department department1 : departments){ System.out.println(department1.toString());} }

    // Rooms Management

    public static void roomsManagement(){

        int roomChoice;
        System.out.println("---------- ROOMS MANAGEMENTS ------");
        System.out.println("[1] - CREATE ROOM");
        System.out.println("[2] - READ ROOMS");
        System.out.println("[3] - UPDATE ROOM");
        System.out.println("[4] - DELETE ROOM");
        System.out.println("                             ");
        System.out.print("Please enter your choice :  ");
        Scanner scanner = new Scanner(System.in);
        roomChoice = scanner.nextInt();

        switch(roomChoice) {
            case 1:
                createRoom();
                break;
            case 2:
                getRooms();
                break;
            case 3:
                updateRoom();
                break;
            case 4:
                deleteRoom();
                break;
        }
    }

    public static void createRoom(){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Room Id : ");
        int roomId = scanner.nextInt();
        System.out.print("Enter Room Name : ");
        String roomName = scanner.next();
        System.out.print("Enter Department Id : ");
        int departmentId = scanner.nextInt();
        Department department = getDepartmentById(departmentId);
        Room room = new Room();
        room.setRoom_id(roomId);
        room.setRoom_name(roomName);
        room.setDepartment(department);
        rooms.add(room);

    }

    public static Room getRoomById(int roomId){

        Iterator<Room> r = rooms.iterator();

        while (r.hasNext()){
            Room room = r.next();
            if(room.getRoom_id() == roomId){ return room; }
        }
        return null;
    }

    public static void getRooms(){ for (Room room1 : rooms){ System.out.println(room1.toString()); } }
    public static void updateRoom(){ System.out.println("Update Department Coming Soon !!!"); }
    public static void deleteRoom(){ System.out.println("delete Department Coming Soon !!!"); }

    // Subjects Management

    public static void subjectsManagement(){

        int subjectChoice;
        System.out.println("---------- SUBJECTS MANAGEMENTS ------");
        System.out.println("[1] - CREATE SUBJECT");
        System.out.println("[2] - READ SUBJECTS");
        System.out.println("[3] - UPDATE SUBJECT");
        System.out.println("[4] - DELETE SUBJECT");
        System.out.println("                             ");
        System.out.print("Please enter your choice :  ");
        Scanner scanner = new Scanner(System.in);
        subjectChoice = scanner.nextInt();

        switch(subjectChoice) {
            case 1:
                createSubject();
                break;
            case 2:
                getSubjects();
                break;
            case 3:
                updateSubject();
                break;
            case 4:
                deleteSubject();
                break;
        }
    }

    public static void createSubject(){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Subject Id : ");
        int subjectId = scanner.nextInt();
        System.out.print("Enter Subject Name : ");
        String subjectName = scanner.next();
        System.out.print("Enter Room Id : ");
        int roomId = scanner.nextInt();
        Room room = getRoomById(roomId);
        Subject subject = new Subject();
        subject.setSubject_id(subjectId);
        subject.setSubject_name(subjectName);
        subject.setRoom(room);
        subjects.add(subject);

    }

    public static Subject getSubjectById(int subjectId){

        Iterator<Subject> r = subjects.iterator();

        while (r.hasNext()){
            Subject subject = r.next();
            if(subject.getSubject_id() == subjectId){ return subject; }
        }

        return null;
    }

    public static void getSubjects(){ for (Subject subject1 : subjects){ System.out.println(subject1.toString()); } }
    public static void updateSubject(){ System.out.println("Update Department Coming Soon !!!"); }
    public static void deleteSubject(){ System.out.println("delete Department Coming Soon !!!"); }

    // Teachers Management

    public static void teachersManagement(){

        int teacherChoice;
        System.out.println("---------- TEACHERS MANAGEMENTS ------");
        System.out.println("[1] - CREATE TEACHER");
        System.out.println("[2] - READ TEACHERS");
        System.out.println("[3] - UPDATE TEACHER");
        System.out.println("[4] - DELETE TEACHER");
        System.out.println("                              ");
        System.out.print("Please enter your choice : ");
        Scanner scanner = new Scanner(System.in);
        teacherChoice = scanner.nextInt();

        switch(teacherChoice) {
            case 1:
                createTeacher();
                break;
            case 2:
                getTeachers();
                break;
            case 3:
                updateTeacher();
                break;
            case 4:
                deleteTeacher();
                break;
        }
    }

    public static void createTeacher(){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Teacher Id : ");
        int userId = scanner.nextInt();
        System.out.print("Enter Teacher Name : ");
        String userName = scanner.next();
        System.out.print("Enter Teacher Email : ");
        String userEmail = scanner.next();
        System.out.print("Enter Subject Id : ");
        int subjectIdId = scanner.nextInt();
        Subject subject = getSubjectById(subjectIdId);
        Teacher teacher = new Teacher(userId,userName,userEmail,subject);
        teachers.add(teacher);

    }

    public static void getTeachers(){ for (Teacher teacher1 : teachers){ System.out.println(teacher1.toString()); } }
    public static void updateTeacher(){ System.out.println("Update Department Coming Soon !!!"); }
    public static void deleteTeacher(){ System.out.println("delete Department Coming Soon !!!"); }

    // Students Management

    public static void studentsManagement(){

        int studentChoice;
        System.out.println("---------- STUDENTS MANAGEMENTS ------");
        System.out.println("[1] - CREATE STUDENT");
        System.out.println("[2] - READ STUDENTS");
        System.out.println("[3] - UPDATE STUDENT");
        System.out.println("[4] - DELETE STUDENT");
        System.out.println("                              ");
        System.out.print("Please enter your choice : ");
        Scanner scanner = new Scanner(System.in);
        studentChoice = scanner.nextInt();

        switch(studentChoice) {
            case 1:
                createStudent();
                break;
            case 2:
                getStudents();
                break;
            case 3:
                updateStudent();
                break;
            case 4:
                deleteStudent();
                break;
        }
    }

    public static void createStudent(){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Student Id : ");
        int userId = scanner.nextInt();
        System.out.print("Enter Student Name : ");
        String userName = scanner.next();
        System.out.print("Enter Student Email : ");
        String userEmail = scanner.next();
        System.out.print("Enter Subject Id : ");
        int subjectIdId = scanner.nextInt();
        Subject subject = getSubjectById(subjectIdId);
        Student student = new Student(userId,userName,userEmail,subject);
        students.add(student);

    }

    public static void getStudents(){ for (Student student1 : students){ System.out.println(student1.toString()); } }
    public static void updateStudent(){ System.out.println("Update Department Coming Soon !!!"); }
    public static void deleteStudent(){ System.out.println("delete Department Coming Soon !!!"); }

}