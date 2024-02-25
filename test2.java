class Employee 
{
    protected String name;
    protected int employeeId;
    protected double basicSalary;
    public Employee(String name, int employeeId, double basicSalary) 
    {
        this.name = name;
        this.employeeId = employeeId;
        this.basicSalary = basicSalary;
    }
    public double calculateSalary() 
    {
        // Calculate salary logic for a generic employee
        return basicSalary;
    }

    public void displayInfo() 
    {
        System.out.println("Name: " + name);
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Basic Salary: " + basicSalary);
    }
}

class Manager extends Employee 
{
    private double bonus;
    public Manager(String name, int employeeId, double basicSalary, double bonus) 
    {
        super(name, employeeId, basicSalary);
        this.bonus = bonus;
    }
    @Override
    public double calculateSalary() 
    {
        // Calculate salary for a manager (basic salary + bonus)
        return basicSalary + bonus;
    }
    @Override
    public void displayInfo() 
    {
        super.displayInfo();
        System.out.println("Role: Manager");
        System.out.println("Bonus: " + bonus);
        System.out.println("Total Salary: " + calculateSalary());
    }
}

class Programmer extends Employee 
{
    private int overtimeHours;
    public Programmer(String name, int employeeId, double basicSalary, int overtimeHours) 
    {
        super(name, employeeId, basicSalary);
        this.overtimeHours = overtimeHours;
    }
    @Override
    public double calculateSalary() 
    {
        // Calculate salary for a programmer (basic salary + overtime pay)
        double overtimePay = overtimeHours * 20; // Assuming overtime pay rate is $20 per hour
        return basicSalary + overtimePay;
    }
    @Override
    public void displayInfo() 
    {
        super.displayInfo();
        System.out.println("Role: Programmer");
        System.out.println("Overtime Hours: " + overtimeHours);
        System.out.println("Total Salary: " + calculateSalary());
    }
}

public class test2
{
    public static void main(String[] args) 
    {
        Manager manager = new Manager("John Doe", 101, 50000, 10000);
        Programmer programmer = new Programmer("Alice Smith", 102, 40000, 10);
        manager.displayInfo();
        System.out.println();
        programmer.displayInfo();
    }
}