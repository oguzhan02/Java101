import java.util.Scanner;

public class TicketPrice {
    public static void main(String[] args) {
        int ticketControl, distance, age;
        double totalPrice;
        String errorMsg = "You entered incorrect data!";
        Scanner input = new Scanner(System.in);
        System.out.println("Enter distance as km:");
        distance = input.nextInt();
        System.out.println("Enter your age:");
        age = input.nextInt();
        System.out.println("1=>One-way Ticket , 2=>Round-trip Ticket");
        ticketControl = input.nextInt();
        if (distance < 0 || age < 0 || (ticketControl != 1 && ticketControl != 2)) System.out.println(errorMsg);
        else {

            totalPrice = distance * 0.10;

            if (age < 12) totalPrice = totalPrice - (totalPrice * 0.5);
            else if (age <= 24) totalPrice = totalPrice - (totalPrice * 0.1);
            else if (age > 65) totalPrice = totalPrice - (totalPrice * 0.3);
            if (ticketControl == 2) {
                totalPrice = 2*(totalPrice - (totalPrice * 0.2));
            }
            System.out.println("Total Price:" + totalPrice);
        }


    }
}
