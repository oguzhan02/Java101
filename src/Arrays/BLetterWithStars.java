package Arrays;

public class BLetterWithStars {
    public static void main(String[] args){
        String[][] letter = new String[5][3];
        for (int i=0;i<5;i++){
            for(int j =0;j<3;j++){
                if(i%2==0 && j<2){
                    letter[i][j]="* ";
                }else if(i%2==1 && j%2==0){
                    letter[i][j]="* ";
                }else{
                    letter[i][j]="  ";
                }
                System.out.print(letter[i][j]);
            }
            System.out.println();
        }


    }
}
