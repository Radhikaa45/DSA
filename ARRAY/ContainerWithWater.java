// You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the 
//ith line are (i, 0) and (i, height[i]).

// Find two lines that together with the x-axis form a container, such that the container contains the most water.

// Return the maximum amount of water a container can store.

// Notice that you may not slant the container.

 
import java.util.Scanner;

public class ContainerWithWater {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask for size of the array
        System.out.print("Enter the number of elements in the height array: ");
        int n = scanner.nextInt();

        // Create the array and take input
        int[] height = new int[n];
        System.out.println("Enter the heights:");
        for (int i = 0; i < n; i++) {
            height[i] = scanner.nextInt();
        }

        // Call the function
        int result = maxArea(height);
        System.out.println("Maximum water that can be contained: " + result);

        scanner.close();
    }

    public static int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxWater = 0;

        while (left < right) {
            int width = right - left;
            int minHeight = Math.min(height[left], height[right]);
            int currentArea = width * minHeight;
            maxWater = Math.max(maxWater, currentArea);

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxWater;
    }
}
