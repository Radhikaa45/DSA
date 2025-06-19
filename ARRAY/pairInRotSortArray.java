//find pairs that sum is equal to the target
//array is rotated and sorted

public class pairInRotSortArray {
    public static boolean pairInRotatedSortedArray(int[] arr, int target) {
        int n = arr.length;

        // Step 1: Find the pivot (index of smallest element)
        int pivot = 0;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                pivot = i + 1;
                break;
            }
        }

        // Step 2: Initialize two pointers
        int left = pivot;              // smallest element
        int right = (pivot - 1 + n) % n;  // largest element

        // Step 3: Two-pointer search
        while (left != right) {
            int sum = arr[left] + arr[right];

            if (sum == target)
                return true;
            if (sum < target)
                left = (left + 1) % n;
            else
                right = (right - 1 + n) % n;
        }

        return false;
    }

    public static void main(String[] args) {
        int[] arr = {11, 15, 6, 8, 9, 10};
        int target = 16;
        System.out.println(pairInRotatedSortedArray(arr, target));  // true
    }
}
 
