import java.util.Scanner;

interface Calc {
    void area();
    void perimeter();
}

class Circle implements Calc {
    double pi = 3.14;
    @Override
    public void area() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Radius for area: ");
        int radius = input.nextInt();
        System.out.println("Area of Circle is: " + (pi * radius * radius));
    }
    public void perimeter() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Radius for perimeter: ");
        int radius = input.nextInt();
        System.out.println("Perimeter of Circle is: " + (2 * pi * radius));
    }
}

class Rectangle implements Calc {
    @Override
    public void area() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Length for area: ");
        int len = input.nextInt();
        System.out.println("Enter Breadth for area: ");
        int bre = input.nextInt();
        System.out.println("Area of Rectangle is: " + (len * bre));
    }
    public void perimeter() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Length for perimeter: ");
        int len = input.nextInt();
        System.out.println("Enter Breadth for perimeter: ");
        int bre = input.nextInt();
        System.out.println("Perimeter of Rectangle is: " + (2 * (len + bre)));
    }
}

public class Pro15 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        Circle Cobj = new Circle();
        Rectangle Robj = new Rectangle();
        int ch;
        do {
            System.out.println("1. Circle\n2. Rectangle\n3. Exit\n");
            System.out.print("Enter Choice: ");
            ch = input.nextInt();
            switch (ch) {
                case 1:
                    Cobj.area();
                    Cobj.perimeter();
                    break;
                case 2:
                    Robj.area();
                    Robj.perimeter();
                    break;
            }
        } while (ch != 3);
    }
}

