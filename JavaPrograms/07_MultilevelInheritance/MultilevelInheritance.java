class Student {
    int rollNo;
    String name;

    void setStudent(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    void displayStudent() {
        System.out.println("Roll No : " + rollNo);
        System.out.println("Name    : " + name);
    }
}

class Marks extends Student {
    String[] subjects = {"Maths", "Physics", "Chemistry", "English", "Computer"};
    int[] marks = new int[5];

    void setMarks(int[] m) {
        for (int i = 0; i < 5; i++) {
            marks[i] = m[i];
        }
    }

    void displayMarks() {
        for (int i = 0; i < 5; i++) {
            System.out.println(subjects[i] + " : " + marks[i]);
        }
    }
}

class Result extends Marks {
    int total;
    double average;
    char grade;

    void calculate() {
        total = 0;
        for (int m : marks) {
            total += m;
        }
        average = total / 5.0;
        if (average >= 90) {
            grade = 'A';
        } else if (average >= 75) {
            grade = 'B';
        } else if (average >= 60) {
            grade = 'C';
        } else if (average >= 50) {
            grade = 'D';
        } else {
            grade = 'F';
        }
    }

    void displayResult() {
        displayStudent();
        displayMarks();
        System.out.println("Total   : " + total);
        System.out.println("Average : " + average);
        System.out.println("Grade   : " + grade);
        System.out.println("---------------------");
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        Result r1 = new Result();
        r1.setStudent(201, "Rahul");
        r1.setMarks(new int[]{85, 78, 92, 74, 88});
        r1.calculate();
        r1.displayResult();

        Result r2 = new Result();
        r2.setStudent(202, "Anjali");
        r2.setMarks(new int[]{95, 91, 89, 94, 97});
        r2.calculate();
        r2.displayResult();
    }
}
