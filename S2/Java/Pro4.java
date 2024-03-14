import java.util.Scanner;


public class Pro4{
   public static void main(String args[]){
      Scanner myInput=new Scanner(System.in);
   	System.out.println("Enter Row and Column");
   	int row=myInput.nextInt();
   	int col=myInput.nextInt();
   	
   	int firstMatrix[][]=new int[row][col];
   	int secondMatrix[][]=new int[row][col];
   	int sumMatrix[][]=new int[row][col];
   	
   	System.out.println("Enter Matrix");
   	for(int i=0;i<row;i++){
   	   for(int j=0;j<col;j++){
   	      firstMatrix[i][j]=myInput.nextInt();
   	   }
   	}
   	if(row==col){
   	   for(int i=0;i<row;i++){
   	       for(int j=0;j<col;j++){
   	           secondMatrix[i][j]=firstMatrix[j][i];
   	       }
   	   }
   	   for(int i=0;i<row;i++){
   	       for(int j=0;j<col;j++){
   	           System.out.print(secondMatrix[i][j]+"\t");
   	       }
   	       System.out.println();
   	   }
   	   int res=0;
   	   for(int i=0;i<row;i++){
   	       for(int j=0;j<col;j++){
   	           if(firstMatrix[i][j]!=secondMatrix[i][j]){
   	              res=1;
   	              break;
   	           }
   	       }
   	   }
   	   if(res!=1) System.out.println("It is Symmetric"); 
   	   else System.out.println("It is not Symmetric");
   	}
   }
}
