package Design-Patterns.SOLID.Single-Responsibility-Principle;

public class SRP2 {
//    The Employee class in previous implementation has two reasons to change:
//    if the pay calculation logic changes or if the report generation logic changes.
//    A better approach is to separate these responsibilities into different classes.
}


// Good example - follows SRP
class Employee {
    public double calculatePay() {
        // logic to calculate employee pay
        return 0.0;
    }
}
class EmployeeReportGenerator {
    public void generateReport(Employee employee) {
        // logic to generate a report for the employee
        System.out.println("Generating employee report...");
    }
}