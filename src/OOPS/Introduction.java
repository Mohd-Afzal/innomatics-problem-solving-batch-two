package OOPS;

class Employee {
    // Attributes
    private int empId;
    private String empName;
    private double empSalary;
    private String empDesignation;

    public Employee() {}

    public Employee(String empName, int empId, double empSalary, String empDesignation) {
        // Parameterised constructor
        this.empId = empId;
        this.empName = empName;
        this.empDesignation = empDesignation;
        this.empSalary = empSalary;
    }

    // Methods
    public void display() {
        // Define this later
        System.out.println("Printing the attributes of an Employee");
        System.out.println(this.empId);
        System.out.println(this.empName);
        System.out.println(this.empSalary);
        System.out.println(this.empDesignation);
    }
}

public class Introduction {

    public static void main(String[] args) {
        Employee monica = new Employee();
        Employee emp = new Employee("Afzal", 28, 20000, "PM"); // Creating an object

        emp.display();

        emp.display();

        emp.display();



    }
}
