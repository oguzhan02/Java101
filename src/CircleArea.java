import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter radius of the circle:");
        double radius=input.nextDouble();
        System.out.println("Enter angle of the circle segment");
        double angle=input.nextDouble();
        double pi=3.14;
        double area;
        area=(pi*radius*radius)*(angle/360);
        System.out.println("Area of circle sector is "+area);

    }
}
