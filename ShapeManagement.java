import java.util.Scanner;
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
