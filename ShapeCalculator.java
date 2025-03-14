import java.util.Scanner;

// Interface
interface Shape {
    double area();
    double perimeter();
}

// Circle Class implementing Shape interface
class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }
}

// Rectangle Class implementing Shape interface
class Rectangle implements Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double area() {
        return length * width;
    }

    @Override
    public double perimeter() {
        return 2 * (length + width);
    }
}

public class ShapeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            // Menu-driven program
            System.out.println("\nMenu:");
            System.out.println("1. Calculate Area and Perimeter of Circle");
            System.out.println("2. Calculate Area and Perimeter of Rectangle");
            System.out.println("3. Exit");
            System.out.print("Enter your choice (1/2/3): ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // For Circle
                    System.out.print("Enter the radius of the circle: ");
                    double radius = scanner.nextDouble();
                    Circle circle = new Circle(radius);
                    System.out.printf("Area of Circle: %.2f\n", circle.area());
                    System.out.printf("Perimeter of Circle: %.2f\n", circle.perimeter());
                    break;

                case 2:
                    // For Rectangle
                    System.out.print("Enter the length of the rectangle: ");
                    double length = scanner.nextDouble();
                    System.out.print("Enter the width of the rectangle: ");
                    double width = scanner.nextDouble();
                    Rectangle rectangle = new Rectangle(length, width);
                    System.out.printf("Area of Rectangle: %.2f\n", rectangle.area());
                    System.out.printf("Perimeter of Rectangle: %.2f\n", rectangle.perimeter());
                    break;

                case 3:
                    System.out.println("Exiting the program.");
                    break;

                default:
                    System.out.println("Invalid choice, please try again.");
            }
        } while (choice != 3);

        scanner.close();
    }
}
