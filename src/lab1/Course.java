package lab1;

public class Course {
    String courseName = "Software Construction";
    String courseCode = "SE-312L";
    int creditHours = 1;

    public void displayCourse() {
        System.out.println("Course: " + courseName);
        System.out.println("Code: " + courseCode);
        System.out.println("Credit Hours: " + creditHours);
    }
}