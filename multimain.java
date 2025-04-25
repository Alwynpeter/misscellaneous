
import java.util.*;

class Fact implements Runnable{
    static final  Object lock = multimain.lock;
    static final 
    int v;
    public Fact(int va){
        v = va;
    }
    public void run(){
        synchronized(lock){
            while (!) {
                
            }
                for(int i =1;i<=v;i++){
                    if(v%i==0){
                        System.out.println(i);
                    }
                }
        }
    }
}
class Reverse implements Runnable{
    static final Object lock = multimain.lock;
    static boolean revdone = false;
    int reverse;
    int reve=0;
    int rem;
    public Reverse(int rev){
        reverse = rev;
    }
    public void run(){
        synchronized (lock){
            while(reverse>0){
                rem = reverse%10;
                reve = reve*10 +rem;
                reverse = reverse/10;
            }
            System.out.println(reve);
            lock.notifyAll();
        }
    }
}

public class multimain {
    public static void main(String[] args){
        static final Object lock = new Object();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number for which you want to find the factors");
        int num1 = sc.nextInt();
        Fact f = new Fact(num1);
        System.out.println("Enter the number to find reverse");
        int num2 = sc.nextInt();
        Reverse r = new Reverse(num2);
        Thread t1 = new Thread(f);
        Thread t2 = new Thread(r);
        t1.start();
        t2.start();
    }
}
