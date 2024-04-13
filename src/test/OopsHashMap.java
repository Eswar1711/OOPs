package test;

import java.util.HashMap;
import java.util.Map;

class Student {
    private String studentId;
    private String name;
    private int age;

    public Student(String studentId, String name, int age) {
        this.studentId = studentId;
        this.name = name;
        this.age = age;
    }

    // Getter and setter methods

    @Override
    public String toString() {
        return "Student{ID: " + studentId + ", Name: " + name + ", Age: " + age + '}';
    }
}

class Course {
    private String courseId;
    private String courseName;
    private int credits;

    public Course(String courseId, String courseName, int credits) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.credits = credits;
    }

    // Getter and setter methods

    @Override
    public String toString() {
        return "Course{ID: " + courseId + ", Name: " + courseName + ", Credits: " + credits + '}';
    }
}

class University {
    private Map<Student, Course> studentCourseMap;

    public University() {
        this.studentCourseMap = new HashMap<>();
    }

    public void registerStudentForCourse(Student student, Course course) {
        studentCourseMap.put(student, course);
    }

    public void displayStudentCourses() {
        for (Map.Entry<Student, Course> entry : studentCourseMap.entrySet()) {
            System.out.println(entry.getKey() + " is enrolled in " + entry.getValue());
        }
    }
}

public class OopsHashMap {
    public static void main(String[] args) {
        University university = new University();

        // Creating instances of Student and Course
        Student alice = new Student("S001", "Alice", 20);
        Course mathCourse = new Course("C001", "Mathematics", 3);

        Student bob = new Student("S002", "Bob", 21);
        Course physicsCourse = new Course("C002", "Physics", 4);

        // Registering students for courses
        university.registerStudentForCourse(alice, mathCourse);
        university.registerStudentForCourse(bob, physicsCourse);

        // Displaying student courses
        System.out.println("Student Courses:");
        university.displayStudentCourses();
    }
}
