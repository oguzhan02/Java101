
import java.sql.SQLOutput;
import java.util.Scanner;

public class Baslangic {
    public static void main(String[] args) {

      //  System.out.println("Java101 \"Lessons\" \' \t \n \r \b");



        // program to calculate grade point average
        int mat,fizik,kimya,turkce,tarih,muzik;
        Scanner input = new Scanner(System.in);
        System.out.println("Matematik Notunuz ?:");
        mat=input.nextInt();
        System.out.println("Kimya Notunuz ?:");
        kimya=input.nextInt();
        System.out.println("Fizik Notunuz?:");
        fizik=input.nextInt();
        System.out.println("Turkce Notunuz?:");
        turkce=input.nextInt();
        System.out.println("Tarih Notunuz?:");
        tarih=input.nextInt();
        System.out.println("Müzik Notunuz?:");
        muzik=input.nextInt();
        float ortalama;
        ortalama=(float)(mat+fizik+turkce+kimya+muzik+tarih)/6;
        System.out.println("Ortalamanız:"+ortalama);

        String durum;
        durum =ortalama>=60?"Sınıfı Geçti":"Sınıfta Kaldı";
        System.out.println(durum);




    }
}
