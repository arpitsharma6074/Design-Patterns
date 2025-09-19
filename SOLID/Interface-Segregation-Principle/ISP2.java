package Design-Patterns.SOLID.Interface-Segregation-Principle;

public class ISP2{
/*
    The Interface Segregation Principle states that clients should not be
    forced to depend on interfaces they do not use. It’s better to have many
    small, specific interfaces than one large, all-encompassing interface.
 */
}

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