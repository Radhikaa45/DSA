//using two pointer approach
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        
        System.out.println("Enter the elements of the array:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        reverse(arr,n);
         System.out.println(" the reverse of the array is :");
         for(int i = 0; i < n; i++){
            System.out.println(arr[i]); 
         }
    }
    //two pointer start and end 
    //swap this two pointer to reverse
    static int [] reverse(int[] arr,int n){
        int start=0;
        int end=n-1;

        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
     return arr;

    }
}