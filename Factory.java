package Design-Patterns;

public class Factory {
    private Factory(){
    }
    public static Factory of(){
        // Logic for Object creation
    }
}

class Main{
    public static void main(String[] args) {
        // Instead of constructor directly we use static method for
        // constructor involcation
        Factory f = Factory.of();
    }
}