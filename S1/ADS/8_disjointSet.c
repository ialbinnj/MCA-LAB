#include<stdio.h>
#include<stdlib.h>

struct node{
     struct node *rep;
     struct node *next;
     int data;
} *heads[50],*tails[50];
static int countroot=0;

void makeset(int x){
     struct node *new=(struct node*)malloc(sizeof(struct node));
     new->rep=new;
     new->next=NULL;
     new->data=x;
     heads[countroot]=new;
     tails[countroot++]=new;
}

struct node *find(int a){
     int i;
     struct node *tmp=(struct node*)malloc(sizeof(struct node));
     for(i=0;i<countroot;i++){
          tmp=heads[i];
          while(tmp!=NULL){
               if(tmp->data==a) return tmp->rep;
               tmp=tmp->next;
          }
     }
     return NULL;
}

void unionSets(int a,int b){
     int i,pos,flag=0,j;
     struct node *tail2=(struct node *)malloc(sizeof(struct node));
     struct node *rep1=find(a);
     struct node *rep2=find(b);
     if(rep1==NULL || rep2 == NULL){
          printf("\nNot present");
          return;
     }
     if(rep1!=rep2){
          for(j=0;j<countroot;j++){
               if(heads[j]==rep2){
                    pos=j;
                    flag=1;
                    countroot-=1;
                    tail2=tails[j];
                    for(i=pos;i<countroot;i++){
                         heads[i]=heads[i+1];
                         tails[i]=tails[i+1];
                    }
               }
               if(flag==1) break;
          }
          for(j=0;j<countroot;j++){
               if(heads[j]==rep1){
                    tails[j]->next=rep2;
                    tails[j]=tail2;
                    break;
               }
          }
          while(rep2!=NULL){
               rep2->rep=rep1;
               rep2=rep2->next;
          }
     }
}

int search(int x){
     int i;
     struct node *tmp=(struct node *)malloc(sizeof(struct node));
     for(i=0;i<countroot;i++){
          tmp=heads[i];
          if(heads[i]->data==x) return 1;
          while(tmp!=NULL){
               if(tmp->data==x) return 1;
               tmp=tmp->next;
          }
     }
     return 0;
}

void main(){
     int ch,x,y,i;
     struct node *rep=(struct node *)malloc(sizeof(struct node));
     while(ch!=5){
          printf("\n\n1.Make Set\n2.Display set Representatives\n3.Union\n4.Find set\n5.Exit\nEnter your choice: ");
          scanf("%d",&ch);
          switch(ch){
             case 1: printf("Enter Element: ");
                     scanf("%d",&x);
                     if(search(x)==1) printf("\nElement already present");
                     else makeset(x);
                     break;
             case 2: printf("The sets are \n");
                     for(i=0;i<countroot;i++) printf("%d,",heads[i]->data);
                     break;
             case 3: printf("Enter the two sets to union\n");
                     printf("Enter first set: ");
                     scanf("%d",&x);
                     printf("Enter second set: ");
                     scanf("%d",&y);
                     unionSets(x,y);
                     break;
             case 4: printf("Enter the value to find: ");
                     scanf("%d",&x);
                     rep=find(x);
                     if(rep==NULL) printf("\nNot present");
                     else printf("\nValue %d is in set %d",x,rep->data);
                     break;
             case 5: exit(0);
             default: printf("\nInvalid choice");             
                     
          }
     }
}
