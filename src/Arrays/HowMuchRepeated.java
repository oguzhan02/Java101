package Arrays;

import java.util.HashMap;


public class HowMuchRepeated {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 20, 10, 10, 20, 5, 20,30,50,25,20,10,150};

        HashMap<Integer, Integer> frequencyMap = new HashMap<>();

        for (int number : numbers) {
            if (frequencyMap.containsKey(number)) {
                frequencyMap.put(number, frequencyMap.get(number) + 1);
            } else {
                frequencyMap.put(number, 1);
            }
        }

        System.out.println("Frequencies:");
        for (int key : frequencyMap.keySet()) {
            System.out.println("The number " + key + " was repeated " + frequencyMap.get(key) + " times.");
        }


    }

}
