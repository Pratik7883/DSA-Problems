//908. Smallest Range I
import java.util.*;

class SmallestRange {
    public int smallestRangeI(int[] nums, int k) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        // Find the minimum and maximum elements in the array
        for (int num : nums) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        // Calculate the new minimum and maximum after applying the operations
        int newMin = min + k;
        int newMax = max - k;

        // Return the smallest possible score (non-negative)
        return Math.max(0, newMax - newMin);
    }

    public static void main(String[] args) {
        // Create an instance of SmallestRange
        SmallestRange obj = new SmallestRange();

        // Test case 1
        int[] nums1 = {1};
        int k1 = 0;
        System.out.println("Test 1 Output: " + obj.smallestRangeI(nums1, k1)); // Output: 0

        // Test case 2
        int[] nums2 = {0, 10};
        int k2 = 2;
        System.out.println("Test 2 Output: " + obj.smallestRangeI(nums2, k2)); // Output: 6

        // Test case 3
        int[] nums3 = {1, 3, 6};
        int k3 = 3;
        System.out.println("Test 3 Output: " + obj.smallestRangeI(nums3, k3)); // Output: 0
    }
}
