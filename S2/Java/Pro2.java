import java.util.Scanner;

public class Pro2{
   public static void main(String args[]){
   	Scanner myInput=new Scanner(System.in);
   	System.out.println("Enter Row and Column");
   	int row=myInput.nextInt();
   	int col=myInput.nextInt();
   	
   	int firstMatrix[][]=new int[row][col];
   	int secondMatrix[][]=new int[row][col];
   	int sumMatrix[][]=new int[row][col];
   	
   	System.out.println("Enter First Matrix");
   	for(int i=0;i<row;i++){
   	   for(int j=0;j<col;j++){
   	      firstMatrix[i][j]=myInput.nextInt();
   	   }
   	}
   	
   	System.out.println("Enter Second Matrix");
   	for(int i=0;i<row;i++){
   	   for(int j=0;j<col;j++){
   	      secondMatrix[i][j]=myInput.nextInt();
   	   }
   	}
   	
   	for(int i=0;i<row;i++){
   	   for(int j=0;j<col;j++){
   	      sumMatrix[i][j]=firstMatrix[i][j]+secondMatrix[i][j];
   	   }
   	}
   	
   	System.out.println("Sum Matrix");
   	for(int i=0;i<row;i++){
   	   for(int j=0;j<col;j++){
   	      System.out.print(sumMatrix[i][j]+"\t");
   	   }
   	   System.out.println();
   	}
   }
}
