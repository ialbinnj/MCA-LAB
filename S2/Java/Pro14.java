import java.util.Scanner;
class Student{
    String name;
    int age;
    String course;
    float mark;
    Student(String name,int age,String course,float mark){
        this.name = name;
        this.age = age;
        this.course = course;
        this.mark = mark;
    }
}
class Sports extends Student{
    int sports_score;
    Sports(String name,int age,String course,float mark,int sports_score){
        super(name,age,course,mark);
        this.sports_score = sports_score;
    }
}
class Result extends Sports{
    Result(String name,int age,String course){
        super(name,age,course,mark,sports_score);
    }
    void disp(){
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
        System.out.println("Course : "+course);
        System.out.println("Mark : "+mark);
        System.out.println("Sports Score : "+sports_score);
    }
}
public class Pro14{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Enter the details of Student : ");
        System.out.print("Name : ");
        String name = scn.next();
        System.out.print("Age : ");
        int age = scn.nextInt();
        System.out.print("Course : ");
        String course = scn.next();
        //System.out.print("Mark : ");
        //int mark = scn.nextInt();
        //System.out.print("Sports Score : ");
        //int sp_score = scn.nextInt();
        System.out.println("Maths mark[50] : ");
        int data1 = scn.nextInt();
        System.out.println("English mark[50] : ");
        int data2 = scn.nextInt();
        System.out.println("Science mark[50] : ");
        int data3 = scn.nextInt();
        System.out.println("--------Sports-------");
        System.out.println("100mtr Running : ");
        int data4 = scn.nextInt();
        System.out.println("ShotPut : ");
        int data5 = scn.nextInt();
        Result stud1 = new Result(name,age,course,data1,data2,data3,data4,data5);
        System.out.println("\nStudent Report : ");
        stud1.disp();
    }
}
