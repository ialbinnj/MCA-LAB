#include<stdio.h>
#include<stdlib.h>
void insert();
void delete();
void search();
void display();
int n, front=-1, rear=-1, queue[10];
int main()
{
 int ch;
 printf("Enter the size of Queue: ");
 scanf("%d",&n);
 do
  {
    printf("\n1.Insertion\n");
    printf("2.Deletion\n");
    printf("3.Serach\n");
    printf("4.Display\n");
    printf("5.Exit\n");
    printf("enter your choice\n");
    scanf("%d",&ch);
    switch(ch)
      {
        case 1: insert();
                break;
        case 2: delete();
                break;
        case 3: search();
                break;
        case 4: display();
                break;
        case 5: printf("\npress any Key: ");
                exit(0);
       default: printf("\nInvalid choice:");
      }
    }while(ch!=5);
}
void insert(){
     int x;
     if(rear==n-1 && front==0) printf("\nOverflow");
     else{
       printf("\nenter the element to insert:\n");
       scanf("%d",&x);
       if(front==-1 && rear==-1) front=rear=0;
       else if(rear==n-1 || front!=0) rear=0;
       else{
           rear=(rear+1)%n;
           queue[rear]=x;
           printf("\nelement inserted is %d",queue[rear]);
       }
     }
}
void delete(){
     if(front==-1) printf("\nqueue Empty");
     else{
          printf("\nelement to delete %d",queue[front]);
          if(front==rear) front=rear=-1;
          else{
              if(front=n-1) front=0;
              else front+=1;
          }
     }
}
void search(){
     int x,i,j;
     printf("\nEnter the element to search: ");
     scanf("%d",&x);
     if(front<=rear){
        int f1=0;
        for(i=front;i<=rear;i++){
            if(queue[i]==x){
               printf("\nElement found at position %d",i);
               f1=1;
               break;
            }
        }
        if(f1==0) printf("\nElement not found");
     }else{
          int f=0;
          for(i=front,j=1;i<n;i++,j++){
             if(queue[i]==x){
                f=1;
                printf("\nElement found at position at %d",i);
                break;
             }
          }
          if(f==0){
             int f2=0;
             for(i=0;i<=rear;i++){
                 if(queue[i]==x){
                    printf("\nElement found at position at %d",i);
                    f2=1;
                    break;
                 }
             }
             if(f2==0) printf("\nElement not found");
          }
    }
}
void display(){
     int i;
     if(front==-1) printf("\nQueue is empty");
     else if(front<=rear){
            for(i=front;i<=rear;i++) printf("%d",queue[i]);
     }else{
          for(i=front;i<n;i++) printf("%d",queue[i]);
          for(i=0;i<=rear;i++) printf("%d",queue[i]);
     }
}
                
          
            
