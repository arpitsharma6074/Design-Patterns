package Design-Patterns.SOLID.Interface-Segregation-Principle;

public class ISP2{
/*
     This principle, named after Barbara Liskov, states that objects of a superclass
     should be replaceable with objects of its subclasses without affecting the
     correctness of the program. In simpler terms, a subclass should extend its
     superclass without changing its behavior.
 */
}
/*
    A better approach is to design the hierarchy in a way that all
    subclasses can perform the same actions as the superclass.
 */
// Good example - follows LSP
interface Flight {
    void fly();
}

class Bird {
    // common bird behaviors, e.g., eat()
}

class FlyingBird extends Bird implements Flight {
    @Override
    public void fly() {
        // flying logic
    }
}

class Ostrich extends Bird {
    // an ostrich can't fly, so it doesn't implement the Flight interface.
}

/*
Now, a client can rely on the Flight interface and use any object that
implements it, like FlyingBird, without fear of unexpected behavior.
 */