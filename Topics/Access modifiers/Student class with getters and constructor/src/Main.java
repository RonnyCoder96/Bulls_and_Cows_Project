import java.util.*;

public class Main {
    static class Person {
        private String name;
        private int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }
    }

    static class Student extends Person {
        private int studentID;

        public Student(String name, int age, int studentID) {
            super(name, age);
            this.studentID = studentID;
        }

        public int getStudentID() {
            return studentID;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int age = scanner.nextInt();
        int studentID = scanner.nextInt();

        Student student = new Student(name, age, studentID);

        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());
        System.out.println("Student ID: " + student.getStudentID());
    }
}
