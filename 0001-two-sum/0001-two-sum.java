class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        ans[0] = ans[1] = -1;
        int[] original = nums.clone(); // store the original array
        Arrays.sort(nums);
        int left = 0, right = nums.length - 1;
        while (left < right) {
            int sum = nums[left] + nums[right];
            if (sum == target) {
                // find the indices in the original array
                for (int i = 0; i < original.length; i++) {
                    if (original[i] == nums[left]) {
                        ans[0] = i;
                        break;
                    }
                }
                for (int i = 0; i < original.length; i++) {
                    if (original[i] == nums[right] && i != ans[0]) {
                        ans[1] = i;
                        break;
                    }
                }
                return ans;
            } else if (sum < target) left++;
            else right--;
        }
        return ans;


        
    }
}