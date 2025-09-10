package Design-Patterns;
public class Immutable{

}
Rules for Immutable Class

/*`
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