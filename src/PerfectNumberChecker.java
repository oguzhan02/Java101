import java.util.Scanner;

public class PerfectNumberChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number you want to check: ");
        int isPerfect = input.nextInt();
        int total = 0;
        for (int i = 1; i < isPerfect; i++) {
            if (isPerfect % i == 0) {
                total += i;
            }
        }
        if (total == isPerfect)
            System.out.println(isPerfect + " is a perfect number");
        else System.out.println(isPerfect + " isn't a perfect number");
    }
}
