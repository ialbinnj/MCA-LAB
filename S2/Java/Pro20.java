import java.util.Scanner;

class Fibonacci implements Runnable{
    int n;
    Fibonacci(int n){
        this.n = n;
    }
    public void run(){
        int a=0,b=1,temp;
        for(int i=0;i<this.n;i++){
            try{
                System.out.println("Fibonacci Series : "+a);
                Thread.sleep(1000);
            }catch(Exception e){}
            temp = b;
            b=a+b;
            a=temp;
        }
    }
}

class Even implements Runnable{
    int n;
    Even(int n){
        this.n = n;
    }
    public void run(){
        for(int i=1;i<=this.n;i++){
            if(i%2==0){
                try{
                    System.out.println(i+" is an Even Number");
                    Thread.sleep(1000);
                }catch(Exception e){}
            }
        }
    }
}

public class Pro22 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the limit of Fibonacci number : ");
        int n = scn.nextInt();
        System.out.print("Enter the limit of Even Numbers : ");
        int m = scn.nextInt();
        Fibonacci fib = new Fibonacci(n);
        Even evn = new Even(m);
        Thread thread1 = new Thread(fib);
        Thread thread2 = new Thread(evn);
        thread1.start();
        thread2.start();
    }
}
