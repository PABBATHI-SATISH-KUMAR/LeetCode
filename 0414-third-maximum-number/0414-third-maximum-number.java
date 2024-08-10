class Solution {
    public int thirdMax(int[] nums) {
        // Initialize three variables to hold the top three distinct maximums
        Integer large1 = null;
        Integer large2 = null;
        Integer large3 = null;

        for (Integer num : nums) {
            // Skip if this number is already one of the maximums
            if (num.equals(large1) || num.equals(large2) || num.equals(large3)) {
                continue;
            }

            // Update the top three maximums
            if (large1 == null || num > large1) {
                large3 = large2;
                large2 = large1;
                large1 = num;
            } else if (large2 == null || num > large2) {
                large3 = large2;
                large2 = num;
            } else if (large3 == null || num > large3) {
                large3 = num;
            }
        }

        // If the third maximum doesn't exist, return the maximum (large1)
        return large3 == null ? large1 : large3;
    }
}
