package Methods;

import java.util.Scanner;

public class RecursivePrime {
    static boolean recPrime(int num, int divisor) {
        if (num <= 1) {
            return false;
        }
        if (divisor == 1) {
            return true;
        }
        if (num % divisor == 0) {
            return false;
        }

        return recPrime(num, divisor - 1);


    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number :");
        int a = input.nextInt();
        if (recPrime(a, a / 2)) {
            System.out.println(a + " is a prime number");
        } else {
            System.out.println(a + " isn't a prime number");
        }
        input.close();

    }
}
