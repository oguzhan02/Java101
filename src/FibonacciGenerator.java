import java.util.Scanner;

public class FibonacciGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many Fibonacci numbers would you like to print? ");
        int n = scanner.nextInt();

        int a = 0, b = 1;

        System.out.println("Fibonacci sequence:");


        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }

        scanner.close();
    }
}
