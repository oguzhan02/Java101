import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int number = rand.nextInt(100);
        int rights = 5;
        boolean isFault = true;
        int userGuess;
        while (rights > 0) {
            System.out.println("Enter your guess:");
            userGuess = input.nextInt();
            if (userGuess == number) {
                System.out.println("You guessed right");
                break;
            } else if (userGuess < 0 || userGuess > 100) {
                if (isFault) {
                    System.out.println("The number is between 0 and 100, please enter within this range. If you enter incorrectly again, your right will be reduced.");
                    isFault = false;
                } else {
                    rights--;
                    System.out.println("Your remain right is " + rights);
                }
            } else if (userGuess < number) {
                System.out.println("Your number is smaller");
                rights--;
                System.out.println("Your remain right is " + rights);
            } else {
                System.out.println("Your number is larger");
                rights--;
                System.out.println("Your remain right is " + rights);
            }
        }
        if (rights == 0)
            System.out.println("The number was " + number);


        input.close();
    }
}
