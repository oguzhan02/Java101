import java.util.Scanner;

public class PowerCalculator {
    public static void main(String[] args){
        Scanner input =new Scanner(System.in);
        int exponent,base;
        System.out.println("Enter the base number ");
        base=input.nextInt();
        int result=1;
        System.out.println("Enter the power ");
        exponent=input.nextInt();
        for (int i=1;i<=exponent;i++){
            result*=base;
        }
        System.out.println(result);

    }
}
