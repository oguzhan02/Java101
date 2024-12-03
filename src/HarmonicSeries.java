import java.util.Scanner;

public class HarmonicSeries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of n for the harmonic series.");
        double n=input.nextDouble();
        double i=1,total=0;
        while (i<=n){
            total+=1/i;
            i++;
        }
        System.out.println(total);
    }
}
