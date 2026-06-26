public class Rectangle extends Shape {
    private int width;
    private int length;

    // Creates a rectangle using position width and length
    public Rectangle(Coordinates coord, int width, int length) {
        super(4, coord);
        this.width = width;
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

    public double getArea() {
        return width * length;
    }

    public double getPerimeter() {
        return (2 * width) + (2 * length);
    }

    // Scales the position width and length
    public void scale(int factor, boolean sign) {
        super.scale(factor, sign);

        if (factor == 0) {
            return;
        }

        if (sign) {
            width = width * factor;
            length = length * factor;
        } else {
            width = width / factor;
            length = length / factor;
        }
    }

    // Shows all the informaton
    public String display() {
        return String.format(
                "Rectangle: position (%s), width = %d, length = %d, area = %.2f, perimeter = %.2f",
                getCoordinates().display(), width, length, getArea(), getPerimeter());
    }
}
