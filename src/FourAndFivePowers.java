import java.util.Scanner;

public class FourAndFivePowers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        System.out.println("Enter a number:");
        number = input.nextInt();
        System.out.println("Powers of 4\t\tPowers of 5:");
        for (int i = 0; i < number; i++) {
            double powerOf4 = Math.pow(4, i);
            double powerOf5 = Math.pow(5, i);

            if (powerOf4 < number || powerOf5 < number) {
                if (powerOf4 < number && powerOf5 < number) {
                    System.out.printf("%-16.1f%-16.1f%n", powerOf4, powerOf5);
                } else if (powerOf4 < number) {
                    System.out.printf("%-16.1f%n", powerOf4);
                }
            }
        }


    }
}
