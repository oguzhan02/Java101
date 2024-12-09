package Factory;

public class Employee {
    String name;
    int salary;
    int workHours;
    int hireYear;
    double raiseSalary;
    int bonus;
    double tax;
    double newSalary;

    public Employee(String name, int salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
        run();
    }

    void run(){
        tax();
        bonus();
        raiseSalary();
        string();
    }



    void tax() {
        if (this.salary < 1000) {
            this.tax=0;
        }if(this.salary>=1000){
            this.tax=this.salary*0.03;
        }

    }

    void bonus() {
        if (this.workHours > 40) {
            this.bonus= (this.workHours - 40) * 30;
        }
    }

    void raiseSalary() {
        if ((2024 - this.hireYear) < 10) {
            this.raiseSalary = this.salary * (5.0 / 100.0);
        } else if ((2024 - this.hireYear) < 20) {
            this.raiseSalary = this.salary * (1.0 / 10.0);
        }
        else {
            this.raiseSalary = this.salary * (15.0 / 100.0);
        }
    }
    void string(){
        newSalary=this.salary-tax+bonus+raiseSalary;
        System.out.println("Name\t:"+this.name);
        System.out.println("Salary\t:"+this.salary);
        System.out.println("Work Hours\t:"+this.workHours);
        System.out.println("Hire Year\t:"+this.hireYear);
        System.out.println("Tax\t:"+this.tax);
        System.out.println("Extra\t:"+this.bonus);
        System.out.println("Raise amount\t:"+this.raiseSalary);
        System.out.println("Salary with tax and extras:\t:"+(this.salary-tax+bonus));
        System.out.println("Final salary:\t:"+newSalary);

    }

}
