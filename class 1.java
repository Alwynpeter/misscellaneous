import java.util.Scanner;

interface AreaPerimeter {
    public double area();
    public double perimeter();
}

class Rectangle implements AreaPerimeter {
    double l, b;

    public Rectangle() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length: ");
        l = sc.nextDouble();
        System.out.print("Enter breadth: ");
        b = sc.nextDouble();
    }

    @Override
    public double area() {
        return l * b;
    }

    @Override
    public double perimeter() {
        return 2 * (l + b);
    }
}

class Circle implements AreaPerimeter {
    double r;

    public Circle() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius: ");
        r = sc.nextDouble();
    }

    @Override
    public double area() {
        return 3.14 * r * r;
    }

    @Override
    public double perimeter() {
        return 2 * 3.14 * r;
    }
}

public class AreaPerimeterDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rectangle rectangle = null;
        Circle circle = null;

        System.out.print("\n1.Initialize\n2.Print Area\n3.Print Perimeter\n4.Exit: ");
        int n = sc.nextInt();

        do {
            switch (n) {
                case 1:
                    System.out.print("Enter 1 for Rectangle, 2 for Circle: ");
                    int shape = sc.nextInt();
                    if (shape == 1) {
                        rectangle = new Rectangle();
                    } else if (shape == 2) {
                        circle = new Circle();
                    } else {
                        System.out.println("---INVALID SHAPE INPUT---");
                    }
                    break;
                case 2:
                    if (rectangle != null) {
                        System.out.println("Area of Rectangle: " + rectangle.area());
                    } else if (circle != null) {
                        System.out.println("Area of Circle: " + circle.area());
                    } else {
                        System.out.println("---NO SHAPE INITIALIZED---");
                    }
                    break;
                case 3:
                    if (rectangle != null) {
                        System.out.println("Perimeter of Rectangle: " + rectangle.perimeter());
                    } else if (circle != null) {
                        System.out.println("Perimeter of Circle: " + circle.perimeter());
                    } else {
                        System.out.println("---NO SHAPE INITIALIZED---");
                    }
                    break;
                case 4:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("---INVALID INPUT---");
                    break;
            }
            if (n != 4) {
                System.out.print("\n1.Initialize\n2.Print Area\n3.Print Perimeter\n4.Exit: ");
                n = sc.nextInt();
            }
        } while (n != 4);
        sc.close();
    }
}
