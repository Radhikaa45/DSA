//find minimum element in rotated array
import java.util.Scanner;

public class MinEleRotatedarray {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the size of array:");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int left = 0;
        int right = n - 1;

        while(left<right){ 
        int mid = left + (right - left) / 2;

           
        if (arr[mid] > arr[right]) {
           left = mid + 1;
            } 
            else {
              
                right = mid;
             }
            
        }
        System.out.println(arr[left]);
    
}
}
