package Arrays;

import java.util.HashSet;

public class RepeatedEvenNumbers {
    public static void main(String[] args){
        int [] numbers ={1,2,3,4,2,4,8,10,22,10,120,55,56,55,120,87,89,88};
        /*
        int [] control=new int[numbers.length];
        int j=0;
       for(int i=0;i<numbers.length;i++){
           if(numbers[i]%2==0){
               for(j=i+1;j< numbers.length;j++){
                   if(numbers[i]==numbers[j]){
                       System.out.println(numbers[i]);
                       break;
                   }
               }
           }
       }
         */
        HashSet<Integer> evens = new HashSet<>();
        HashSet<Integer> duplicates = new HashSet<>();
        for (int number : numbers) {
            if (number % 2 == 0) {
                if (!evens.add(number)) {
                    duplicates.add(number);
                }
            }
        }

        System.out.println("Repeated even numbers:");
        for (int number : duplicates) {
            System.out.println(number);
        }

    }
}




