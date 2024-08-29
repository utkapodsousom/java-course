package chapter9;

public class Course {
    private String courseName;
    private String[] students = new String[100];
    private int numberOfStudents;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void addStudent(String name) {
        students[numberOfStudents] = name;
        numberOfStudents++;
    } 

    public String[] getStudents() {
        return students;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public String getCourseName() {
        return courseName;
    }

    public void dropStudent(String student) {
        int studentIndex = student.indexOf(student);
        if (studentIndex >= 0) {
            for (int i = studentIndex + 1; i < numberOfStudents - studentIndex; i++) {
                students[i - 1] = students[i];
            }
            numberOfStudents--;
        } else {
            System.out.println("no students with provided name found");
        }
    }
}
