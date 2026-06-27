import java.util.Scanner;

public class ShapeManagement {
    private static Scanner input = new Scanner(System.in);
    private static ShapeList shapes = new ShapeList();

    public static void main(String[] args) {
        int choice;

        do {
            showMenu();
            choice = readInt("Enter your choice: ");

            if (choice == 1) {
                addShape();
            } else if (choice == 2) {
                removeShape();
            } else if (choice == 3) {
                showOneShape();
            } else if (choice == 4) {
                showAreaAndPerimeter();
            } else if (choice == 5) {
                System.out.println(shapes.display());
            } else if (choice == 6) {
                translateAllShapes();
            } else if (choice == 7) {
                scaleAllShapes();
            } else if (choice == 0) {
                System.out.println("Program finished.");
            } else {
                System.out.println("Please choose a valid option.");
            }
        } while (choice != 0);
    }

    public static void showMenu() {
        System.out.println("\nShape Management Menu");
        System.out.println("1: add a shape");
        System.out.println("2: remove a shape by position");
        System.out.println("3: get information about a shape by position");
        System.out.println("4: area and perimeter of a shape by position");
        System.out.println("5: display information of all the shapes");
        System.out.println("6: translate all the shapes");
        System.out.println("7: scale all the shapes");
        System.out.println("0: quit program");
    }

    public static void addShape() {
        System.out.println("\nChoose the shape to add");
        System.out.println("1: Triangle");
        System.out.println("2: Rectangle");
        System.out.println("3: Circle");
        System.out.println("4: Square");

        int shapeChoice = readInt("Enter shape choice: ");

        if (shapeChoice == 1) {
            Coordinates p1 = readCoordinates("point 1");
            Coordinates p2 = readCoordinates("point 2");
            Coordinates p3 = readCoordinates("point 3");
            shapes.addShape(new Triangle(p1, p2, p3));
            System.out.println("Triangle added.");
        } else if (shapeChoice == 2) {
            Coordinates position = readCoordinates("rectangle position");
            int width = readPositiveInt("Enter width: ");
            int length = readPositiveInt("Enter length: ");
            shapes.addShape(new Rectangle(position, width, length));
            System.out.println("Rectangle added.");
        } else if (shapeChoice == 3) {
            Coordinates position = readCoordinates("circle centre");
            int radius = readPositiveInt("Enter radius: ");
            shapes.addShape(new Circle(position, radius));
            System.out.println("Circle added.");
        } else if (shapeChoice == 4) {
            Coordinates position = readCoordinates("square position");
            int side = readPositiveInt("Enter side: ");
            shapes.addShape(new Square(position, side));
            System.out.println("Square added.");
        } else {
            System.out.println("Invalid shape choice.");
        }
    }

    public static void removeShape() {
        int position = readInt("Enter the position to remove: ");
        Shape removedShape = shapes.removeShape(position);

        if (removedShape == null) {
            System.out.println("There is no shape in that position.");
        } else {
            System.out.println("Removed: " + removedShape.display());
        }
    }

    // Displays one shape 
    public static void showOneShape() {
        int position = readInt("Enter the position to display: ");
        Shape shape = shapes.getShape(position);

        if (shape == null) {
            System.out.println("There is no shape in that position.");
        } else {
            System.out.println(shape.display());
        }
    }

    // Displays the area and perimeter 
    public static void showAreaAndPerimeter() {
        int position = readInt("Enter the position: ");
        Shape shape = shapes.getShape(position);

        if (shape == null) {
            System.out.println("There is no shape in that position.");
        } else {
            System.out.printf("Area = %.2f\n", shape.getArea());
            System.out.printf("Perimeter = %.2f\n", shape.getPerimeter());
        }
    }

    // Moves all shapes by x distance and y distance
    public static void translateAllShapes() {
        int dx = readInt("Enter x distance: ");
        int dy = readInt("Enter y distance: ");
        shapes.translateShapes(dx, dy);
        System.out.println("All shapes translated.");
    }

    // Makes all shapes bigger or smaller
    public static void scaleAllShapes() {
        int factor = readPositiveInt("Enter the scale factor: ");
        System.out.println("1: increase");
        System.out.println("2: decrease");
        int signChoice = readInt("Choose scale type: ");

        if (signChoice == 1) {
            shapes.scale(factor, true);
            System.out.println("All shapes increased.");
        } else if (signChoice == 2) {
            shapes.scale(factor, false);
            System.out.println("All shapes decreased.");
        } else {
            System.out.println("Invalid scale type.");
        }
    }

    // Read x and y from the user and creates a Coordinates object
    public static Coordinates readCoordinates(String name) {
        System.out.println("Enter coordinates for " + name);
        int x = readInt("X: ");
        int y = readInt("Y: ");
        return new Coordinates(x, y);
    }

    // It read a number that must be bigger than zero
    public static int readPositiveInt(String message) {
        int number = readInt(message);
        while (number <= 0) {
            System.out.println("Please enter a number greater than 0.");
            number = readInt(message);
        }
        return number;
    }

    // Read a whole number from the user and avoiding error
    public static int readInt(String message) {
        while (true) {
            System.out.print(message);
            if (input.hasNextInt()) {
                return input.nextInt();
            }
            System.out.println("Please enter a whole number.");
            input.next();
        }
    }
}

    }
