package Design-Patterns.SOLID.Interface-Segregation-Principle;

public class ISP2{}

//   A better approach is to break down the interface into smaller,
//   more specific ones.


// Good example - follows ISP
interface Printable {
    void print();
}
interface Scannable {
    void scan();
}
interface Faxable {
    void fax();
}


class SimplePrinter implements Printable {
    @Override
    public void print() {
        System.out.println("Printing...");
    }
}
class PhotoCopier implements Printable, Scannable {
    @Override
    public void print() {
        System.out.println("Printing...");
    }
    @Override
    public void scan() {
        System.out.println("Scanning...");
    }
}

/*
    Now, a class only needs to implement the interfaces for the functionality
    it actually supports.
 */