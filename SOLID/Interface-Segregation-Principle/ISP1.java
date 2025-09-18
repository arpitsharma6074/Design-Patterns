package Design-Patterns.SOLID.Interface-Segregation-Principle;

public class ISP1{
/*
This principle, named after Barbara Liskov, states that objects of a superclass
 should be replaceable with objects of its subclasses without affecting the
 correctness of the program. In simpler terms, a subclass should extend its
 superclass without changing its behavior.
 */
}

// Bad example - violates LSP
class Bird {
    public void fly() {
        // logic for flying
    }
}

class Ostrich extends Bird {
    @Override
    public void fly() {
        throw new UnsupportedOperationException("Ostriches can't fly.");
    }
}

/*
Here, a client using a Bird object might expect to call the fly() method
without issues. However, if an Ostrich object is substituted, it will throw
an exception, violating the client's expectation and the LSP.
 */