import java.util.Scanner;

public class BodyMassIndex {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double height,weight,bodyMassIndex;
        System.out.println("Enter your height(in meters):");
        height=input.nextDouble();
        System.out.println("Enter your weight(in kilograms):");
        weight=input.nextDouble();
        bodyMassIndex=weight/(height*height);
        System.out.println("Your body mass index is :"+bodyMassIndex);

    }
}
