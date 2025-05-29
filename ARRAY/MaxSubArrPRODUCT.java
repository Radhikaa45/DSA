 import java.util.Scanner;
public class MaxSubArrPRODUCT {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        int leftprod=1;
        int maxprod=arr[0];
        int rightprod=1;
        
        System.out.println("Enter the elements of the array:");
        for(int i = 0; i <n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            leftprod=leftprod*arr[i];
            rightprod=rightprod*arr[n-1-i];

            maxprod=Math.max(maxprod,Math.max(leftprod,rightprod));

            if(leftprod==0){
                leftprod=1;
            }
            if(rightprod==0);{
               rightprod=1;
            }
            
        }
        
                     System.out.println("the maximum subarray sum is"+ maxprod);
        }
    }

    

