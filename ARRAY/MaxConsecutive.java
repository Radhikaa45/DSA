//Given a binary array nums, return the maximum number of consecutive 1's in the array.

import java.util.Scanner;

public class MaxConsecutive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        
        System.out.println("Enter the elements of the array:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        //code
        int count=0;
        int max=0;
        for(int i=0;i<n;i++){
            if(arr[i]==1){
                count++;
            }
            else{
                count=0;
            }

        }
    System.out.println("the max consecutive one is"+count);
}
}