class cpudemo{
    int price;
    public cpudemo(int price)
    {
        this.price=price;
    }
    public void display1()
    {
        System.out.println("Price is "+price);
    }
    class  processor{
        int np;
        String manufacturer;
        public processor(int np,String manufacturer)
        {
            this.np=np;
            this.manufacturer=manufacturer;
        }
        public void display2()
        {
            
            System.out.println("the no.of processor and manufacturer is "+np+" "+manufacturer);
        }
    }
    public static class ram
    {
      String memory;
      String manufacturer;
      public ram(String memory,String manufacturer)
      {
        this.memory=memory;
        this.manufacturer=manufacturer;
      }
      public void display3()
      {
        System.out.println("RAM SPEC IS" +memory+" "+manufacturer);
      }
    }
}
public class cpu{
    public static void main(String[]args)
    {
        cpudemo c1=new cpudemo(25);
        c1.display1();
        cpudemo.processor p1=c1.new processor(10,"Intel");
        p1.display2();
        cpudemo.ram r1=new cpudemo.ram("16GB","nivde");
        r1.display3();
    }
}