
class Multi implements Runnable {
    public void run() {
        System.out.println("Multiplication Table for 5:");
        // try {
            for (int i = 1; i <= 10; i++) {
                System.out.println("5 * " + i + " = " + (5 * i));
            }
        // } catch (InterruptedException e) {
        //     e.printStackTrace();
        // }
    }
}

class Factors implements Runnable {
    private int number;

    public Factors(int number) {
        this.number = number;
    }

    public void run() {
        System.out.println("Factors of " + number + ":");
        // try {
            for (int i = 1; i <= number; i++) {
                if (number % i == 0) {
                    System.out.println(i);
                }
            }
        // } catch (InterruptedException  e) {
        //     e.printStackTrace();
        // }
    }
}

public class TDemo {
    public static void main(String[] args) {
        Multi mulTable = new Multi();
        Factors fact = new Factors(12);  

        Thread mulThread = new Thread(mulTable);
        Thread factorsThread = new Thread(fact);

        mulThread.start();
        factorsThread.start();

        try {
            mulThread.join();
            factorsThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Both operations completed.");
    }
}
