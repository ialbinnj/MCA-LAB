#include<stdio.h>
#include<stdlib.h>

struct node{
   int data;
   struct node *next;
}; struct node *start;

void push(){
    int x;
    struct node *ptr;
    ptr = malloc(sizeof(struct node));
    if (ptr==0) printf("Can't push element");
    else{
        printf("Enter the value: ");
        scanf("%d",&x);
        if(start==0){
          ptr -> data=x;
          ptr -> next=0;
          start=ptr;
        }else{
          ptr -> data=x;
          ptr -> next=start;
          start = ptr;
        }
   }
}

void pop(){
     int x;
     struct node * ptr;
     if(start == 0)printf("Underflow");
     else{
         x = start -> data;
         ptr = start;
         start = start -> next;
         free(ptr);
         printf("Element popped %d",x);
     }
}

void traverse(){
     struct node *temp;
     if(start == 0) printf("List is empty");
     else{
         temp = start;
         printf("The list is \n");
         while(temp!=0){
              printf("%d -->",temp->data);
              temp=temp->next;
         }
     }
}

void search(){
     int i=1,f=0,x;
     struct node *ptr;
     ptr=start;
     if(ptr == 0) printf("Stack is empty");
     else{
         printf("Enter Element: ");
         scanf("%d",&x);
         while(ptr!=0){
              if(ptr->data==x){
                 f=1;
                 break;
              }
              i++;
              ptr=ptr->next;
         }
         if(f==0)printf("Item not found");
         else printf("Item found a position %d",i);
    }
}

void main(){
     int ch=0;
     while(ch!=5){
           printf("\n1.Push\n2.Pop\n3.Linear Search\n4.Display\n5.Exit\nEnter your choice: ");
           scanf("%d",&ch);
           switch(ch){
                 case 1:push();
                       break;
                 case 2:pop();
                        break;
                 case 3:search();
                        break;
                 case 4:traverse();
                        break;
                 case 5:exit(0);
                        break;
                default: printf("Invalid Choice");
           }
    }
}
