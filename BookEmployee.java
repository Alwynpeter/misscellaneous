class Publisher{
    String pname;
    public Publisher(String n){
        pname=n;
    }
    public void Display(){
        System.out.println("Publisher name:"+pname);
    }
}

class Book extends Publisher{
    String bname;
    int price;
    public Book(String n,String b,int p){
        super(n);
        bname=b;
        price=p;
    }
    public void Display(){
        System.out.println("Book title:"+bname+"Price:"+price);
        super.Display();
    }
}

class Department{
    String dname;
    public Department(String d){
        dname=d;
    }
    public void Display(){
        System.out.println("Department name:"+dname);
    }
}
class Employee extends Department{
    String ename;
    String role;
    public Employee(String d,String r,String e){
        super(d);
        role=r;
        ename=e;
    }
    public void Display(){
        System.out.println("")
    }
}

public class BookEmployee {
    
}
