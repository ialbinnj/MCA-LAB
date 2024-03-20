import java.util.Scanner;
class Person{
    String name;
    String gender;
    String address;
    int age;
    Person(String name,String gender,String address,int age){
        this.name = name;
        this.gender = gender;
        this.address = address;
        this.age = age;
    }
}
class Employee extends Person{
    int empid;
    String company_name;
    String qualification;
    double salary;
    Employee(String name,String gender,String address,int age,int empid,String company_name,String qualification,double salary){
        super(name,gender,address,age);
        this.empid = empid;
        this.company_name = company_name;
        this.qualification = qualification;
        this.salary = salary;
    }
}
class Teacher extends Employee{
    String subject;
    String department;
    int teacherid;
    Teacher(String name,String gender,String address,int age,int empid,String company_name,String qualification,double salary,String subject,String department,int teacherid){
        super(name,gender,address,age,empid,company_name,qualification,salary);
        this.subject = subject;
        this.department = department;
        this.teacherid = teacherid;
    }
    void disp(){
        System.out.println("Name : "+name);
        System.out.println("Gender : "+gender);
        System.out.println("Address : "+address);
        System.out.println("Age : "+age);
        System.out.println("EmpId : "+empid);
        System.out.println("Company Name : "+company_name);
        System.out.println("Qualification : "+qualification);
        System.out.println("Salary : "+salary);
        System.out.println("Subject : "+subject);
        System.out.println("Department : "+department);
        System.out.println("Teacher Id : "+teacherid);
    }
}
public class Pro12 {
    public static void main(String[] args) {
        int i;
        Scanner scn = new Scanner(System.in);
        Teacher teacher[] = new Teacher[10];
        System.out.print   ("Enter total no of Teachers : ");
        int n = scn.nextInt();
        for(i=0;i<n;i++){
            System.out.println("\nEnter the details of teacher "+(i+1));
            System.out.print("Name : ");
            String t1 = scn.next();
            System.out.print("Gender : ");
            String t2 = scn.next();
            System.out.print("Address : ");
            String t3 = scn.next();
            System.out.print("Age : ");
            int t4 = scn.nextInt();
            System.out.print("EmpId : ");
            int t5 = scn.nextInt();
            System.out.print("Company Name : ");
            String t6 = scn.next();
            System.out.print("Qualification : ");
            String t7 = scn.next();
            System.out.print("Salary : ");
            double t8 = scn.nextDouble();
            System.out.print("Subject : ");
            String t9 = scn.next();
            System.out.print("Department : ");
            String t10 = scn.next();
            System.out.print("Teacher Id : ");
            int t11 = scn.nextInt();
            teacher[i] = new Teacher(t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11);
        }
        for(i=0;i<n;i++){
            System.out.println("\nDetails of teacher "+(i+1));
            teacher[i].disp();
        }
    }
}
