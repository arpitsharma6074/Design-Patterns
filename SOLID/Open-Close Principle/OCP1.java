package Design-Patterns.SOLID.Open-Close-Principle;
public class OCP1{
/*
    The Open/Closed Principle states that software
    entities(classes, modules, functions, etc.) should be open for extension
    but closed for modification. This means you should be able to
    add new functionality without changing existing code.

 */
}

// Bad example - violates OCP
class AreaCalculator {
    public double calculateArea(Object shape) {
        if (shape instanceof Rectangle) {
            Rectangle rect = (Rectangle) shape;
            return rect.width * rect.height;
        } else if (shape instanceof Circle) {
            Circle circle = (Circle) shape;
            return Math.PI * circle.radius * circle.radius;
        }
        return 0;
    }
}