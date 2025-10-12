

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