import java.util.Scanner;
public class HypetenuseCalculator {
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        double verticalEdge1,verticalEdge2,hypetenuse;
        System.out.println("Enter the vertical edges:");
        verticalEdge1=input.nextDouble();
        verticalEdge2=input.nextDouble();
        hypetenuse=hypetenuseCalculate(verticalEdge1,verticalEdge2);
        System.out.println(hypetenuse);



    }
    public static double hypetenuseCalculate(double num1,double num2){
        double hypetenuse=(num1*num1)+(num2*num2);
        hypetenuse=Math.sqrt(hypetenuse);
        return hypetenuse;
    }
}

