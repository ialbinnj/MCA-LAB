import java.util.Scanner;

class Stack{
    int n,top=-1;
    int a[] = new int[50];
    Scanner scn = new Scanner(System.in);
    
    Stack(int n){
        this.n = n;
    }
    
    void push(){
        if(top>=n-1){
            System.out.println("Stack is Full");
        }else{
            System.out.print("Enter the Element to push : ");
            int x = scn.nextInt();
            top=top+1;
            a[top] = x;
            System.out.println(x+" is Inserted");
        }
    }
    
    void pop(){
        if(this.top==-1){
            System.out.println("Stack is Empty");
        }else{
            System.out.println(a[top]+" is Deleted");
            top=top-1;
        }
    }
    
    void disp(){
        if(this.top==-1){
            System.out.println("Stack is Empty");
        }else{
            for(int i=0;i<=top;i++){
                System.out.print(a[i]+"\t");
            }
            System.out.println();
        }
    }
}

public class Pro23 {
    public static void main(String[] args) {
        int n;
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the size of the Stack : ");
        n = scn.nextInt();
        Stack stack1 = new Stack(n);
        while(true){
            System.out.println("1.Push\n2.Pop\n3.Display\n4.Exit");
            System.out.print("Enter Your Choice : ");
            int ch = scn.nextInt();
            switch(ch){
                case 1: stack1.push();
                        break;
                case 2: stack1.pop();
                        break;
                case 3: stack1.disp();
                        break;
                case 4: System.exit(0);
                        break;
                default:System.out.println("Enter a valid Choice");
                        break;
            }
        }
    }
}
