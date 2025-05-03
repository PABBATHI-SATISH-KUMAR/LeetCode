class Solution {
    public int dominantIndex(int[] nums) {
        int max = Integer.MIN_VALUE;
        int max_index = Integer.MIN_VALUE;
        for(int i = 0;i<nums.length;i++){
            if (nums[i] > max) {
                max = nums[i];
                max_index = i;
            }
        }
        for(int i = 0;i<nums.length;i++){
            if((nums[i] != max) && (nums[i]*2 > max)){
                return -1;
            }
        }
        return max_index;
    }
}