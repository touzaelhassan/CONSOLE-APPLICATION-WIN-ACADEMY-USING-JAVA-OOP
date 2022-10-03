import com.winacademy.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static int choice;
    static int college_choice;
    static int teacher_choice;

    static College colleges;

    public static void main(String[] args) {

        // Database
        ArrayList<College> colleges = new ArrayList<College>();
        ArrayList<Department> departments = new ArrayList<Department>();
        ArrayList<Room> rooms = new ArrayList<Room>();
        ArrayList<Subject> subjects = new ArrayList<Subject>();
        ArrayList<User> users = new ArrayList<User>();
        ArrayList<Teacher> teachers= new ArrayList<Teacher>();
        ArrayList<Student> students = new ArrayList<Student>();



        // Insert Colleges Data
        College college1 = new College(1, "YouCode1");
        College college2 = new College(2, "YouCode2");
        College college3 = new College(3, "YouCode3");

        colleges.add(college1);
        colleges.add(college2);
        colleges.add(college3);

        // Insert departments Data
        Department department1 = new Department(1, "AAA",college1);
        Department department2 = new Department(2, "BBB",college1);
        Department department3 = new Department(3, "CCC",college1);

        departments.add(department1);
        departments.add(department2);
        departments.add(department3);

        // Insert rooms Data
        Room room1 = new Room(1, "R1",20,department1);
        Room room2 = new Room(2, "R2",20,department1);
        Room room3 = new Room(3, "R3",20,department1);

        rooms.add(room1);
        rooms.add(room2);
        rooms.add(room3);

        // Insert subjects Data
        Subject subject1 = new Subject(1, "Arabic",room1);
        Subject subject2 = new Subject(2, "French",room2);
        Subject subject3 = new Subject(3, "English",room1);

        subjects.add(subject1);
        subjects.add(subject2);
        subjects.add(subject3);

        // Insert users Data
        User user1 = new User(1, "user1", "lastname1", "email1@gmail.com","435342");
        User user2 = new User(2, "user1", "lastname2", "email2@gmail.com","437878");
        User user3 = new User(3, "user3", "lastname3", "email3@gmail.com","433535");
        User user4 = new User(4, "user4", "lastname4", "email4@gmail.com","433535");
        User user5 = new User(5, "user5", "lastname5", "email5@gmail.com","433535");
        User user6 = new User(6, "user6", "lastname6", "email6@gmail.com","433535");

        users.add(user1);
        users.add(user2);
        users.add(user3);

        // Insert teachers Data
        Teacher teacher1 = new Teacher(user1, subject1);
        Teacher teacher2 = new Teacher(user2, subject2);
        Teacher teacher3 = new Teacher(user3, subject3);

        teachers.add(teacher1);
        teachers.add(teacher2);
        teachers.add(teacher3);

        // Insert Students Data
        Student student1 = new Student(user4, subject1);
        Student student2 = new Student(user5, subject1);
        Student student3 = new Student(user6, subject1);

        students.add(student1);
        students.add(student2);
        students.add(student3);

        do{
                Scanner scanner = new Scanner(System.in);

                System.out.println("=============== MENU ===============");
                System.out.println("1 - Colleges CRUD");
                System.out.println("2 - Departments CRUD");
                System.out.println("3 - Rooms CRUD");
                System.out.println("4 - Subjects CRUD");
                System.out.println("5 - Users CRUD");
                System.out.println("6 - Teachers CRUD");
                System.out.println("7 - Students CRUD");

            choice = scanner.nextInt();

                switch(choice) {
                    case 1:

                        System.out.println("========== Colleges CRUD Operations");
                        System.out.println("1 - Create");
                        System.out.println("2 - Read");
                        System.out.println("3 - Update");
                        System.out.println("4 - Delete");
                        college_choice  = scanner.nextInt();

                        switch(college_choice) {
                            case 1:
                                System.out.println("========== Create College");
                                System.out.println("Enter College Id :");
                                int college_id = scanner.nextInt();
                                System.out.println("Enter College Name :");
                                String college_name = scanner.next();

                                College college4 = new College(college_id, college_name);

                                colleges.add(college4);

                                choice = 0;

                                break;
                            case 2:
                                System.out.println("Read Colleges");
                                for (College college : colleges){
                                    System.out.println(college.toString());
                                }
                                choice = 0;
                                break;
                            case 3:
                                System.out.println("Update College");
                                break;
                            case 4:
                                System.out.println("Delete College");
                                break;
                            default:
                        }
                        break;


                    case 2:
                        System.out.println("Departments CRUD");
                        break;
                    case 3:
                        System.out.println("Rooms CRUD");
                        break;
                    case 4:
                        System.out.println("Subjects CRUD");
                        break;
                    case 5:
                        System.out.println("========== Users CRUD");
                        System.out.println("1 - Create");
                        System.out.println("2 - Read");
                        System.out.println("3 - Update");
                        System.out.println("4 - Delete");
                        teacher_choice  = scanner.nextInt();

                        switch(teacher_choice) {
                            case 1:
                                System.out.println("========== Create User");
                                System.out.println("Enter User Id :");
                                int user_id = scanner.nextInt();
                                System.out.println("Enter User First Name :");
                                String user_firstname = scanner.next();
                                System.out.println("Enter User Last Name :");
                                String user_lastname = scanner.next();
                                System.out.println("Enter User Email :");
                                String user_email = scanner.next();
                                System.out.println("Enter User Phone :");
                                String user_phone = scanner.next();
                                User user12 = new User(user_id, user_firstname, user_lastname, user_email, user_phone);

                                users.add(user12);

                                for (User user : users){
                                   System.out.println(user.toString());
                                }

                                choice = 0;

                                break;
                            case 2:
                                System.out.println("Read Users");
                                for (User user : users){
                                    System.out.println(user.toString());
                                }
                                choice = 0;
                                break;
                            case 3:
                                System.out.println("Update User");
                                break;
                            case 4:
                                System.out.println("Delete User");
                                break;
                            default:
                        }

                        break;
                    case 6:
                        System.out.println("========== Teachers CRUD");
                        System.out.println("1 - Create");
                        System.out.println("2 - Read");
                        System.out.println("3 - Update");
                        System.out.println("4 - Delete");
                        teacher_choice  = scanner.nextInt();

                        switch(teacher_choice) {
                            case 1:
                                System.out.println("========== Create Teacher");
                                choice = 0;
                                break;
                            case 2:
                                System.out.println("Read Teachers");
                                for (Teacher teacher : teachers){
                                    System.out.println(teacher.toString());
                                }
                                choice = 0;
                                break;
                            case 3:
                                System.out.println("Update Teacher");
                                break;
                            case 4:
                                System.out.println("Delete Teacher");
                                break;
                            default:
                        }

                        break;

                    case 7:
                        System.out.println("========== Students CRUD");
                        System.out.println("1 - Create");
                        System.out.println("2 - Read");
                        System.out.println("3 - Update");
                        System.out.println("4 - Delete");
                        teacher_choice  = scanner.nextInt();

                        switch(teacher_choice) {
                            case 1:
                                System.out.println("========== Create Students");
                                choice = 0;
                                break;
                            case 2:
                                System.out.println("Read Students");
                                for (Student student : students){
                                    System.out.println(student.toString());
                                }
                                choice = 0;
                                break;
                            case 3:
                                System.out.println("Update Student");
                                break;
                            case 4:
                                System.out.println("Delete Student");
                                break;
                            default:
                        }

                        break;
                    default:
                        System.out.println("Default Page");
                }

            }while (choice < 1 || choice > 4);
        }
    }



