//  

class Solution {
    public int[] sumZero(int n) {
        int[] result = new int[n];
        
        // Fill the array with numbers
        for (int i = 0; i < n / 2; i++) {
            result[i] = i + 1;      // Fill with positive numbers
            result[n - 1 - i] = -(i + 1); // Fill with negative numbers
        }
        
        // If n is odd, add 0 in the middle
        if (n % 2 != 0) {
            result[n / 2] = 0; // Place 0 in the center
        }
        
        return result;
    }
}