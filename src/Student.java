import java.util.List;
import java.util.ArrayList;

public class Student extends Person implements Gradable{
    private double gpa;
    List<Course> enrolledCourses = new ArrayList<>();

    Student(double gpa, String name) {
        super(name);
        this.gpa = gpa;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) throws Exception {
        if (gpa < 0.0 || gpa > 4.0) {
            throw new Exception(name + "'s gpa setting is out of range 0.0 ~ 4.0");
        }
        this.gpa = gpa;
    }

    public void addCourses(Course c) {
        enrolledCourses.add(c);
        System.out.println("Student " + name + " successfully added a course: " + c + "\n");
    }

    public void showCourses() {
        System.out.println(name + "'s current course list is:");
        for (Course c : enrolledCourses) {
            System.out.println(c);
        }
        System.out.println("\n");
    }

    @Override
    public void introduce() {
        System.out.println("Hi, I am a student named " + name +" ,and my gpa is " + gpa + ".\n");
    }

    @Override
    public String toString() {
        return "Name: " + name + " ,gpa: " + gpa + " ,enrolled courses: " + enrolledCourses;
    }
}
