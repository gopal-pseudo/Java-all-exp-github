import studentInfo.Student;

public class SchoolApp {
    public static void main(String[] args) {
        Student s1 = new Student("Meena", 1, "10-A");
        Student s2 = new Student("Suresh", 2, "10-B");
        s1.displayInfo();
        s2.displayInfo();
    }
}
