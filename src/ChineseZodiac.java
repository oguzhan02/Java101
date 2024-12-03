import java.util.Scanner;

public class ChineseZodiac {
    public static void main(String[] args) {
        int dateYear;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your birth year:");
        dateYear = input.nextInt();
        String chineseZodiac = "Your chinese zodiac horoscope is:";
        switch (dateYear % 12) {
            case 0:
                chineseZodiac += "Monkey";
                break;
            case 1:
                chineseZodiac += "Rooster";
                break;
            case 2:
                chineseZodiac += "Dog";
                break;
            case 3:
                chineseZodiac += "Pig";
                break;

            case 4:
                chineseZodiac+="Rat";
                break;
            case 5:
                chineseZodiac+="Ox";
                break;
            case 6:
                chineseZodiac+="Tiger";
                break;
            case 7:
                chineseZodiac+="Rabbit";
                break;
            case 8:
                chineseZodiac+="Dragon";
                break;
            case 9:
                chineseZodiac+="Snake";
                break;
            case 10:
                chineseZodiac+="Horse";
                break;
            case 11:
                chineseZodiac+="Goat";
                break;
            default:
                System.out.println("An error has appeared");
        }
        System.out.println(chineseZodiac);
    }
}
