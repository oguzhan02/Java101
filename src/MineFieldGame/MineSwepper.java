package MineFieldGame;

import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;

public class MineSwepper {
    public static int rowNumber;
    public static int columnNumber;

    public MineSwepper(int rowNumber, int columnNumber) {

        MineSwepper.rowNumber = rowNumber;
        MineSwepper.columnNumber = columnNumber;
        run();
    }

    public static void run() {
        String[][] mineBoard;
        mineBoard = createMineBoard(rowNumber, columnNumber);
        String[][] finalBoard;
        finalBoard = createFinalBoard(mineBoard);
        String[][] gameBoard = new String[rowNumber][columnNumber];
         replaceWithDash(gameBoard);
         printBoard(finalBoard);
        System.out.println("\n");

        boolean isWin = true;
        Scanner input = new Scanner(System.in);
        for (int k = 0; k < (rowNumber * columnNumber) * 3 / 4; k++) {

            printBoard(gameBoard);

            System.out.println("Enter a row number");
            int row = input.nextInt();
            System.out.println("Enter a column number:");
            int column = input.nextInt();
            if (row < 0 || row >= gameBoard.length || column < 0 || column >= gameBoard[row].length) {
                System.out.println("Incorrect input size exceeded");
                continue;
            }
            gameBoard[row][column] = finalBoard[row][column];

            if (gameBoard[row][column].equals("*")) {
                printBoard(finalBoard);
                System.out.println("Game Over");
                isWin = false;
                break;
            }
        }
        if (isWin) {
            printBoard(finalBoard);
            System.out.println("Congratulations on your win ");
        }
        input.close();
    }

    public static void printBoard(String[][] str) {
        for (String[] strings : str) {
            for (String string : strings) {
                System.out.print(string + " ");
            }
            System.out.println();
        }
    }

    public static String[][] createMineBoard(int rowNumber, int columnNumber) {
        int totalMine = (rowNumber * columnNumber) / 4;
        Random random = new Random();
        String[][] mineBoard = new String[rowNumber][columnNumber];
        while (totalMine > 0) {
            int row = random.nextInt(rowNumber);
            int column = random.nextInt(columnNumber);
            if (mineBoard[row][column] == null || !mineBoard[row][column].equals("*")) {
                mineBoard[row][column] = "*";
                totalMine--;
            }
        }
        return mineBoard;
    }

    public static String[][] createFinalBoard(String[][] mineBoard) {
        for (int i = 0; i < mineBoard.length; i++) {
            for (int j = 0; j < mineBoard[i].length; j++) {
                if (mineBoard[i][j] == null || !mineBoard[i][j].equals("*")) {
                    mineBoard[i][j] = mineCounter(mineBoard, i, j);
                }
            }
        }
        return mineBoard;
    }

    public static String mineCounter(String[][] str, int rowIndex, int columnIndex) {
        int counter = 0;
        for (int i = rowIndex - 1; i <= rowIndex + 1; i++) {
            for (int j = columnIndex - 1; j <= columnIndex + 1; j++) {
                if ((i >= 0 && i < str.length && j >= 0 && j < str[i].length)) {
                    if (str[i][j] != null && str[i][j].equals("*")) {
                        counter++;
                    }
                }
            }
        }
        return Integer.toString(counter);
    }

    public static void replaceWithDash(String[][] board) {
        for (String[] row : board) {
            Arrays.fill(row, "-");
        }
    }


}
