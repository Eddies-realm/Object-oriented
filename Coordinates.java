// A point has an x value and a y value
public class Coordinates {
    private int x;
    private int y;

    // it runs when a new Coordinates object is created
    public Coordinates(int x, int y) {
        this.x = x;
        this.y = y;
    }

    
    public int getX() {
        return x;
    }

    /
    public int getY() {
        return y;
    }

    // distance from this point to another one
    public double distance(Coordinates p) {
        int xDifference = p.getX() - x;
        int yDifference = p.getY() - y;

        return Math.sqrt((xDifference * xDifference) + (yDifference * yDifference));
    }

    // Moves the point by adding dx to x and dy to y
    public void translate(int dx, int dy) {
        x = x + dx;
        y = y + dy;
    }

    // Scales the point
    // So if sign is true the values are multiplied
    // sign is false the values are divided
    public void scale(int factor, boolean sign) {
        if (factor == 0) {
            return;
        }

        if (sign) {
            x = x * factor;
            y = y * factor;
        } else {
            x = x / factor;
            y = y / factor;
        }
    }

    // Returns the point in text
    public String display() {
        return "X = " + x + ", Y = " + y;
    }
}
