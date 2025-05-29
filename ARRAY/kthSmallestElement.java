import java.util.Arrays;
import java.util.Scanner;

public class kthSmallestElement {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        int  kthSmallest=0;
        
        System.out.println("Enter the elements of the array:");
        for(int i = 0; i <n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);

       System.out.println("Enter the kth smallest element you want");
        int k = sc.nextInt();
        
        
           
        System.out.println("ksmallest elememt is "+arr[k-1]);
}
}

