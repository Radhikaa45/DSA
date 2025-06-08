import java.util.Scanner;

public class ProductExceptItself {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        int ans[]=new int[n];
        
        System.out.println("Enter the elements of the array:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        ans[0]=1;
        for (int i = 0; i < n; i++) {
            if(i!=0){
            ans[i]=ans[i-1]*arr[i-1];}
            
            
        }
        int suffix=1;
        for (int i = n-1; i >=0; i--) {
            ans[i] *= suffix;
            suffix *= arr[i];
        }
       for(int i = 0; i < n; i++) {
            System.out.print(ans[i]+" ");
        }
    
}
}
