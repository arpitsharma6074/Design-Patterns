package Design-Patterns.SOLID.Dependency-Inversion-Principle;

Public class DIP1{
/*
    The Dependency Inversion Principle states that high-level modules should not
    depend on low-level modules. Both should depend on abstractions. Additionally,
    abstractions should not depend on details; details should depend on abstractions.

    This principle is often confused with dependency injection but is a broader concept.
    It promotes loose coupling between components.
 */
}

//Example
//Consider a Store class that directly depends on a concrete CreditCard class.

// Bad example - violates DIP
class CreditCard {
    public void pay() {
        System.out.println("Paying with credit card.");
    }
}

class Store {
    private CreditCard creditCard;

    public Store() {
        this.creditCard = new CreditCard();
    }

    public void purchase() {
        creditCard.pay();
    }
}

/*
    The Store is tightly coupled to CreditCard. If you wanted to add a new
    payment method, like DebitCard, you would have to modify the Store class.
 */