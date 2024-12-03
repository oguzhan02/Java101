import java.util.Scanner;

public class DiamondWithStars {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of rows for the diamond.");
        int number=input.nextInt();
        int x;
        for (int i=number;i>=1;i--){
            x=(i*2)-1;
            for (int j=1;j<=number-i;j++){
                System.out.print(" ");
            }
            while (x!=0){
                System.out.print("*");
                x--;
            }
            for (int j=1;j<=number-i;j++){
                System.out.print(" ");
            }
            System.out.println();

        }
    }
}
