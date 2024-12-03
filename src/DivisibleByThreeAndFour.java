import java.util.Scanner;

public class DivisibleByThreeAndFour {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number:");
        int number = input.nextInt();
        int counter = 0, average = 0;
        for (int i = 0; i <= number; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                counter++;
                average += i;

            }
        }
        if(counter==0)counter=1;

        average /= counter;
        System.out.println("The average of the numbers divided by 3 and 4 up to the number you entered:" + average);
    }
}
