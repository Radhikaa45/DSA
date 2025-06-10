//check if the array is in the sorted and rotated array

import java.util.Scanner;

public class CheckRotatedNSorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        
        System.out.println("Enter the elements of the array:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int count=0;
        for(int i=0;i<n;i++){
            if(arr[i]>arr[(i+1)%n]){
                count++;
            }
        }
        if(count>1){
            System.out.println("false");
        }
        else{
            System.out.println("true");
        }
    
}
}
