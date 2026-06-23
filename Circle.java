public class Circle extends Shape {
    private int radius;

    // Creates a circle using centre position and radius
    public Circle(Coordinates coord, int radius) {
        super(0, coord);
        this.radius = radius;
    }


    public int getRadius() {
        return radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    // Scales the position and radius
    public void scale(int factor, boolean sign) {
        super.scale(factor, sign);

        if (factor == 0) {
            return;
        }

        if (sign) {
            radius = radius * factor;
        } else {
            radius = radius / factor;
        }
    }

    // Shows all the circle information
    public String display() {
        return String.format(
                "Circle: centre (%s), radius = %d, area = %.2f, perimeter = %.2f",
                getCoordinates().display(), radius, getArea(), getPerimeter());
    }
}
