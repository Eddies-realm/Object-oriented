import java.util.ArrayList;

// stores all the shapes in one list
public class ShapeList {
    private ArrayList<Shape> listOfShapes;

    // Creates an empty list of shapes
    public ShapeList() {
        listOfShapes = new ArrayList<Shape>();
    }

    // Adds one shape to the list
    public void addShape(Shape s) {
        listOfShapes.add(s);
    }

    // Positions are written as 1, 2, 3 for the user
    private boolean isValidPosition(int pos) {
        return pos >= 1 && pos <= listOfShapes.size();
    }

    // Moves every shape in the list
    public void translateShapes(int dx, int dy) {
        for (Shape shape : listOfShapes) {
            shape.translate(dx, dy);
        }
    }

    // Gets one shape using its position
    public Shape getShape(int pos) {
        if (isValidPosition(pos)) {
            return listOfShapes.get(pos - 1);
        }
        return null;
    }

    // Removes one shape using its posetion
    public Shape removeShape(int pos) {
        if (isValidPosition(pos)) {
            return listOfShapes.remove(pos - 1);
        }
        return null;
    }

    // Returns the area of one shape
    public double area(int pos) {
        Shape shape = getShape(pos);
        if (shape != null) {
            return shape.getArea();
        }
        return -1;
    }

    // Scales every shape in the list
    public void scale(int factor, boolean sign) {
        for (Shape shape : listOfShapes) {
            shape.scale(factor, sign);
        }
    }

    // Returns the perimeter of one shape
    public double perimeter(int pos) {
        Shape shape = getShape(pos);
        if (shape != null) {
            return shape.getPerimeter();
        }
        return -1;
    }

    // Returns how many shapes are in the list
    public int getNumberOfShapes() {
        return listOfShapes.size();
    }

    // Displays every shape in the list
    public String display() {
        if (listOfShapes.size() == 0) {
            return "There are no shapes in the list.";
        }

        String output = "";

        for (int i = 0; i < listOfShapes.size(); i++) {
            output = output + (i + 1) + ": ";
            output = output + listOfShapes.get(i).display() + "\n";
        }

        return output.toString();
    }
}
