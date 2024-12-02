import java.util.Scanner;

public class GreenGrocer {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int pears,apple,tomato,banana,eggplant;
        final double pearsPrice=2.14,applePrice=3.67,bananaPrice=0.95,tomatoPrice=1.11,eggPlantPrice=5;
        System.out.println("How many kilos of pears?");
        pears=input.nextInt();
        System.out.println("How many kilos of apples?");
        apple=input.nextInt();
        System.out.println("How many kilos of bananas?");
        banana=input.nextInt();
        System.out.println("How many kilos of eggplants?");
        eggplant=input.nextInt();
        System.out.println("How many kilos of tomatoes?");
        tomato=input.nextInt();
        double total=(bananaPrice*banana)+(applePrice*apple)+(tomatoPrice*tomato)+(eggplant*eggPlantPrice)+(pearsPrice*pears);
        System.out.println("Total Price is "+total);



    }
}
