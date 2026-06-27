public class Square extends Shape {
    private int side;

    // Creates a square using position and side length
    public Square(Coordinates coord, int side) {
        super(4, coord);
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    public double getArea() {
        return side * side;
    }

    public double getPerimeter() {
        return 4 * side;
    }

    // Scales the position and side length
    public void scale(int factor, boolean sign) {
        super.scale(factor, sign);

        if (factor == 0) {
            return;
        }

        if (sign) {
            side = side * factor;
        } else {
            side = side / factor;
        }
    }
    public String display() {
        return String.format(
                "Square: position (%s), side = %d, area = %.2f, perimeter = %.2f",
                getCoordinates().display(), side, getArea(), getPerimeter());
    }
}
