//Given an array arr[], the task is to reverse the array. 
//Reversing an array means rearranging the elements such that the first element becomes the last, 
//the second element becomes second last and so on.

import java.util.Arrays;
import java.util.Scanner;

public class Distributionprb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter the elements of the array:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the no of pakets:");
        int d = sc.nextInt();

        Arrays.sort(arr);

        if (d == 0 || n == 0) 
        {
            System.out.println("0");
            return;
        }
        if (d > n) {
           System.out.println("-1");
           return;      
        }

        int minDiff = Integer.MAX_VALUE;

        // Find the subarray of size m with minimum difference
        for (int i = 0; i + d - 1 < n; i++) {
            int diff = arr[i + d - 1] - arr[i];
            if (diff < minDiff) {
                minDiff = diff;
            }
        }

       System.out.println(minDiff);
    }
}
        

        



