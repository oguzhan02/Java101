import java.util.Scanner;

public class PalindromicWords {
    static boolean isPalindromic(String str,int i,int j){
       // String reversed= new StringBuilder(str).reverse().toString();
        if(i>=j){
            return true;
        }else if(str.charAt(i)!=str.charAt(j)){
            return false;
        }
        return isPalindromic(str,i+1,j-1);
    }
    public static void main(String[] args){
        String word;
        Scanner input = new Scanner(System.in);
        int control =1;
        while(control!=0){
            System.out.println("Enter a word to check if it is palindromic:");
            word=input.next();
            System.out.println("Is the word palindromic? " + isPalindromic(word, 0, word.length() - 1));
            System.out.println("Press 0 to exit or any other number to continue:");
            control=input.nextInt();
        }
    }
}
