package Design-Patterns.SOLID.Interface-Segregation-Principle;

public class ISP1{
/*
     The Interface Segregation Principle states that clients should not be forced to
     depend on interfaces they do not use. It’s better to have many small,
     specific interfaces than one large, all-encompassing interface.
 */
}
// Imagine a large interface for a complex machine.
// Bad example - violates ISP
interface MultiFunctionPrinter {
    void print();
    void scan();
    void fax();
    void staple();
}


class SimplePrinter implements MultiFunctionPrinter {
    @Override
    public void print() {
        System.out.println("Printing...");
    }
    @Override
    public void scan() {
        // Not supported, but must be implemented
        throw new UnsupportedOperationException("Scanning not supported.");
    }
    @Override
    public void fax() {
        // Not supported
        throw new UnsupportedOperationException("Faxing not supported.");
    }
    @Override
    public void staple() {
        // Not supported
        throw new UnsupportedOperationException("Stapling not supported.");
    }
}
/*
    The SimplePrinter is forced to implement methods it doesn't use,
    which is a violation of ISP.
 */