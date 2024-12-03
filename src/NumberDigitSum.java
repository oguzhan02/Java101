import java.util.Scanner;

public class NumberDigitSum {
    public static void main(String [] args){
        Scanner input =new Scanner(System.in);
        System.out.println("Enter a number:");
        int total=0;
        int number=input.nextInt();
        while(number>0){
            total+=number%10;
            number/=10;
        }
        System.out.println(total);
    }
}
