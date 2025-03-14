Computable.java

package Arithmetic;
public interface Computable{
    public double calculate();
} 



Add.java

package Arithmetic;
public class Add implements Computable{
    public double a,b;
    public Add(double a,double b){this.a=a;this.b=b;}
    @Override
    public double calculate(){return (a+b);}
}




Sub.java

package Arithmetic;
public class Sub implements Computable{
    public double a,b;
    public Sub(double a,double b){this.a=a;this.b=b;}
    @Override
    public double calculate(){return (a-b);}
}


Mul.java

package Arithmetic;
public class Mul implements Computable{
    public double a,b;
    public Mul(double a,double b){this.a=a;this.b=b;}
    @Override
    public double calculate(){return (a*b);}
}


TDemo.java

import Arithmetic.*;
public class TDemo{
    public static void main(String a[]){
        Add a1 = new Add(5,6);
        Sub s = new Sub(10,6);
        Mul m = new Mul(5,10);
        System.out.println("Sum="+a1.calculate()+"\nDifference="+s.calculate()+"\nProduct="+m.calculate());
    }
}