package Classes;

public class Course {
    Teacher courseTeacher;
    String name;
    int code;
    String prefix;
    int note;
    int oralGrade;
    Course(String name,int code,String prefix){
        this.name=name;
        this.code=code;
        this.prefix=prefix;
        this.note=0;
    }
    public  void addTeacher(Teacher teacher){
        if(this.prefix.equals(teacher.branch)){
            this.courseTeacher=teacher;
        }else{
            System.out.println("Teacher and course are not compatible");
        }
    }
    public void printTeacher(){
        if(courseTeacher!=null){
            System.out.println(this.name+" teacher "+courseTeacher.name);
        }else {
            System.out.println("This course has no teacher assigned");
        }
    }


}