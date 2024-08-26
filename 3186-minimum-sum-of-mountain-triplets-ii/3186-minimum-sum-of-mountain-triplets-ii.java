class Solution {
    public int minimumSum(int[] nums) {
        int n = nums.length;
        if (n < 3) return -1;
        int[] leftMin = new int[n];
        int[] rightMin = new int[n];
        Arrays.fill(leftMin, Integer.MAX_VALUE);
        Arrays.fill(rightMin, Integer.MAX_VALUE);
        for (int i = 1; i < n; i++) {
            if (nums[i - 1] < nums[i]) {
                leftMin[i] = Math.min(leftMin[i - 1], nums[i - 1]);
            } else {
                leftMin[i] = leftMin[i - 1];
            }
        }
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i + 1] < nums[i]) {
                rightMin[i] = Math.min(rightMin[i + 1], nums[i + 1]);
            } else {
                rightMin[i] = rightMin[i + 1];
            }
        }
        int minSum = Integer.MAX_VALUE;
        for (int j = 1; j < n - 1; j++) {
            if (leftMin[j] < nums[j] && rightMin[j] < nums[j]) {
                int sum = leftMin[j] + nums[j] + rightMin[j];
                minSum = Math.min(minSum, sum);
            }
        }
        return minSum == Integer.MAX_VALUE ? -1 : minSum;
    }
}
