
class Multiplication implements Runnable{
    public void run(){
        System.out.println("---Multiplication table---");
        for(int i=1;i<=10;i++){
            System.out.println("            "+5+"x"+i+"="+5*i);
            try{
                Thread.sleep(500);
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
class Factor implements Runnable{
    public void run(){
        System.out.println("---Factors of 36---");
        for(int i=1;i<=36;i++){
            if(36%i==0){
            System.out.println("Factor:"+i);
            }
            try{
                Thread.sleep(500);
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}

public class MultiFactor{
    public static void main(String []args){
        Multiplication m1= new Multiplication();
        Factor f1=new Factor();
        Thread t1=new Thread(m1);
        Thread t2=new Thread(f1);
        t1.start();
        t2.start();
    }
}