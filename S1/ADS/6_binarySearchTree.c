#include<stdio.h>
#include<stdlib.h>

struct node{
  struct node *left;
  struct node *right;
  int data;
}; struct node *root;

struct node *newnode(int value){
       struct node *newNode=malloc(sizeof(struct node));
       newNode->data=value;
       newNode->left=NULL;
       newNode->right=NULL;
       return newNode;
}

struct node* insert(struct node* root, int value) {
    if (root == NULL) {
        return newnode(value);
    } else if (value == root->data) {
        printf("Same data can't be stored");
    } else if (value > root->data) {
        root->right = insert(root->right, value);
    } else if (value < root->data) {
        root->left = insert(root->left, value);
    }
    return root;
}

//Inorder traversal
/**void inorderTraversal(struct node* root){
     if(root==NULL) return;
     inorderTraversal(root->left);
     printf("%d->",root->data);
     inorderTraversal(root->right);
}**/

//Preorder traversal


void preorderTraversal(struct node* root) {
    if (root == NULL) return;
    printf("%d->", root->data);
    preorderTraversal(root->left);
    preorderTraversal(root->right);
}

//Postorder traversal
/**void postorderTraversal(struct node* root){
     if(root==NULL) return;
     postorderTraversal(root->left);
     postorderTraversal(root->right);
     printf("%d->",root->data);
}**/

struct node *search(struct node* root,int key){
     if(root==NULL) printf("\nNot Found");
     else if(root->data==key) printf("\nFound");
     else{
     if(root->data<key) 
     return search(root->right,key);
     return search(root->left,key);
     }
}

struct node *minValueNode(struct node* node){
     struct node* current=node;
     while(current && current->left!=NULL){
          current=current->left;
     }
     return current;
}

struct node *deleteNode(struct node* root,int key){
     if(root==NULL) return root;
     if(key<root->data) root->left=deleteNode(root->left,key);
     else if(key>root->data)root->right=deleteNode(root->right,key);
     else{
          if(root->left==NULL){
               struct node *temp=root->right;
               printf("%d Deleted",root);
               free(root);
               return temp;
          }else if(root->right==NULL){
               struct node *temp=root->left;
               free(root);
               return temp;
          }
          
          struct node* temp=minValueNode(root->right);
          root->data=temp->data;
          root->right=deleteNode(root->right,temp->data);
     }
     return root;
}

void main(){
     int value,searchv,key,ch;
     while(ch!=6){
          printf("\n\n1.Create Root Node\n2.Insert Node\n3.Search\n4.Preorder Traversal\n5.Delete\n6.Exit\nEnter your choice: ");
          scanf("%d",&ch);
          switch(ch){
             case 1: printf("Enter a Number: ");
                     scanf("%d",&value);
                     root=newnode(value);
                     break;
             case 2: printf("Enter a Number: ");
                     scanf("%d",&value);
                     root=insert(root,value);
                     break;
             case 3: printf("Enter a Number: ");
                     scanf("%d",&searchv);
                     search(root,searchv);
                     break;
             case 4: preorderTraversal(root);
                     break;
             case 5: printf("Enter a Number to be deleted: ");
                     scanf("%d",&key);
                     deleteNode(root,key);
                     break;
             case 6: exit(0);
             default: printf("\nInvalid choice");             
                     
          }
     }
}
