package Design-Patterns;

/*
## Rules for Immutable Class

1.Declare the class as final
    → So it cannot be subclassed.

2.Make all fields private and final
    → So they can only be set once.

3.Initialize fields via a constructor
    → Assign values when the object is created.

4.Do not provide setter methods
    → Only getters allowed.

5.Ensure deep copy for mutable fields
    → If your class has references to mutable objects
        (like arrays, collections, or custom objects),
        return a copy instead of the actual reference.

 */

//Rule 1 : final class
public final class Immutable{
    //Rule 2: private fields
    private final String name;
    private final int age;
    private final Address address;

    //Rule 3
    public Student(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        // Rule 5: Deep copy for mutable object
        this.address = new Address(address.getCity(), address.getState());
    }


    //Rule 4
    //Getters to access the values
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public Address getAddress() {
        return address;
    }
    // No Setter provided. so that no value can be modified
}


//Mutalble class
class Address {
    private String city;
    private String state;

    public Address(String city, String state) {
        this.city = city;
        this.state = state;
    }

    //Provide getters to access value

    // Provide setters make this mutable

}