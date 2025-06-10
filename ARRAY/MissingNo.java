import java.util.Arrays;
import java.util.Scanner;

public class MissingNo {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the size of array:");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
      Arrays.sort(arr);
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=i){
                System.out.println(i);
                break;
            }
           
        }
      
    }
   
}

