import java.util.Scanner;

public class HoroscopeTeller {
    public static void main(String[] args) {
        int day, month;
        boolean isError = false;
        String horoscope = "";
        Scanner input = new Scanner(System.in);
        System.out.println("What month were you born in:");
        month = input.nextInt();
        System.out.println("The day you were born:");
        day = input.nextInt();
        switch (month) {
            case 1:
                if (day >= 1 && day <= 31) {
                    if (day <= 21) horoscope = "Oğlak";
                    else horoscope = "Kova";
                } else isError = true;
                break;
            case 2:
                if (day >= 1 && day <=29) {
                    if (day <= 19) horoscope = "Kova";
                    else horoscope = "Balık";
                } else isError = true;

                break;
            case 3:
                if (day >= 1 && day <= 31) {
                    if (day <= 20) horoscope = "Balık";
                    else horoscope = "Koç";
                } else isError = true;
                break;
            case 4:
                if (day >= 1 && day <= 30) {
                    if (day <= 20) horoscope = "Koç";
                    else horoscope = "Boğa";
                } else isError = true;
                break;
            case 5:
                if (day >= 1 && day <= 31) {
                    if (day <= 21) horoscope = "Boğa";
                    else horoscope = "İkizler";
                } else isError = true;
                break;
            case 6:
                if (day >= 1 && day <= 30) {
                    if (day <= 22) horoscope = "İkizler";
                    else horoscope = "Yengeç";
                } else isError = true;
                break;
            case 7:
                if (day >= 1 && day <= 31) {
                    if (day <= 22) horoscope = "Yengeç";
                    else horoscope = "Aslan";
                } else isError = true;
                break;
            case 8:
                if (day >= 1 && day <= 31) {
                    if (day <= 22) horoscope = "Aslan";
                    else horoscope = "Başak";
                } else isError = true;
                break;
            case 9:
                if (day >= 1 && day <= 30) {
                    if (day <= 22) horoscope = "Başak";
                    else horoscope = "Terazi";
                } else isError = true;
                break;
            case 10:
                if (day >= 1 && day <= 31) {
                    if (day <= 22) horoscope = "Terazi";
                    else horoscope = "Akrep";
                } else isError = true;
                break;
            case 11:
                if (day >= 1 && day <= 30) {
                    if (day <= 21) horoscope = "Oğlak";
                    else horoscope = "Kova";
                } else isError = true;
                break;
            case 12:
                if (day >= 1 && day <= 31) {
                    if (day <= 21) horoscope = "Yay";
                    else horoscope = "Oğlak";
                } else isError = true;
                break;
            default:isError=true;
        }
        if(isError) System.out.println(" entered an incorrect date");
        else System.out.println("Your horoscope:"+horoscope);
    }
}
