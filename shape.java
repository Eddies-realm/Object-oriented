public class Shape {
    private Coordinates position;
    private int sides;

    // Constructor for a general shape
    public Shape(int noOfSides, Coordinates coord) {
        sides = noOfSides;
        position = coord;
    }
  
    public Coordinates getCoordinates() {
        return position;
    }

    public int getSides() {
        return sides;
    }

    // Changing the position
    public void setCoordinates(Coordinates newcoord) {
        position = newcoord;
    }

    // Moves the shape by moving its main coordinate
    public void translate(int dx, int dy) {
        position.translate(dx, dy);
    }

    // Scales the shape by scaling its main coordinate
    public void scale(int factor, boolean sign) {
        position.scale(factor, sign);
    }

    // This is replaced by the child classes
    public double getArea() {
        return 0;
    }

    // This is replaced by the child classes
    public double getPerimeter() {
        return 0;
    }

    public String display() {
        return "Shape at " + position.display();
    }
}
