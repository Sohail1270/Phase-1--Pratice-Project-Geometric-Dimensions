// Rectangle.java (Child Class)
package geometry;

public class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public void displayArea() {
        System.out.println("Rectangle Area: " + (length * width));
    }
}