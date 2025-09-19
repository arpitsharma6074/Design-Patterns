package Design-Patterns.SOLID.Interface-Segregation-Principle;

public class ISP2{
/*
    The Interface Segregation Principle states that clients should not be forced to depend on interfaces they do not use. It’s better to have many small, specific interfaces than one large, all-encompassing interface.
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