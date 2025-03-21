import java.util.Scanner;
interface Printable{
    public void display();
    public void show();
}
interface Computable{

public double area();
public double perimeter();
public double volume();  
}
interface Drawable{
    public void draw(); 
}
class Rectangle implements Printable,Computable,Drawable {

    double length,width;
    Rectangle(double length,double width){
        this.length = length;
        this.width = width;
    }

    @Override
    public void display() {
        System.out.println("Length: "+length+" Width: "+width);
    
    }
    public void show() {}
    public double area(){
    return length*width;

}
    public double perimeter(){
    return 2*(length+width);
    }
    public double volume(){
    return -1;
    }
    public void draw() {
    System.out.println("Drawing a rectangle");
    }
}
class Sphere implements Printable,Computable,Drawable {

    double radius;
    Sphere(double radius){
       
        this.radius = radius;
    }

    @Override
    public void display() {
        System.out.println("Radius "+radius);
    
    }
    public void show() {}
    public double area(){
    return 4* Math.PI * Math.pow (radius, 2);

}
    public double perimeter(){
    return 2* Math.PI * radius;
    }
    public double volume(){
    return (4/3)* Math.PI*Math.pow(radius, 3);
    }
    public void draw() {
    System.out.println("Drawing a sphere");
    }
}
public class RDemo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of rectangle");
        double length = sc.nextDouble();
        System.out.println("Enter the width of rectangle");
        double width = sc.nextDouble();
        Rectangle r = new Rectangle(length,width);

        
        r.display();
        r.show();
        System.out.println("area"+r.area());
        System.out.println("perimeter"+r.perimeter());
        System.out.println("volume"+r.volume());
        r.draw();

        System.out.println("\n enter the radius of sphere:");
        double radius = sc.nextDouble();
        Sphere s = new Sphere(radius);
        s.display();
        s.show();
        System.out.println("area"+s.area());
        System.out.println("perimeter"+s.perimeter());
        System.out.println("volume"+s.volume());
        s.draw();
    }
    

    }




