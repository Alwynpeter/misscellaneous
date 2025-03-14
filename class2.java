import java.util.Scanner;
   interface printable{
    public void display();
    public void show();
   } 
   interface computable{
    public double area();
    public double perimeter();
    public double volume();

   }
     interface Drawable() {
        public void draw();
        
    }
       class  Rectangle implements printable,computable,Drawable 
        double length,width;
        Rectangle(double length,double width){
            this.length=length;
            this.width=width;
        }
        public void display(){
            System.out.println("length: "+length+" width: "+width);
        }
        public void show(){}
        public double area(){
            return length*width;
        }
        public double perimeter(){
            return 2*(length+width);
    }
    public double volume(){
        return -1;
    }
    public void draw(){
        System.out.println("Drawing a rectangle");
    }
    public class RDemo {
    
         public static void main(String[] args) {
            Rectangle r=new Rectangle(5,6);
            r.display();
            r.show();
            System.out.println("Area: "+r.area());
            System.out.println("perimeter: "+r.perimeter());
            System.out.println("volume: "+r.volume());
            r.draw();
            
    }
       

