import java.util.Scanner;

class StudentDemo {
    int rollno;
    String name;
    int marks;
    static int count = 0;
    public StudentDemo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rollno:");
        rollno = sc.nextInt();
        System.out.println("Enter the name:");
        name = sc.next();
        System.out.println("Enter the marks:");
        marks = sc.nextInt();
        count++;   
    }
    public void displayStd(int rank) {
        System.out.println(name+" " +rank);
    }
}

public class student {
    public static void main(String[] args) {
        StudentDemo s[]=new StudentDemo[10];
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number of students");
        int n=sc.nextInt();
        for (int i=0;i<n;i++)
        {
            s[i]=new StudentDemo();
        }
        
        for (int i=0;i<StudentDemo.count;i++)
        {
            for(int j=i+1;j<StudentDemo.count;j++)
            {
                if(s[i].marks<s[j].marks)
                {
                    StudentDemo temp=s[i];
                    s[i]=s[j];
                    s[j]=temp;
                }
            }
        }
        System.out.println("THE STUENTS aND THEIR RANK IS");
        for (int i=0;i<n;i++)
        {
            s[i].displayStd(i+1);
        }
    }
}
