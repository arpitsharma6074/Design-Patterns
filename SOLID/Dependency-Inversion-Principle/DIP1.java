package Design-Patterns.SOLID.Dependency-Inversion-Principle;

Public class DIP1{}

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