package Classes;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Course math = new Course("Math", 101, "MAT");
        Course physics = new Course("Physics", 102, "PHY");
        Course chemistry = new Course("Chemistry", 101, "CHE");

        Teacher t1 =new Teacher("Mehmet","333","MAT");
        Teacher t2 =new Teacher("Nurdan","444","PHY");
        Teacher t3 =new Teacher("Ahmet","555","CHE");
        Student s1 = new Student("Ömer",3,"221313",math,physics,chemistry);
        Student s2 = new Student("Metin",2,"221312",math,physics,chemistry);
        Student s3 = new Student("Emir",3,"221311",math,physics,chemistry);
        math.addTeacher(t1);
        physics.addTeacher(t2);
        chemistry.addTeacher(t3);
        System.out.println("In the math course, the exam grade is 80% and the oral exam is 20%.");
        System.out.println("In the physics course, the exam grade is 70% and the oral exam is 30%.");
        System.out.println("In the chemistry course, the exam grade is 60% and the oral exam is 40%.");
        s1.addBulkExamNote(40,60,70,55,66,77);
        s1.isPass();
        s2.addBulkExamNote(100,100,100,50,50,50);
        s2.isPass();
        s3.addBulkExamNote(80,70,60,60,70,80);
        s3.isPass();
        s1.printNote();

        /*Teacher t1=createTeacher();
        Teacher t2=createTeacher();
        Teacher t3=createTeacher();
        Student s1=createStudent(math,physics,chemistry);
        Student s2=createStudent(math,physics,chemistry);
        Student s3=createStudent(math,physics,chemistry);

         */
    }

    /*public static Teacher createTeacher() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the name of the teacher ");
        String name = input.nextLine();
        System.out.println("Enter the phone number:");
        String mphone = input.nextLine();
        System.out.println("Enter the short name of the course the teacher is teaching");
        String branch = input.nextLine();
        return new Teacher(name, mphone, branch);

    }
    public static Student createStudent(Course math,Course physics,Course chemistry){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the name of the student ");
        String name = input.nextLine();
        System.out.println("Enter the class:");
        int  classes = input.nextInt();
        System.out.println("Enter the student number:");
        String stuNo = input.nextLine();

        return  new Student(name,classes,stuNo,math,physics,chemistry);
    }

     */
}
