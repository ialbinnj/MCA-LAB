import Arithmetic.ArithmeticOperations;
import java.util.*;

class Pro18{
    public static void main(String[] args){
        ArithmeticOperations a = new ArithmeticOperations();
        
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the Num1 : ");
        float num1 = scn.nextFloat();
        System.out.print("Enter the Num2 : ");
        float num2 = scn.nextFloat();
        
        a.add(num1,num2);
        a.sub(num1,num2);
        a.mult(num1,num2);
        a.divide(num1,num2);
    }
}
