// Base class Publisher
class Publisher {
    String publisherName;

    Publisher(String publisherName) {
        this.publisherName = publisherName;
    }
}

// Derived class Book from Publisher
class Book extends Publisher {
    String title;
    String author;

    Book(String title, String author, String publisherName) {
        super(publisherName);
        this.title = title;
        this.author = author;
    }

    void display() {
        System.out.println("Book Details:");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Publisher: " + publisherName);
    }
}

// Base class Department
class Department {
    String deptName;

    Department(String deptName) {
        this.deptName = deptName;
    }
}

// Derived class Employee from Department
class Employee extends Department {
    String empName;
    int empID;

    Employee(String empName, int empID, String deptName) {
        super(deptName);
        this.empName = empName;
        this.empID = empID;
    }

    void display() {
        System.out.println("\nEmployee Details:");
        System.out.println("Name: " + empName);
        System.out.println("Employee ID: " + empID);
        System.out.println("Department: " + deptName);
    }
}

// Thread to display book details
class BookThread extends Thread {
    Book book;

    BookThread(Book book) {
        this.book = book;
    }

    public void run() {
        book.display();
    }
}

// Thread to display employee details
class EmployeeThread extends Thread {
    Employee employee;

    EmployeeThread(Employee employee) {
        this.employee = employee;
    }

    public void run() {
        employee.display();
    }
}

// Main class
public class BookEmployeeThread {
    public static void main(String[] args) {
        // Creating book and employee objects
        Book book = new Book("Java Programming", "James Gosling", "Sun Microsystems");
        Employee employee = new Employee("Alice Johnson", 101, "Software Development");

        // Creating and starting threads
        BookThread bookThread = new BookThread(book);
        EmployeeThread employeeThread = new EmployeeThread(employee);

        bookThread.start();
        employeeThread.start();
    }
}
