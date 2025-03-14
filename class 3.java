import java.util.Scanner;

interface Computable {
    public double area();
    public double perimeter();
}

class Rectangle implements Computable {
    double length, width;

    Rectangle(double length, double width) {
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

class Circle implements Computable {
    double radius;

    Circle(double radius) {
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

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        double area, perimeter;
        
        do {
            System.out.println("Select an option:");
            System.out.println("1. Rectangle");
            System.out.println("2. Circle");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1: {
                    // For Rectangle
                    System.out.print("Enter the length of the rectangle: ");
                    double length = scanner.nextDouble();
                    System.out.print("Enter the width of the rectangle: ");
                    double width = scanner.nextDouble();
                    
                    Rectangle rectangle = new Rectangle(length, width);
                    area = rectangle.area();
                    perimeter = rectangle.perimeter();
                    
                    System.out.println("Area of Rectangle: " + area);
                    System.out.println("Perimeter of Rectangle: " + perimeter);
                    break;
                }
                case 2: {
                    // For Circle
                    System.out.print("Enter the radius of the circle: ");
                    double radius = scanner.nextDouble();
                    
                    Circle circle = new Circle(radius);
                    area = circle.area();
                    perimeter = circle.perimeter();
                    
                    System.out.println("Area of Circle: " + area);
                    System.out.println("Perimeter (Circumference) of Circle: " + perimeter);
                    break;
                }
                case 3:
                    System.out.println("Exiting the program.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
            System.out.println(); // For spacing
        } while (choice != 3);

        scanner.close();
    }
}
