import java.util.Scanner;

public class Pro7{
  public static void main(String args[]){
  
     Scanner myInput=new Scanner(System.in);
     
     System.out.println("Enter the limit: ");
     int limit=myInput.nextInt();
     
     int[] myArray=new int[limit];
     
     System.out.println("Enter Array");
     for(int i=0;i<limit;i++){
        System.out.print("Array["+i+"]");
        myArray[i]=myInput.nextInt();
     }
     
     System.out.println("Enter the Search Element: ");
     int Searchele=myInput.nextInt();
     
     int temp=0;
     
     for(int i=0;i<myArray.length;i++){
        if(Searchele==myArray[i]){
           temp=1;
           break;
        }
     }
     
     if(temp==1) System.out.println("Element Founded");
     else System.out.println("Not Founded");
  }
}
