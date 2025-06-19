import java.util.*;

public class Union {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        
        System.out.println("Enter the elements of the array:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
       
        System.out.println("Enter the size of array:");
        int m = sc.nextInt();
        int arr2[] = new int[m];
        
        System.out.println("Enter the elements of the 2nd array:");
        for(int i = 0; i < m; i++) {
            arr2[i] = sc.nextInt();
        }
      

        
        Set<Integer>union=new HashSet<>();
        for(int val:arr){
            union.add(val);
        }
         for(int val:arr2){
            union.add(val);
        }
          System.out.println("Union: " + union);
}
}
