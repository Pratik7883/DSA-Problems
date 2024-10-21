import java.util.*;

class Solution {
    public int[] getNoZeroIntegers(int n) {
        ArrayList<Integer> list = new ArrayList<>();

        // Iterate through possible pairs
        for (int i = 1; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (i + j == n && !containsZero(i) && !containsZero(j)) {
                    list.add(i);
                    list.add(j);
                    return new int[]{list.get(0), list.get(1)}; // Return as soon as pair is found
                }
            }
        }
        return new int[0]; // Return empty array if no valid pair found (edge case)
    }

    // Helper function to check if a number contains the digit '0' using if-else logic
    private boolean containsZero(int num) {
        while (num > 0) {
            if (num % 10 == 0) {
                return true;
            } else {
                num /= 10;
            }
        }
        return false;
    }
}
