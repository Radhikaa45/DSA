//Given an integer array nums and an integer k, return the kth largest element in the array.

//Note that it is the kth largest element in the sorted order, not the kth distinct element.

import java.util.Arrays;
import java.util.Scanner;

public class KthLargestElement {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
       
        
        
        System.out.println("Enter the elements of the array:");
        for(int i = 0; i <n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
    System.out.println("Enter the kth largest element you want");
        int k = sc.nextInt();
   
        System.out.println("klargest elememt is "+arr[n-k]);
}
}