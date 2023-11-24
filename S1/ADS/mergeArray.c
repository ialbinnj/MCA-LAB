#include<stdio.h>

void main(){
     int a1[10],a2[10],c[50],i,size1,size2;
     printf("Enter size of array1: ");
     scanf("%d",&size1);
     printf("Enter size of array2: ");
     scanf("%d",&size2);
     printf("Enter array element: ");
     for(i=0;i<size1;i++){
          printf("\nArray 1[%d] ",i+1);
          scanf("%d",&a1[i]);
     }
     for(i=0;i<size2;i++){
          printf("\nArray 2[%d] ",i+1);
          scanf("%d",&a2[i]);
     }
     
     
     //Merging array
     for(i=0;i<size1;i++){
          c[i]=a1[i];
     }
     
     for(i=0;i<size2;i++){
          c[size1+i]=a2[i];
     }
     
     //Printing merge array
     for(i=0;i<size1+size2;i++){
          printf("%d\t",c[i]);
     }
}
