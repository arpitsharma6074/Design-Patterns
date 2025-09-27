package Design-Patterns.Facade-design;

// Client
public class FacadePatternDemo {
    public static void main(String[] args) {
        ComputerFacade computer = new ComputerFacade();

        computer.startComputer();
        System.out.println("---");
        computer.shutdownComputer();
    }
}