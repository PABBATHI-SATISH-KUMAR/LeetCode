class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] positive = new int[nums.length / 2];
        int[] negative = new int[nums.length / 2];
        
        int posIndex = 0;
        int negIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= 0) {
                positive[posIndex++] = nums[i];
            } else {
                negative[negIndex++] = nums[i];
            }
        }
        for (int i = 0; i < nums.length / 2; i++) {
            nums[2 * i] = positive[i];
            nums[2 * i + 1] = negative[i];
        }
        return nums;
    }
}
