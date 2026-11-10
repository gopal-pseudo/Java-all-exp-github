class Student {
    String name;
    int rollNo;
    double marks;

    Student(String name, int rollNo, double marks) {
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }

    char calculateGrade() {
        if (marks >= 90) {
            return 'A';
        } else if (marks >= 75) {
            return 'B';
        } else if (marks >= 60) {
            return 'C';
        } else if (marks >= 50) {
            return 'D';
        } else {
            return 'F';
        }
    }

    void display() {
        System.out.println("Name    : " + name);
        System.out.println("Roll No : " + rollNo);
        System.out.println("Marks   : " + marks);
        System.out.println("Grade   : " + calculateGrade());
        System.out.println("-------------------------");
    }
}

public class StudentRecords {
    public static void main(String[] args) {
        Student s1 = new Student("Arjun", 101, 92);
        Student s2 = new Student("Priya", 102, 78);
        Student s3 = new Student("Kiran", 103, 55);
        s1.display();
        s2.display();
        s3.display();
    }
}
