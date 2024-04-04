package Arithmetic;

interface Operations {
    int add(float num1, float num2);
    int sub(float num1, float num2);
    int mult(float num1, float num2);
    float divide(float num1, float num2);
}

public class ArithmeticOperations implements Operations {
    public int add(float num1, float num2) {
        System.out.println(num1+" + "+num2+" = "+(num1 + num2));
        return 0;
    }
    public int sub(float num1, float num2) {
        System.out.println(num1+" - "+num2+" = "+(num1 - num2));
        return 0;
    }
    public int mult(float num1, float num2) {
        System.out.println(num1+" * "+num2+" = "+(num1 * num2));
        return 0;
    }
    public float divide(float num1, float num2) {
        System.out.println(num1+" / "+num2+" = "+(num1 / num2));
        return 0;
    }
}
