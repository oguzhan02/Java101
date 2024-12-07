package Methods;

import java.util.Scanner;

public class AdvancedCalculator {

    static int sum(int num1, int num2) {
        return num1 + num2;
    }

    static int minus(int num1, int num2) {
        return num1 - num2;
    }

    static double divide(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("A number can't be divided by 0.");
            return -404;
        }
        return num1 / num2;
    }

    static int times(int num1, int num2) {
        return num1 * num2;
    }

    static int exponentiation(int num1, int num2) {
        int x=num1;
        for (int i = 1; i < num2; i++) {
            num1 *=x;
        }
        return num1;
    }

    static int factorial(int num1) {
        if (num1 == 1) return 1;
        return num1 * factorial(num1 - 1);
    }

    static int modCalculate(int num1, int num2) {
        return num1 % num2;
    }

    static int calculateRectangleArea(int num1, int num2) {
        return num1 * num2;
    }

    static int calculateRectanglePerimeter(int num1, int num2) {
        return (num1 + num2) * 2;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String menu = """
                 1- Addition Operation
                 2- Subtraction Operation
                 3- Multiplication Operation
                 4- Division Operation
                 5- Exponentiation Calculation
                 6- Factorial Calculation
                 7- Modulus Operation
                 8- Rectangle Area and Perimeter Calculation
                 0- Exit
                 """;
        int a,b;
        while (true) {
            System.out.println(menu);
            System.out.println("Select the operation you want to perform:");
            int selected = input.nextInt();
            if (selected == 0) break;
            switch (selected) {
                case 1:
                     a = input.nextInt();
                     b = input.nextInt();
                    System.out.println(sum(a, b));
                    break;
                case 2:
                    a = input.nextInt();
                    b = input.nextInt();
                    System.out.println(minus(a, b));
                    break;
                case 3:
                    a = input.nextInt();
                    b = input.nextInt();
                    System.out.println(times(a, b));
                    break;
                case 4:
                    double num1,num2;
                    num1 = input.nextInt();
                    num2 = input.nextInt();
                    System.out.println(divide(num1,num2));
                    break;
                case 5:
                    a = input.nextInt();
                    b = input.nextInt();
                    System.out.println(exponentiation(a, b));
                    break;
                case 6:
                    int number = input.nextInt();
                    System.out.println(factorial(number));
                    break;
                case 7:
                    a = input.nextInt();
                    b = input.nextInt();
                    System.out.println(modCalculate(a, b));
                    break;
                case 8:
                    a = input.nextInt();
                    b = input.nextInt();
                    System.out.println("Rectangle's area:" + calculateRectangleArea(a, b) + "\nRectangle's perimeter:" + calculateRectanglePerimeter(a, b));
                    break;
                default:
                    System.out.println("Invalid input");
            }
        }

    }
}
