import java.util.Scanner;

public class Atm {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String username, password;
        int rights = 3, balance = 3000, selected, amount;
        while (rights != 0) {
            System.out.print("Enter your username: ");
            username = input.nextLine();
            System.out.print("Enter your password: ");
            password = input.nextLine();
            if (username.equals("oguzhan") && password.equals("dev123")) {
                System.out.println("Hello and welcome to the iron bank");
                do {
                    System.out.println(
                            "1-Deposit\n" +
                                    "2-Withdraw\n" +
                                    "3-Check Balance\n" +
                                    "4-Exit");
                    System.out.print("Please choose an option from the menu above: ");
                    selected = input.nextInt();
                    switch (selected) {
                        case 1:
                            System.out.println("Enter the money you want to deposit into your bank account: ");
                            amount = input.nextInt();
                            if (amount >= 0)
                                balance += amount;
                            else System.out.println("Incorrect entry");
                            break;
                        case 2:
                            System.out.println("Enter the money you want to withdraw from your bank account: ");
                            amount = input.nextInt();
                            if (amount > balance)
                                System.out.println("You cannot withdraw more money than your balance");
                            else balance -= amount;
                            System.out.println("Your new balance is: "+balance);
                            break;
                        case 3:
                            System.out.println("Your balance is: " + balance);
                            break;
                        case 4:
                            System.out.println("Thank you for choosing us.");
                            break;
                        default:
                            System.out.println("Incorrect entry");
                    }
                } while (selected != 4);  // Exit will break this loop
                break; // Exit the outer while loop when user selects 4 to exit
            } else {
                rights--;

                if (rights == 0) {
                    System.out.println("Incorrect username or password.");
                    System.out.println("Your bank account has been blocked!");
                    break;
                } else {
                    System.out.println("Incorrect username or password. Try again.");
                    System.out.println("You have " + rights + " attempts remaining.");
                }
            }

        }
    }
}
