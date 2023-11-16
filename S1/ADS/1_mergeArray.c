#include<stdio.h>

int main(){
    int m,n,fArray[10],sArray[10],tArray[10],i,j,temp,k=0;
    //Array 1
    printf("Enter the size of Array 1: ");
    scanf("%d",&m);
    printf("Enter array Element: \n");
    for(i=0;i<m;i++){
        printf("\nArray %d: ",i+1); 
        scanf("%d",&fArray[i]);
    }
    //Array 2
    printf("Enter the size of Array 2: ");
    scanf("%d",&n);
    printf("Enter array Element: \n");
    for(i=0;i<n;i++){
        printf("\nArray %d: ",i+1); 
        scanf("%d",&sArray[i]);
    }
    //First Array Sorting
    for(i=0;i<m;i++){
        for(j=i+1;j<m;j++){
            if(fArray[i]>fArray[j]){
               temp=fArray[i];
               fArray[i]=fArray[j];
               fArray[j]=temp;
            }
         }
    }
    //Second Array Sorting
    for(i=0;i<n;i++){
        for(j=i+1;j<n;j++){
            if(sArray[i]>sArray[j]){
               temp=sArray[i];
               sArray[i]=sArray[j];
               sArray[j]=temp;
            }
        }
    }
    //Two Array merging
    i=j=0;
    while(i<m&&j>n){
          if(fArray[i]<=sArray[j]){
             tArray[k]=fArray[i];
             i++;
             k++;
          }else{
             tArray[k]=sArray[j];
             j++;
             k++;
          }
    }
    while(i<m){
         tArray[k]=fArray[i];
         k++;
         i++;
    }
    while(j<n){
         tArray[k]=sArray[j];
         k++;
         j++;
    }
     //Printing
    printf("\nFirst Array: \n");
    for(i=0;i<m;i++){
        printf("%d\n",fArray[i]);
    }
    printf("\nSecond Array: \n");
    for(i=0;i<n;i++){
        printf("%d\n",sArray[i]);
    }
    printf("\nMerged Array: \n");
    for(i=0;i<m+n;i++){
        printf("%d\n",tArray[i]);
    }
    
    for(i=0;i<m+n;i++){
        for(j=i+1;j<m+n;j++){
            if(tArray[i]>tArray[j]){
               temp=tArray[i];
               tArray[i]=tArray[j];
               tArray[j]=temp;
            }
         }
    }
    
    
    printf("\nSorted and Merged Array: \n");
    for(i=0;i<m+n;i++){
        printf("%d\n",tArray[i]);
    }
    return 0;
}
