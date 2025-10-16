package Design-Patterns.SOLID.Liskov-Substitution-Principle;

public class LSP1{
/*

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
    without issues. However, if an Ostrich object is substituted, it will
    throw an exception, violating the client's expectation and the LSP.

    A better approach is to design the hierarchy in a way that all subclasses
    can perform the same actions as the superclass.

 */