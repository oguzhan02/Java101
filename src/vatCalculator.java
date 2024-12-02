import java.util.Scanner;
public class vatCalculator {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Amount ");
        float amount= input.nextInt();
        float amountWithVat;
        float vat=0;
        if(amount>=1000){
            amountWithVat=amount*((float)108/100 );
            vat=amountWithVat-amount;
        }else{
            amountWithVat=amount*((float) 118/100);
            vat=amountWithVat-amount;
        }
        System.out.println("w/o vat  amount:"+amount);
        System.out.println("With vat amount:"+amountWithVat);
        System.out.println("Amount of vat :"+vat);


    }
}
