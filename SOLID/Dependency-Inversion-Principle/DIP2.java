package Design-Patterns.SOLID.Dependency-Inversion-Principle;

public class DIP2 {}

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