
    import java.util.*;

public class GivenPairSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size of array
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Input array elements
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Input target sum
        System.out.print("Enter target sum: ");
        int target = sc.nextInt();

        // Find and print pairs
        findPairs(arr, target);
    }

    public static void findPairs(int[] arr, int target) {
        HashSet<Integer> seen = new HashSet<>();
        boolean found = false;

        System.out.println("Pairs with sum " + target + ":");
        for (int num : arr) {
            int complement = target - num;
            if (seen.contains(complement)) {
                System.out.println("(" + complement + ", " + num + ")");
                found = true;
            }
            seen.add(num);
        }

        if (!found) {
            System.out.println("No pairs found.");
        }
    }
}
