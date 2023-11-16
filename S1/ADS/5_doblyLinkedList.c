#include<stdio.h>
#include<stdlib.h>

struct node{
   int data;
   struct node *prev;
   struct node *next;
}; struct node *start;

void begInsert(){
     struct node *ptr;
     int input;
     ptr=(struct node *)malloc(sizeof(struct node *));
     if(ptr==NULL) printf("\nOverflow");
     else{
         printf("\nEnter value: ");
         scanf("%d",&input);
         if(start==NULL){
            ptr->data=input;
            ptr->prev=NULL;
            ptr->next=NULL;
            start=ptr;
         }else{
            ptr->data=input;
            ptr->prev=NULL;
            ptr->next=start;
            start->prev=ptr;
            start=ptr;
         }
     }
}

void lastInsert(){
     struct node *ptr,*temp;
     int input;
     ptr=(struct node *)malloc(sizeof(struct node *));
     if(ptr==NULL) printf("\nOverflow");
     else{
         printf("\nEnter value: ");
         scanf("%d",&input);
         ptr->data=input;
         if(start==NULL){
            ptr->next=NULL;
            ptr->prev=NULL;
            start=ptr;
         }else{
            temp=start;
            while(temp->next!=NULL){
                 temp=temp->next;
            }
            temp->next=ptr;
            ptr->prev=temp;
            ptr->next=NULL;
         }
     }
}

void posInsert() {
    int pos, i, input;
    struct node *ptr, *temp;
    ptr = (struct node *)malloc(sizeof(struct node *));
    if (ptr == NULL)
        printf("\nOverflow");
    else {
        printf("\nEnter value: ");
        scanf("%d", &input);
        ptr->data = input;
        printf("Enter the position: ");
        scanf("%d", &pos);
        temp = start;
        if (pos == 1) {
            if (start == NULL) {
                ptr->data = input;
                ptr->prev = NULL;
                ptr->next = NULL;
                start = ptr;
            } else {
                ptr->data = input;
                ptr->prev = NULL;
                ptr->next = start;
                start->prev = ptr;
                start = ptr;
            }
        } else {
            for (i = 1; i < pos - 1; i++) {
                temp = temp->next;
                if (temp == NULL) {
                    printf("\nCan't insert");
                    return;
                }
            }
            ptr->next = temp->next;
            if (temp->next != NULL) {
                temp->next->prev = ptr;
            }
            temp->next = ptr;
            ptr->prev = temp;
        }
    }
}

void begDel(){
     int input;
     struct node *ptr;
     if(start==NULL) printf("List is empty");
     else{
        ptr=start;
        start=ptr->next;
        start->prev=NULL;
        input=ptr->data;
        free(ptr);
        printf("\n%d is deleted",input);
     }
}

void lastdel(){
     int input;
     struct node *ptr,*ptr1;
     if(start==NULL) printf("\n List is empty");
     else if(start->next==NULL){
       input=start->data;
       start=NULL;
       free(start);
       printf("\n%d is deleted",input);
     }else{
       ptr=start;
       while(ptr->next!=NULL){
            ptr1=ptr;
            ptr=ptr->next;
       }
       ptr1->next=NULL;
       ptr->prev=NULL;
       input=ptr->data;
       free(ptr);
       printf("\n%d is deleted",input);
     }
}

void posDel(){
     struct node *ptr,*ptr1;
     int pos,i,input;
     ptr=start;
     if(ptr==NULL) printf("\nList is empty");
     else{
       printf("\nEnter position: ");
       scanf("%d",&pos);
       if(pos==1){
          ptr=start;
          start=ptr->next;
          start->prev=NULL;
          input=ptr->data;
          free(ptr);
          printf("\n%d is deleted",input);
       }else{
         for(i=1;i<pos;i++){
            ptr1=ptr;
            ptr=ptr->next;
            if(ptr==NULL){
              printf("\nCan't delete");
              return;
            }
         }
         ptr1->next=ptr->next;
         (ptr->next)->prev=ptr1;
         input=ptr->data;
         free(ptr);
         printf("\n%d deleted",input);
       }
   }    
}

void search(){
     struct node *ptr;
     int input,i=0,f;
     ptr=start;
     if(ptr==NULL) printf("\nList is empty");
     else{
         printf("\nEnter element to search: ");
         scanf("%d",&input);
         while(ptr!=NULL){
              if(ptr->data==input){
                 printf("\nItem found at position %d",i+1);
                 f=0;
                 break;
              }
              else{
                 f=1;
              }
              i++;
              ptr=ptr->next;
         }
         if(f==1) printf("\nItem not found");
     }
}

void display(){
     struct node *ptr;
     ptr=start;
     if(ptr==NULL)printf("\nList is empty");
     else{
         while(ptr!=NULL){
              printf("%d->",ptr->data);
              ptr=ptr->next;
         }
         printf("NULL");
     }
}

void main(){
     int ch;
     while(ch!=9){
          printf("\n\n1.Insert at Beg\n2.Insert at last\n3.Insert ad position\n4.Delete from beg\n5.Delete from last\n6.Delete from position\n7.Search\n8.Display\n9.Exit\nEnter your choice: ");
          scanf("%d",&ch);
          switch(ch){
             case 1: begInsert();
                     break;
             case 2: lastInsert();
                     break;
             case 3: posInsert();
                     break;
             case 4: begDel();
                     break;
             case 5: lastdel();
                     break;
             case 6: posDel();
                     break;
             case 7: search();
                     break;
             case 8: display();
                     break;
             case 9: exit(0);
                     break;
             default: printf("\nInvalid choice");             
                     
          }
     }
}
