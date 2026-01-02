package recursion;
public class sum {
       public static void main(String[] args) {
        int a=sum(20);
        System.out.println(a);

    
    
}
public static int sum (int n){
    if(n==0){
      
        return 0;
    }
    return n+sum(n-1);
}
}
    
