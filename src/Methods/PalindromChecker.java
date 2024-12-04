package Methods;

import java.util.Scanner;

public class PalindromChecker {
    static boolean isNumberPalindrome(int number) {
        int originalNumber = number;
        int reversedNumber = 0;


        while (number > 0) {
            reversedNumber = reversedNumber * 10 + number % 10;
            number /= 10;
        }


        return reversedNumber == originalNumber;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number to check if it is a palindrome (enter 0 or a negative number to exit):");

        while (true) {
            int number = input.nextInt();


            if (number <= 0) {
                System.out.println("Exiting the program. Goodbye!");
                break;
            }
            if (isNumberPalindrome(number)) {
                System.out.println(number + " is a palindromic number.");
            } else {
                System.out.println(number + " isn't a palindromic number.");
            }
        }

        input.close();
    }
}
