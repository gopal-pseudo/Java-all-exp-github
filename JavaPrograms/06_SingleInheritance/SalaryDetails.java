class Employee {
    int empId;
    String name;
    double basicSalary;

    Employee(int empId, String name, double basicSalary) {
        this.empId = empId;
        this.name = name;
        this.basicSalary = basicSalary;
    }

    void displayDetails() {
        System.out.println("Employee ID   : " + empId);
        System.out.println("Name          : " + name);
        System.out.println("Basic Salary  : " + basicSalary);
    }
}

class PermanentEmployee extends Employee {
    double hra;
    double da;

    PermanentEmployee(int empId, String name, double basicSalary) {
        super(empId, name, basicSalary);
        this.hra = basicSalary * 0.20;
        this.da = basicSalary * 0.15;
    }

    double calculateGrossSalary() {
        return basicSalary + hra + da;
    }

    void displayDetails() {
        super.displayDetails();
        System.out.println("HRA (20%)     : " + hra);
        System.out.println("DA (15%)      : " + da);
        System.out.println("Gross Salary  : " + calculateGrossSalary());
        System.out.println("-----------------------------");
    }
}

public class SalaryDetails {
    public static void main(String[] args) {
        PermanentEmployee e1 = new PermanentEmployee(1001, "Ravi Kumar", 30000);
        PermanentEmployee e2 = new PermanentEmployee(1002, "Sneha Reddy", 45000);
        e1.displayDetails();
        e2.displayDetails();
    }
}
