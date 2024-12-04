import java.util.Scanner;

public class MinMaxFinder {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int numberHolder,biggest=0,lowest=0,x;
        System.out.print("How many numbers will you enter: ");
        numberHolder=input.nextInt();
        for (int i=1;i<=numberHolder;i++){
            System.out.println("Enter the "+i+". number:");
            x=input.nextInt();
            if(i==1){
                biggest=x;
                lowest=x;
            }
            if(x>biggest){
                biggest=x;
            }
            if(x<lowest){
                lowest=x;
            }
        }
        System.out.println("The biggest number is: "+biggest);
        System.out.println("The lowest number is: "+lowest);
    }
}

