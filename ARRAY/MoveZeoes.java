import java.util.Scanner;

public class MoveZeoes {
     public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
         int ans[] = new int[n];
         int index=0;
       
        
        
        System.out.println("Enter the elements of the array:");
        for(int i = 0; i <n; i++) {
            arr[i] = sc.nextInt();
        }
      for (int i =0 ; i < n; i++) {
        if(arr[i]!=0){
            ans[index++]=arr[i];
        }
            
        }
        while(index<n){
            ans[index++] = 0;
        }
       System.out.println(" the reverse of the array is :");
         for(int i = 0; i < n; i++){
            System.out.println(ans[i]); 
         }
    }
}

