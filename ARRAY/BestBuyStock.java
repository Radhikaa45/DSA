// You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.

// Return the maximum profit you can achieve from this transaction. 

import java.util.Scanner;

public class BestBuyStock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        
        System.out.println("Enter the elements of the array:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int maxprofit=0;
        int bestbuy=arr[0];
        for (int i = 0; i < n; i++){
            maxprofit=Math.max(maxprofit,arr[i]-bestbuy);
            bestbuy=Math.min(arr[i],bestbuy);
     
        }
        System.out.println(maxprofit);

    }
}
