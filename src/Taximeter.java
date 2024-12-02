import java.util.Scanner;

public class Taximeter {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int distance;
        System.out.println("Enter please the distance:");
        distance=input.nextInt();
        double total=10+distance*2.2;
        total=total<20?20:total;
        System.out.println(total);

    }
}
