package Design-Patterns.SOLID.Single-Responsibility-Principle;

public class SRP1 {
//    Single Responsibility Principle (SRP)
//    This principle states that a class should have only one reason to change,
//    meaning it should have only one job or responsibility.
//    A good way to think about this is that a class should be responsible for
//    a single part of the functionality of the software.
}

// Bad example - violates SRP
class Employee {
    public double calculatePay() {
        // logic to calculate employee pay
        return 0.0;
    }
    public void generateReport() {
        // logic to generate a report for the employee
        System.out.println("Generating employee report...");
    }
}