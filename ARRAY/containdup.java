//using hash set to find if it has duplicates or not
import java.util.HashSet;
import java.util.Scanner;

public class containdup { 
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        int flag=0;
        
        
        System.out.println("Enter the elements of the array:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
   
        HashSet<Integer> number=new HashSet<>();
        for (int i = 0; i < n; i++) {
            if(number.contains(arr[i])){
                flag++;
            }
            number.add(arr[i]);
        }
         if(flag>0){
        System.out.println("true");
      }
      else
        {
            System.out.println("false");
        }   
    }

    
}

