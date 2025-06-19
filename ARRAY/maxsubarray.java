//kadane's ALgorithm
import java.util.Scanner;

public class maxsubarray{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        int csum=0;
        int maxsum=Integer.MIN_VALUE;
        
        System.out.println("Enter the elements of the array:");
        for(int i = 0; i <n; i++) {
            arr[i] = sc.nextInt();
        }
        //kadane algorithm
        for(int i=0;i<n;i++){
             
                    csum=csum+arr[i];
                    maxsum=Math.max(csum,maxsum);
                    if(csum<0){
                        csum=0;
                    }
                   
            }
                     System.out.println("the maximum subarray sum is"+ maxsum);
        }
    }

