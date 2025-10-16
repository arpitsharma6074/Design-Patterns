package Design-Patterns.SOLID.Single-Responsibility-Principle;

public class SRP1 {

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