package org.example;
import java.util.Arrays;

public class SmallestDivisor {

    public static void main(String[] args) {
        int[] nums = {1, 2, 5, 9};
        int threshold = 6;
        System.out.println("Smallest Divisor: " + smallestDivisor(nums, threshold)); // Output should be 5
    }

    private static int smallestDivisor(int[] nums, int threshold) {
        int leastValue = 1;
        int lastValue = Arrays.stream(nums).max().getAsInt();
        int nearestDivisor = 0;

        while (leastValue <= lastValue) {
            int mid = leastValue + (lastValue - leastValue) / 2;
            int sum = 0; // Reset sum for each mid value

            for (int num : nums) {
                // Use Math.ceil-like division by rounding up with (num + mid - 1) / mid
                sum += (num + mid - 1) / mid;
            }

            if (sum <= threshold) {
                nearestDivisor = mid;
                lastValue = mid - 1;
            } else {
                leastValue = mid + 1;
            }
        }
        return nearestDivisor;
    }
}
