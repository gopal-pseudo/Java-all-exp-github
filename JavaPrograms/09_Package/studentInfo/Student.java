package studentInfo;

public class Student {
    private String name;
    private int rollNo;
    private String className;

    public Student(String name, int rollNo, String className) {
        this.name = name;
        this.rollNo = rollNo;
        this.className = className;
    }

    public void displayInfo() {
        System.out.println("Name    : " + name);
        System.out.println("Roll No : " + rollNo);
        System.out.println("Class   : " + className);
        System.out.println("---------------------");
    }
}
