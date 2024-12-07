package Methods;

import java.util.Scanner;

public class RecursiveExponentiation {
    static int recExp(int base, int exp) {
        if (exp == 1) return base;
        else if (exp == 0) return 1;
        return base*recExp(base, exp - 1);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        while (true){
            System.out.println("Please enter the values for the exponentiation operation:");
            int a=input.nextInt();
            int b=input.nextInt();
            System.out.println(recExp(a,b));
            System.out.println("Press 0 to exit, or press any other key to continue.");
            int exit =input.nextInt();
            if(exit==0)break;
        }
    }
}
