import java.util.*;

public class Pro9{
      int[] eNo = new int[20];
      int i;
      String[] eName = new String[50];
      float[] eSalary = new float[20];
	 
      void getinfo(int count){
	  Scanner inputInfo = new Scanner(System.in);
	  for(i=0;i<count;i++){
	        System.out.println("Enter the Emp_No:");
	        eNo[i]=inputInfo.nextInt();
	        System.out.println("Enter the Emp_Name:");
	        eName[i]=inputInfo.next();
	        System.out.println("Enter the Emp_Salary:");
	        eSalary[i]=inputInfo.nextFloat();   
	   } 
      }
      void printinfo(int count){
	  System.out.println("\nEmployee Information");
	  for(i=0;i<count;i++) System.out.println("\nNo:"+eNo[i]+"\nName:"+eName[i]+"\nSalary:"+eSalary[i]);
      }    
      void displayinfo(int emp_no, int count) {
	  int flag=0;
	  for(i=0;i<count;i++){
	      if(eNo[i]==emp_no){   
	    	System.out.println("No:"+eNo[i]);
	    	System.out.println("Name:"+eName[i]);
	    	System.out.println("Salary:"+eSalary[i]);
	    	flag=1;
	      }		
	  } 
	  if(flag==0) System.out.println("Record Not Found!");
       }
	               
       public static void main(String[] args){
	     Pro9 Empobj = new Pro9();
	     Scanner input = new Scanner(System.in);
	     System.out.println("Enter the number of records to be stored:");
	     int count = input.nextInt();
	     Empobj.getinfo(count);
	     Empobj.printinfo(count);
	     System.out.println("\nTo check a specific record");
	     System.out.print("Enter the Emp_No:");
	     int emp_no = input.nextInt();
	     Empobj.displayinfo(emp_no,count);    
	    }   
	}
