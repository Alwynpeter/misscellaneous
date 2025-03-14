import java.util.Scanner;
interface Objects{
    public double area();
    public double perimeter();
}
class Circle implements Objects{
    double radius;
    public Circle(double radius){
        this.radius = radius;
    }
    public double area(){
        return Math.PI * radius * radius;
    }
    public double perimeter(){
        return 2 * Math.PI * radius;
    }
    public void display(){
        System.out.println("Area of Circle: " + area());
        System.out.println("Perimeter of circle = " + perimeter());
    }
}

class Rectangle implements Objects{
    double length, width;
    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }
    public double area(){
        return length * width;
    }
    public double perimeter(){
        return 2 * (length + width);
    }
    public void display(){
        System.out.println("Area of Rectangle = " + area());
        System.out.println("Perimeter of Rectangle = " + perimeter());
    }
}
public class areaMain{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int choice;
        while (true) {
            System.out.println("1.Circle\n2.Rectangle\n3.Exit\nEnter your choice : ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                        System.out.println("Enter radius of the Circle : ");
                        double radius = sc.nextDouble();

                        Circle c = new Circle(radius);
                        c.display();
                    break;

                case 2:
                        System.out.println("Enter length and width of the Rectangle : ");
                        double length = sc.nextDouble();
                        double width = sc.nextDouble();

                        Rectangle r = new Rectangle(length, width);
                        r.display();

                    break;

                case 3:
                        sc.close();
                        System.exit(0);
                        
                default:System.out.println("Invalid Choice\n");
                    break;
            }
        }
    }
}