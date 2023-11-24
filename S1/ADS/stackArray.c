#include<stdio.h>
#define MAX_SIZE 100
int main(){
    int arr[MAX_SIZE];
    int limit,top=-1,ele,i,ch;
    printf("Enter the limit: ");
    scanf("%d",&limit);
    
    do{
      printf("\n1:Push\n2:Pop\n3:Display\n4:Exit\n");
      scanf("%d",&ch);
      
      switch(ch){
             case 1: //Push
                     if(top>=limit-1){
                       printf("Stack Overflow");
                     }else{
                          printf("Enter the Element\n");
                          scanf("%d",&ele);
                          top+=1;
                          arr[top]=ele;
                     }
                     break;
                     
            case 2: //Pop
                    if(top<=-1){
                      printf("Stack underflow");
                    }else{
                      printf("Enter the element to pop");
                      scanf("%d",&ele);
                      top--;
                    }
                    break;
                      
            case 3: //Display
                    for(i=0;i<=limit;i++){
                        printf("%d\n",arr[i]);
                    }
                    break;
                 
           case 4: //Exit
                   exit(1)
           default: printf("Invalid Number");
                    break;
     }
   }while(1);
   return 0;
}
         
