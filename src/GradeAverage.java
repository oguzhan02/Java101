import java.util.Scanner;

public class GradeAverage {
    public static void main(String[] args){
        int math,pyhsic,music,turkish,chemical,control=0;
        Scanner input= new Scanner(System.in);
        System.out.println("Your turkish grade?");
        turkish=input.nextInt();
        System.out.println("Your math grade?");
        math=input.nextInt();
        System.out.println("Your pyhsic grade?");
        pyhsic=input.nextInt();
        System.out.println("Your music grade?");
        music=input.nextInt();
        System.out.println("Your chemical grade?");
        chemical=input.nextInt();
        double average=0;
        int[] gradeList={turkish,math,pyhsic,music,chemical};
        for (int grade:gradeList){
            if (grade>=0&&grade<=100){
                average+=grade;
                control++;
            }
        }
        average=average/control;
        String message=average>=55?"Succeed "+average:"Failed "+average;
        System.out.println(message);




    }
}
