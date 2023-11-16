#include<stdio.h>

void main(){
     int lar,sam,a[10],i,size;
     printf("Enter size of array: ");
     scanf("%d",&size);
     printf("Enter array element: ");
     for(i=0;i<size;i++){
          printf("\nArray[%d] ",i+1);
          scanf("%d",&a[i]);
     }
     
     /*for(i=0;i<size;i++){
      if(a[i]>a[i-1]){
        lar=a[i];
      }
      if(a[i]<a[i-1]){
        sam=a[i];
      }
     }*/
     
     lar=sam=a[0];
     for(i=0;i<size;i++){
          if(lar>a[i]){
               lar=a[i];
          }
          if(sam<a[i]){
               sam=a[i];
          }
     }
     
     
     printf("\nLargest element : %d",lar);
     printf("\nSmallest element : %d\n",sam);
}
