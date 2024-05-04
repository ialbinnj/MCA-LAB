import java.util.Scanner;

class Mult extends Thread{
    int n;
    Mult(int n){
        this.n = n;
    }
    public void run(){
        for(int i=1;i<=this.n;i++){
            try{
                System.out.println("5"+"x"+i+"="+(i*5));
                sleep(1000);
            }catch(Exception e){}
        }
    }
}

class Prime extends Thread{
    int num;
    Prime(int num){
        this.num = num;
    }
    public void run(){
        for(int i=2;i<=this.num;i++){
            int f = 0;
            for(int j=2;j<=i/2;j++){
                if(i%j==0){
                    f=1;
                    break;
                }
            }
            if(f==0){
                try{
                    System.out.println(i+" is a prime Number");
                    sleep(1000);
                }catch(Exception e){}
            }
        }
    }
}

public class Pro19{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the Limit for Multiplication Table : ");
        int n = scn.nextInt();
        System.out.print("Enter the Limit for Prime Numbers : ");
        int m = scn.nextInt();
        Mult m1 = new Mult(n);
        Prime p1 = new Prime(m);
        m1.start();
        p1.start();
    }
}
