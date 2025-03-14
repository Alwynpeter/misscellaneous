import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class NameManager {
    private ArrayList<String> names;
    private Scanner scanner;

    public NameManager() {
        this.names = new ArrayList<>();
        this.scanner = new Scanner(System.in);
    }

    public void addName() {
        System.out.print("Enter a name to add: ");
        String name = scanner.nextLine();
        names.add(name);
        System.out.println("Name '" + name + "' added successfully.");
    }

    public void removeName() {
        System.out.print("Enter a name to remove: ");
        String name = scanner.nextLine();
        if (names.remove(name)) {
            System.out.println("Name '" + name + "' removed successfully.");
        } else {
            System.out.println("Name '" + name + "' not found in the list.");
        }
    }

    public void searchName() {
        System.out.print("Enter a name to search: ");
        String name = scanner.nextLine();
        if (names.contains(name)) {
            System.out.println("Name '" + name + "' found in the list.");
        } else {
            System.out.println("Name '" + name + "' not found in the list.");
        }
    }

    public void sortNames() {
        Collections.sort(names);
        System.out.println("Names sorted successfully.");
    }

    public void displayNames() {
        if (names.isEmpty()) {
            System.out.println("No names in the list.");
        } else {
            System.out.println("Names in the list:");
            for (int i = 0; i < names.size(); i++) {
                System.out.println((i + 1) + ". " + names.get(i));
            }
        }
    }

    public void run() {
        while (true) {
            System.out.println("\nName Manager Menu:");
            System.out.println("1. Add a name");
            System.out.println("2. Remove a name");
            System.out.println("3. Search for a name");
            System.out.println("4. Sort names");
            System.out.println("5. Display names");
            System.out.println("6. Quit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline left-over

            switch (choice) {
                case 1:
                    addName();
                    break;
                case 2:
                    removeName();
                    break;
                case 3:
                    searchName();
                    break;
                case 4:
                    sortNames();
                    break;
                case 5:
                    displayNames();
                    break;
                case 6:
                    System.out.println("Goodbye!");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    public static void main(String[] args) {
        NameManager nameManager = new NameManager();
        nameManager.run();
    }
}