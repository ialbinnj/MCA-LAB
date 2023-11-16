#include <stdio.h>
#include <stdlib.h>

struct node {
      int data;
      struct node * next;
}; struct node * start;

int insertAtBeg();
int display();
int insertAtEnd();
int insertAtPosition();
int deleteFirst();
int deleteEnd();
int deletePostion();
int search();

int main(){
    int ch;
    
     while(ch!=5){
           printf("\n\nChoose options\n1.Insertion at Beg\n2.Insertion at end\n3.Insertion at any position\n4.Delete first\n5.Delete last     \n6.Delete any Position\n7.Display\n8.Search element\n9.Exit\nEnter the choice: ");
           scanf("%d",&ch);
           switch(ch){
             case 1: insertAtBeg();
                     break;
             case 2: insertAtEnd();
                     break;
             case 3: insertAtPosition();
                     break;
             case 4: deleteFirst();
                     break;
             case 5: deleteEnd();
                     break;
             case 6: deletePostion();
                     break;
             case 7: display();
                     break;
             case 8: search();
                     break;
             case 9: exit(0);
                     break;
      }
    }
    return 0;
}

int deleteFirst(){
    struct node *temp;
    if(start==0){
       printf("\nList is Empty");
    }else{
         temp=start;
         start=start->next;
         free(temp);
         printf("Node Deleted");
    }
    return 0;
}

int search(){
    int found =-1,key;
    struct node *ptr=start;
    if(start==0) printf("\nLinked list is empty");
    else{
       printf("Enter the element to search: ");
       scanf("%d",&key);
       while(ptr!=0){
            if(ptr->data==key){
               found=1;
               break;
            }else{
               ptr=ptr->next;
            }
       }
       if(found==1){
          printf("%d is present in the linked list",key);
       }else{
          printf("%d is not present in linked list",key);
       }
   } 
}

int deleteEnd(){
    struct node *temp, *prevNode;
    if(start==0){
       printf("\nList is Empty");
    }else{
         temp=start;
         while(temp->next!=0){ 
              prevNode=temp;
              temp=temp->next;
         }
         free(temp);
         prevNode->next=0;
         printf("Node Deleted");
    }
    return 0;
}

int deletePostion(){
    struct node *temp,*position;
    int i=1,pos;
    if(start==0)printf("\nList Empty");
    else{ 
        printf("Enter Postion");
        scanf("%d",&pos);
        position=malloc(sizeof(struct node));
        temp=start;
        while(i<pos-1){
              temp=temp->next;
              i++;
        }
        position=temp->next;
        temp->next=position->next;
        free(position);
        printf("Node Deleted");
    }
    return 0;
}

int insertAtBeg(){
    int value;
    struct node *temp;
    temp=malloc(sizeof(struct node));
    printf("Enter the number to be insert: ");
    scanf("%d",&value);
    temp->data=value;
    temp->next=start;
    start=temp;
    return 0;
}

int insertAtEnd(){
    int data;
    struct node *temp,*head;
    temp=malloc(sizeof(struct node));
    printf("Enter the number to insert at end: ");
    scanf("%d",&data);
    temp->next=0;
    temp->data=data;
    head=start;
    while(head->next!=0){
          head=head->next;
    }
    head->next=temp;
    return 0;
}

int insertAtPosition(){
    struct node *temp, *newNode;
    int pos,val,i=1;
    newNode=malloc(sizeof(struct node));
    printf("Enter position: ");
    scanf("%d",&pos);
    printf("Enter the value: ");
    scanf("%d",&val);
    temp=start;
    newNode->data=val;
    newNode->next=0;
    while(i<pos-1){
          temp=temp->next;
          i++;
    }
    newNode->next=temp->next;
    temp->next=newNode;
    return 0;
}
    

int display(){
    struct node *temp;
    if (start==0) printf("\nList is empty");
    else{
        temp=start;
        printf("List: ");
        while(temp!=0){
              printf("%d -->",temp->data);
              temp=temp->next;
        }
   }
}
