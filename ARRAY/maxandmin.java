import java.util.Scanner;

public class maxandmin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        
        System.out.println("Enter the elements of the array:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        int result = maxi(arr, n);
        System.out.println("Maximum value is at index: " + result);

        System.out.println("Maximum value is: " + arr[result]);

        int result2 = mini(arr, n);
        System.out.println("Maximum value is at index: " + result2);
        
        System.out.println("Maximum value is: " + arr[result2]);
    }
    
    static int maxi(int[] arr, int n) {
        if (n == 0) return -1; // handle empty array case
        
        int maxIndex = 0;
        for(int i = 1; i < n; i++) {
            if(arr[i] > arr[maxIndex]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }
    static int mini(int[] arr, int n) {
        if (n == 0) return -1; // handle empty array case
        
        int minIndex = 0;
        for(int i = 1; i < n; i++) {
            if(arr[i] < arr[minIndex]) {
                minIndex = i;
            }
        }
        return minIndex;
    }
}