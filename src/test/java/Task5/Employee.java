package Task5;

class Employee {
    protected String name;
    protected double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void displayDetails() {
        System.out.println("Name: " + name + ", Salary: " + salary);
    }
}

class Manager extends Employee {
    private String department;

    public Manager(String name, double salary, String department) {
        super(name, salary);
        this.department = department;
    }

    @Override
    public void displayDetails() {
        System.out.println("Name: " + name + ", Salary: " + salary + ", Department: " + department);
    }

    public static void main(String[] args) {
        Employee emp = new Employee("Jonathan", 50000);
        Manager mgr = new Manager("Jondo", 30000, "wheels ");

        emp.displayDetails();
        mgr.displayDetails();
    }
}