import java.util.*;
public class Pro3{
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the real part and imaginary part of num 1");
        int a1 = scn.nextInt();
        int a2 = scn.nextInt();
        System.out.println("Enter the real part and imaginary part of num 2");
        int b1 = scn.nextInt();
        int b2 = scn.nextInt();
        System.out.println("First number is : ");
        System.out.println(a1+"+"+a2+"i");
        System.out.println("Second number is : ");
        System.out.println(b1+"+"+b2+"i");
        int c1 = a1+b1;
        int c2 = a2+b2;
        System.out.println("Sum is : ");
        System.out.println(c1+"+"+c2+"i");
    }
}
