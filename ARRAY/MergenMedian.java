//Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.

//The overall run time complexity should be O(log (m+n)).

import java.util.Arrays;
import java.util.Scanner;

public class MergenMedian {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of  first array:");
        int n = sc.nextInt();
         System.out.println("Enter the size of second array:");
        int m = sc.nextInt();
        int arr[] = new int[n];
        int arr2[]=new int[m];
        int arr3[]=new int[m+n];
          
 
        System.out.println("Enter the elements of the array:");
        for(int i = 0; i < n; i++) {
             arr[i] = sc.nextInt();
        }
         System.out.println("Enter the elements of the array:");
        for(int i = 0; i < m; i++) {
            arr2[i] = sc.nextInt();
        }

        int index = 0;

        for (int i = 0; i < n; i++) {
            arr3[index++] = arr[i];
        }

        for (int i = 0; i < m; i++) {
            arr3[index++] = arr2[i];  
        }

        Arrays.sort(arr3);

        int total = m + n;  

        if (total % 2 == 1) {
            System.out.println( arr3[total / 2]);
        } else {
            System.out.println((arr3[total / 2 - 1] + arr3[total / 2] )/ 2.0); 
        }
    
}
}
