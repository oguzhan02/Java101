import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        int year;
        System.out.println("Enter a year:");
        year=input.nextInt();
        if(year%4==0){
            if(year%100==0 && year%400!=0){
                System.out.println(year+" isn't a leap year");
            }
            else {
                System.out.println(year+" is a leap year");
            }
        }else {
            System.out.println(year+" isn't a leap year");
        }
    }
}
