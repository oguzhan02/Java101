import java.util.Scanner;

public class CombinationCalculation {
    public static void main(String[] args) {
        // The combination formul :C(n,r) = n! / (r! * (n-r)!)
        Scanner input=new Scanner(System.in);
        double num1,num2;
        double result;
        System.out.println("Enter the numbers whose combination will be calculated as C(n,r) in order:");
        num1=input.nextInt();
        num2=input.nextInt();
        result=factorial(num1)/(factorial(num2)*(factorial(num1-num2)));
        System.out.println(result);
    }

    public static double factorial (double number) {
        if(number<=1){
            return 1;
        }else {
            return number*factorial(number-1);
        }
    }
}
