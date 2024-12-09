package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ClosestNumbers {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 5, 100, 200, -30, -55, 33, 55, 77, 66, 87, 98};
        Scanner input = new Scanner(System.in);
        boolean control = true;
        while (control) {

            System.out.println("Enter a number:");
            int number = input.nextInt();
            findClosest(numbers, number);
            System.out.println("If you want to exit enter 1");
            if (input.nextInt() == 1)
                control = false;
        }
        input.close();

    }

    static void findClosest(int[] arr, int value) {
        Arrays.sort(arr);
        System.out.println("Sorted Array: " + Arrays.toString(arr));


        int largestLess = Integer.MIN_VALUE;
        int smallestGreater = Integer.MAX_VALUE;

        for (int i:arr) {

            if (i < value) {
                largestLess = i;
            }
            else if (i > value) {
                smallestGreater = i;
                break;
            }
        }

        if (largestLess != Integer.MIN_VALUE) {
            System.out.println("The largest number less than the entered number: " + largestLess);
        } else {
            System.out.println("There is no number in the array less than the one you entered.");
        }

        if (smallestGreater != Integer.MAX_VALUE) {
            System.out.println("The smallest number greater than the entered number: " + smallestGreater);
        } else {
            System.out.println("There is no number in the array greater than the one you entered.");
        }
    }
}
