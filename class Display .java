class Display {
    public void area(int l, int b) {
        System.out.println("Area of Rectangle (int) is " + (l * b));
    }

    public void area(double l, double b) {
        System.out.println("Area of Rectangle (double) is " + (l * b));
    }

    public void area(int side) {
        System.out.println("Area of Square (int) is " + (side * side));
    }

    public void area(double side) {
        System.out.println("Area of Square (double) is " + (side * side));
    }

    // Method to calculate the area of a circle with double parameter and extra identifier
    public void area(double radius, String shape) {
        if ("circle".equals(shape)) {
            System.out.println("Area of Circle (double) is " + (Math.PI * radius * radius));
        }
    }

    // Method to calculate the area of a triangle with double parameters and extra identifier
    public void area(double base, double height, String shape) {
        if ("triangle".equals(shape)) {
            System.out.println("Area of Triangle (double) is " + (0.5 * base * height));
        }
    }
}

    public class Area {
    public static void main(String[] args) {
        Display a = new Display();
        
        // Rectangle areas
        a.area(10, 20);     // int parameters
        a.area(10.5, 20.5); // double parameters
        
        // Square areas
        a.area(5);          // int parameter
        a.area(5.5);        // double parameter
        
        // Circle area
        a.area(7.5, "circle"); // double parameter with identifier
        
        // Triangle area
        a.area(10.0, 15.0, "triangle"); // double parameters with identifier
    }
}
