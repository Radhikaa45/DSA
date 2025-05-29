//Given an integer array nums sorted in non-decreasing order, 
//return an array of the squares of each number sorted in non-decreasing order.
import java.util.Arrays;
import java.util.Scanner;
public class SquareandSort {


    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        int flag=0;
        
        
        System.out.println("Enter the elements of the array:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
         System.out.println("Enter the elements of the array:");
        for(int i = 0; i < n; i++) {
            arr[i] = arr[i]*arr[i];
        }
        Arrays.sort(arr);
        for(int i = 0; i < n; i++) {
             System.out.println(arr[i]);
        }
        }

    
}
