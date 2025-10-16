package Design-Patterns.SOLID.Liskov-Substitution-Principle;

Public class LSP2{}

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