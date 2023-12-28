// Main.java (Main Class)
package geometry;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Creating objects for different geometric shapes
        Shape genericShape = new Shape();
        Rectangle rectangle = new Rectangle(5, 10);
        Circle circle = new Circle(7);

        // Creating an ArrayList to store shapes
        ArrayList<Shape> shapeList = new ArrayList<>();
        shapeList.add(genericShape);
        shapeList.add(rectangle);
        shapeList.add(circle);

        // Displaying areas using a loop and surrounded by try-catch-finally
        try {
            for (Shape shape : shapeList) {
                shape.displayArea();
            }
        } catch (Exception e) {
            System.err.println("An error occurred: " + e.getMessage());
        } finally {
            System.out.println("Program execution complete.");
        }
    }
}
