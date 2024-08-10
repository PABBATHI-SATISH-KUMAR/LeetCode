class Solution {
    public int thirdMax(int[] nums) {
        // Use a set to track distinct maximums
        Set<Integer> maxSet = new HashSet<>();

        int large1 = Integer.MIN_VALUE;
        int large2 = Integer.MIN_VALUE;
        int large3 = Integer.MIN_VALUE;

        boolean foundMinValue = false; // Track if Integer.MIN_VALUE is in the array

        for (int num : nums) {
            if (maxSet.contains(num)) continue; // Skip if already seen this number

            maxSet.add(num); // Add number to set

            if (num == Integer.MIN_VALUE) foundMinValue = true;

            if (num > large1) {
                large3 = large2;
                large2 = large1;
                large1 = num;
            } else if (num > large2) {
                large3 = large2;
                large2 = num;
            } else if (num > large3) {
                large3 = num;
            }
        }

        // Check if we have at least 3 distinct elements
        if (maxSet.size() >= 3) {
            return large3;
        } else {
            return large1;
        }
    }
}
