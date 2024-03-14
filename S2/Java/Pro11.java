import java.util.Scanner;

class Employee{
    int EmpId;
    String Name,Address;
    double Salary;
    Employee(int EmpId,String Name,double Salary,String Address){
        this.EmpId = EmpId;
        this.Name = Name;
        this.Salary = Salary;
        this.Address = Address;
    }
}
class Teacher extends Employee{
    String department;
    String Subject;
    Teacher(int EmpId,String Name,double Salary,String Address,String department,String Subject){
        super(EmpId,Name,Salary,Address);
        this.department = department;
        this.Subject = Subject;
    }
    void disp(){
        System.out.println("EmpId : "+EmpId);
        System.out.println("Name : "+Name);
        System.out.println("Salary : "+Salary);
        System.out.println("Address : "+Address);
        System.out.println("Department : "+department);
        System.out.println("Subject : "+Subject);
    }
}
public class Pro11 {
    public static void main(String[] args) {
        int i;
        Scanner scn = new Scanner(System.in);
        Teacher teacher[] = new Teacher[10];
        System.out.println("Enter total no of Teachers : ");
        int n = scn.nextInt();
        for(i=0;i<n;i++){
            System.out.println("\nEnter the Details of Teacher "+(i+1));
            System.out.print("EmpId: ");
            int t1 = scn.nextInt();
            System.out.print("Name: ");
            String t2 = scn.next();
            System.out.print("Salary: ");
            double t3 = scn.nextDouble();
            System.out.print("Address: ");
            String t4 = scn.next();
            System.out.print("Department: ");
            String t5 = scn.next();
            System.out.print("Subject: ");
            String t6 = scn.next();
            teacher[i] = new Teacher(t1,t2,t3,t4,t5,t6);
        }
        for(i=0;i<n;i++){
            System.out.println("\nDetails of Teacher "+(i+1));
            teacher[i].disp();
        }
    }
}
