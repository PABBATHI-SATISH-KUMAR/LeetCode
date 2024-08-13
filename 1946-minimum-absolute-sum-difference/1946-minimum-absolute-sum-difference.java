class Solution {
    public int minAbsoluteSumDiff(int[] nums1, int[] nums2) {
        final int MOD = 1_000_000_007;
        int n = nums1.length;
        long initialDiff = 0;
        int[] sortedNums1 = nums1.clone();
        Arrays.sort(sortedNums1);
        for (int i = 0; i < n; i++) {
            initialDiff += Math.abs(nums1[i] - nums2[i]);
        }
        long maxImprovement = 0;
        for (int i = 0; i < n; i++) {
            int originalDiff = Math.abs(nums1[i] - nums2[i]);
            int low = 0;
            int high = n - 1;
            while (low <= high) {
                int mid = low + (high - low) / 2;
                if (sortedNums1[mid] < nums2[i]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
            if (low < n) {
                int newDiff = Math.abs(sortedNums1[low] - nums2[i]);
                maxImprovement = Math.max(maxImprovement, originalDiff - newDiff);
            }
            if (high >= 0) {
                int newDiff = Math.abs(sortedNums1[high] - nums2[i]);
                maxImprovement = Math.max(maxImprovement, originalDiff - newDiff);
            }
        }
        long minDiff = (initialDiff - maxImprovement + MOD) % MOD;
        return (int) minDiff;
    }
}
