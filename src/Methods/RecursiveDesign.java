package Methods;

import java.util.Scanner;

public class RecursiveDesign {

    static void subtractAndAdd(int num) {
        System.out.print(num + " ");

        if (num > 0) {
            subtractAndAdd(num - 5);
        }

        if (num <= 0) {
            return;
        }

        System.out.print(num + " ");
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n =input.nextInt();
        subtractAndAdd(n);
        input.close();

    }
}
