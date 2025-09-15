package Design-Patterns.SOLID.Open-Close-Principle;
public class OCP2{
/*
    The Open/Closed Principle states that software
    entities(classes, modules, functions, etc.) should be open for extension
    but closed for modification. This means you should be able to
    add new functionality without changing existing code.

 */
}
/*
If you wanted to add a new shape, like a Triangle, you’d have to modify
the AreaCalculator class in previous inmplementation.
To follow OCP, you can use a common interface.

 */
// Good example - follows OCP
interface Shape {
    double getArea();
}
class Rectangle implements Shape {
    public double width;
    public double height;
    @Override
    public double getArea() {
        return width * height;
    }
}
class Circle implements Shape {
    public double radius;
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
class AreaCalculator {
    public double calculateArea(Shape shape) {
        return shape.getArea();
    }
}
/*
Now, to add a new shape, you just need to create a new class that implements
the Shape interface. The AreaCalculator class remains unchanged.
 */