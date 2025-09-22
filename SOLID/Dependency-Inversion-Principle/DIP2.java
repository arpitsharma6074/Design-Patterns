package Design-Patterns.SOLID.Dependency-Inversion-Principle;

public class DIP2 {
/*
    The Dependency Inversion Principle states that high-level modules should not
    depend on low-level modules. Both should depend on abstractions. Additionally,
    abstractions should not depend on details; details should depend on abstractions.

    This principle is often confused with dependency injection but is a broader concept.
    It promotes loose coupling between components.
 */
}

//To follow DIP, you introduce an abstraction (an interface) for the payment method.

// Good example - follows DIP
interface PaymentMethod {
    void pay();
}

class CreditCard implements PaymentMethod {
    @Override
    public void pay() {
        System.out.println("Paying with credit card.");
    }
}

class DebitCard implements PaymentMethod {
    @Override
    public void pay() {
        System.out.println("Paying with debit card.");
    }
}

class Store {
    private PaymentMethod paymentMethod;

    // The payment method is 'injected' through the constructor.
    public Store(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void purchase() {
        paymentMethod.pay();
    }
}

/*
    Now, the Store class depends on the PaymentMethod interface,
    which is an abstraction. You can easily switch between CreditCard and
    DebitCard without changing the Store class itself.
 */