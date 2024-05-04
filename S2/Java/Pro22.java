import java.util.Scanner;

public class Pro22 {
    public static void main(String[] args) {
        int i,j,temp;
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int n = scn.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the Array Elements : ");
        for(i=0;i<n;i++){
            arr[i] = scn.nextInt();
        }
        System.out.println("Array is : ");
        for(i=0;i<n;i++){
            System.out.print(arr[i]+"\t");
        }
        for(i=0;i<n-1;i++){
            for(j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println("\nSorted Array is : ");
        for(i=0;i<n;i++){
            System.out.print(arr[i]+"\t");
        }
    }
}
