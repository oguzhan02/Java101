package Classes;

public class Student {
    String name, stuNo;
    int classes;
    Course math, physics, chemistry;
    double average;
    boolean isPass;

    Student(String name, int classes, String stuNo, Course math, Course physics, Course chemistry) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.math = math;
        this.chemistry = chemistry;
        this.physics = physics;
        this.isPass = false;
    }

    public double computeCourseGrade(Course c, double oralRatio) {
        return (c.oralGrade * oralRatio) + (c.note * (1 - oralRatio));
    }

    public void addBulkExamNote(int math, int chemistry, int physics, int chemistryOralGrade, int physicsOralGrade, int mathOralGrade) {
        if (math >= 0 && math <= 100) {
            this.math.note = math;
            this.math.oralGrade = mathOralGrade;
        }

        if (physics >= 0 && physics <= 100) {
            this.physics.note = physics;
            this.physics.oralGrade = physicsOralGrade;
        }

        if (chemistry >= 0 && chemistry <= 100) {
            this.chemistry.note = chemistry;
            this.chemistry.oralGrade = chemistryOralGrade;
        }
    }

    public void isPass() {
        if (this.math.note == 0 || this.physics.note == 0 || this.chemistry.note == 0){
            System.out.println("Grades not fully entered");
        }else {
            this.isPass=isCheckPass();
            printNote();
            System.out.println("Average:"+this.average);
            if(this.isPass){
                System.out.println("Passed the class");
            }else {
                System.out.println("failed in class");
            }
        }
    }
    public double calcAverage(){
        return this.average=(computeCourseGrade(this.math,0.2)+computeCourseGrade(this.physics,0.3)+computeCourseGrade(this.chemistry,0.4))/3.0;
    }
    public boolean isCheckPass(){
        calcAverage();
        return this.average>=55;
    }
    public void printNote(){
        System.out.println("=========================");
        System.out.println("Student : " + this.name);
        System.out.println("Math Grade : " + computeCourseGrade(this.math,0.2));
        System.out.println("Physics Grade : " + computeCourseGrade(this.physics,0.3));
        System.out.println("Chemistry Grade : " + computeCourseGrade(this.chemistry,0.4));
    }


}