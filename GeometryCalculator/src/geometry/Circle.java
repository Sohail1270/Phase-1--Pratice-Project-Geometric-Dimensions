// Circle.java (Child Class)
package geometry;

public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void displayArea() {
        System.out.println("Circle Area: " + (Math.PI * radius * radius));
    }
}
