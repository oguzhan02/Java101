package MineFieldGame;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int rowSize;
        int columnSize;
        while (true) {
            System.out.println("Enter the row size:");
            rowSize = input.nextInt();
            System.out.println("Enter the column size:");
            columnSize = input.nextInt();

            if (rowSize >= 2 && columnSize >= 2) {
                break;
            } else {
                System.out.println("Please enter minimum dimensions of 2x2");
            }
        }
        // Create an instance of MineSwepper
        MineSwepper mineSwepper = new MineSwepper(rowSize, columnSize);

        input.close();
    }
}
