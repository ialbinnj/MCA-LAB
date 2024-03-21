package GraphicS;
import java.util.*;

interface Figure{
    float rectangle();
    float square();
    float triangle();
    float circle();
}
public class Area implements Figure{
    static Scanner scn = new Scanner(System.in);
    public float rectangle(){
        System.out.print("Enter the Length : ");
        float length = scn.nextFloat();
        System.out.print("Enter the Breadth : ");
        float breadth = scn.nextFloat();
        System.out.println("Area is : "+(length*breadth));
        return 0;
    }
    public float square(){
        System.out.print("Enter the Side : ");
        float side = scn.nextFloat();
        System.out.println("Area is : "+(side*side));
        return 0;
    }
    public float triangle(){
        System.out.print("Enter the Base : ");
        float base = scn.nextFloat();
        System.out.print("Enter the Height : ");
        float height = scn.nextFloat();
        System.out.println("Area is : "+((base*height)/2));
        return 0;
    }
    public float circle(){
        System.out.print("Enter the Radius : ");
        float radius = scn.nextFloat();
        System.out.println("Area is : "+(3.14*radius*radius));
        return 0;
    }
}
