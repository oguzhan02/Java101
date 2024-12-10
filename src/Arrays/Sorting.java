package Arrays;
import java.util.Scanner;

public class Sorting {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = input.nextInt();
        int[] numbers=new int[size];
        for(int i=0;i<size;i++){
            numbers[i]=input.nextInt();
            if(i>=1 && numbers[i]<numbers[i-1]){
                swap(numbers,i);
                int j=i-1;
                while(j>0){
                    if(numbers[j]<numbers[j-1]){
                        swap(numbers,j);
                        j--;
                    }else{
                        break;
                    }
                }
            }
        }

        for (int i:numbers){
            System.out.println(i);
        }
    }

    public static void swap(int[] arr,int i ){
        int temp=arr[i];
        arr[i]=arr[i-1];
        arr[i-1]=temp;

    }

}
