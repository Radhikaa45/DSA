//finding 2nd largest without sorting
import java.util.*;
public class secondlargest {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        
        System.out.println("Enter the elements of the array:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int max=0;
        int max2=0;
        for(int i=0;i<n;i++){
            max2=max;
            if(max<arr[i]){
            max=arr[i];



            }
        }
    System.out.println("2nd largest "+max2);
}
}
