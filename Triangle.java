public class Triangle extends Shape {
    private Coordinates point1;
    private Coordinates point2;
    private Coordinates point3;

    public Triangle(Coordinates point1, Coordinates point2, Coordinates point3) {
        super(3, point1);
        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;
    }
  
    public double getSideA() {
        return point1.distance(point2);
    }

    public double getSideB() {
        return point2.distance(point3);
    }

    public double getSideC() {
        return point3.distance(point1);
    }

    public double getArea() {
        double a = getSideA();
        double b = getSideB();
        double c = getSideC();
        double s = (a + b + c) / 2;
        double areaValue = s * (s - a) * (s - b) * (s - c);

        if (areaValue < 0) {
            return 0;
        }

        return Math.sqrt(areaValue);
    }

    // Triangle perimeter is side A + side B + side C
    public double getPerimeter() {
        return getSideA() + getSideB() + getSideC();
    }

    // A triangle has three points so all of them must be moved
    public void translate(int dx, int dy) {
        point1.translate(dx, dy);
        point2.translate(dx, dy);
        point3.translate(dx, dy);
        setCoordinates(point1);
    }

    // Scales all three points of the triangle
    public void scale(int factor, boolean sign) {
        point1.scale(factor, sign);
        point2.scale(factor, sign);
        point3.scale(factor, sign);
        setCoordinates(point1);
    }

    public String display() {
        return String.format(
                "Triangle: point 1 (%s), point 2 (%s), point 3 (%s), area = %.2f, perimeter = %.2f",
                point1.display(), point2.display(), point3.display(), getArea(), getPerimeter());
    }
}
