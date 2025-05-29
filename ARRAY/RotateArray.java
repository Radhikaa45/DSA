////Given an integer array nums, rotate the array to the right by d steps, where d is non-negative.

import java.util.Scanner;

public class RotateArray {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
         int arr2[] = new int[n];
         int index=0;

        System.out.println("Enter the elements of the array:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the no of steps");
        int d = sc.nextInt();
        //just in case no of rotation is morw than array length
        if(d>n){
        d=d%n;}
       //adding the shiffted no
       //m=split
        int m=n-d;
        for(int i=m;i<n;i++){
            arr2[index++]=arr[i];

        }
        //shifting the rest of array
         for(int i=0;i<m;i++){
            arr2[index++]=arr[i];

        }
        //put in back
         
        for(int i = 0; i < n; i++) {
            arr[i] = arr2[i];
        }
       for(int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
    
}
}
