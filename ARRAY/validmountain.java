// Given an array of integers arr, return true if and only if it is a valid mountain array.

// Recall that arr is a mountain array if and only if:

// arr.length >= 3
// There exists some i with 0 < i < arr.length - 1 such that:
// arr[0] < arr[1] < ... < arr[i - 1] < arr[i] 
// arr[i] > arr[i + 1] > ... > arr[arr.length - 1]

import java.util.Scanner;

public class validmountain {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
       System.out.println("Enter the elements of the array:");
        for(int i = 0; i <n; i++) {
            arr[i] = sc.nextInt();
        }
           if(n<3){
           System.out.println("false");
        }
        int i=0;

        while(i+1<n && arr[i]<arr[i+1]){
            i++;
        }
        if(i==0 || i==n-1){
           System.out.println("false");
        }
        while(i+1<n && arr[i]>arr[i+1]){
           i++;
        }
        if( i==n-1)
        {
            System.out.println("true");}
      else {
         System.out.println("false");
        }
}
    
}
