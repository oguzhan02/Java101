import java.util.Scanner;

public class TriangleWithStars {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows for the triangle: ");
        int rowCounter=input.nextInt();
        for (int i=rowCounter;i>=1;i--){
            int x=(i*2)-1;
            while (x>0){
                System.out.print("*");
                x--;
            }
            System.out.println();
        }
    }
}
