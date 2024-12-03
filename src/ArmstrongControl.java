
public class ArmstrongControl {
    public static void main(String[] args) {
       for(int i=100;i<=999;i++){
           if (isArmStrong(i))
               System.out.println(i);
       }

    }

    public static boolean isArmStrong(int number) {
        int basCounter = 0, total, x, result = 0,y;
        int temp = number;
        while (temp > 0) {
            temp /= 10;
            basCounter++;
        }
        temp = number;
        y=basCounter;
        while (temp > 0) {
            x = temp % 10;
            basCounter=y;
            total=1;
            while (basCounter > 0) {
                total *= x;
                basCounter--;
            }
            result += total;
            temp /= 10;
        }
        return number == result;

    }
}
