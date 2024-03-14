class CPU{
   double price;
   class Processor{
         void display(int noOfCores,String manufacturer){
            System.out.println("\n Processor \n No of Cores: "+noOfCores+"\n Manufacturer Name: "+manufacturer);
         }
   }
   static class Ram{
         void display(double memory,String manufacturer){
            System.out.println("\n RAm \n No of Memory: "+memory+"\n Manufacturer Name: "+manufacturer);
         }
   }
   void info(int nj){
      System.out.println(nj);
   }
}

public class Pro5{
   public static void main(String args[]){
       CPU mycpu=new CPU();
       CPU.Processor myprocessor = mycpu.new Processor();
       CPU.Ram myram = new CPU.Ram();
       myprocessor.display(25,"INTEL");
       myram.display(673,"HP");
   }
}
