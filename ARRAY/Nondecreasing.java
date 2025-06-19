// Given an array nums with n integers, your task is to check if it could become non-decreasing by modifying at most one element.

import java.util.Scanner;

public class Nondecreasing {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        
       System.out.println("Enter the elements of the array:");
        for(int i = 0; i <n; i++) {
            arr[i] = sc.nextInt();
        }
        int count=0;
        for(int i = 0; i < n - 1; i++) {
            if(arr[i] > arr[i + 1]) {
                count++;
                if(count > 1) {
                    System.out.println("false");
                    break;
                }

                if(i == 0 || arr[i - 1] <= arr[i + 1]) {
                    arr[i] = arr[i + 1];  
                } else {
                    arr[i + 1] = arr[i];  
                }
            }
        }
         System.out.println("true");
    }
}
    


