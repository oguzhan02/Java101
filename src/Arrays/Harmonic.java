package Arrays;
public class Harmonic {
    public static void main(String[] args){
        int[] numbers ={70,60,90,120,55,30,25};
        System.out.println(calculateHarmonic(numbers));

    }
    static double calculateHarmonic(int[] arr){
        double result,temp=0;
        for (int j : arr) {
            temp += 1.0 / (double) j;
        }
        result=arr.length/temp;
        return result;
    }



}
