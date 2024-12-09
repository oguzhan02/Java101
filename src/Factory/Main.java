package Factory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter employee's name:");
        String name = input.nextLine();
        System.out.println("Enter employee's salary:");
        int salary= input.nextInt();
        System.out.println("Enter employee's work hours:");
        int workHours=input.nextInt();
        System.out.println("Enter employee's hire year:");
        int hireYear = input.nextInt();
        Employee e1= new Employee(name,salary,workHours,hireYear);
        e1.string();


    }
}
