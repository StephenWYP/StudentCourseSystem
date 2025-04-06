public class Main {
    public static void main(String[] args) {

        Person p1 = new Person("Pierce");
        p1.introduce();

        Person s1 = new Student(4.1, "Yunpeng");
        s1.introduce();

        Student s2 = (Student) s1;
        s2.introduce();
        System.out.println(s2.getGpa());

        try {
            s2.setGpa(4.0);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Please continue.");
        }

        s2.introduce();

        try {
            s2.setGpa(5.5);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Keep working.");
        }

        Course c1 = new Course("EE-129", "Computer Networking", 3);
        s2.addCourses(c1);
        s2.addCourses(new Course("CS-121", "Software Engineering", 3));
        s2.showCourses();
        System.out.println(s2);
    }
}
