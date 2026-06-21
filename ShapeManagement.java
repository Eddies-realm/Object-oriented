import java.util.Scanner;
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
    }
