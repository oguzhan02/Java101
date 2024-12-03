import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num1,num2,result=0,selected;
        System.out.println("Enter first number:");
        num1=input.nextInt();
        System.out.println("Enter second number:");
        num2=input.nextInt();
        System.out.println("1-Sum\n2-Multiple\n3-Divide\n4-Sub");
        System.out.println("Select the operation you want");
        selected=input.nextInt();
        switch (selected){
            case 1:result=num1+num2;
            break;
            case 2: result=num1*num2;
            break;
            case 3:if(num2==0){
                System.out.println("Error: Division by zero is not allowed.");
            }else{
                result=num1/num2;
            }
            break;
            case 4:result=num1-num2;
            break;
            default:
                System.out.println("Default Selection");
        }
        System.out.println("The result is:"+result);
    }
}
