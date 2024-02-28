class Employee {
    private String name;
    private int id;
    private double salary;

    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Salary: $" + salary);
    }
}

class Manager extends Employee {
    private String department;

    public Manager(String name, int id, double salary, String department) {
        super(name, id, salary);
        this.department = department;
    }

    public void displayDetails() {
        super.displayDetails();
        System.out.println("Manager Department: " + department);
    }
}

class Worker extends Employee {
    private String shift;

    public Worker(String name, int id, double salary, String shift) {
        super(name, id, salary);
        this.shift = shift;
    }

    public void displayDetails() {
        super.displayDetails();
        System.out.println("Worker Shift: " + shift);
    }
}


