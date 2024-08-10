class Solution {
    public int[] twoSum(int[] nums, int target) {
        // int[] ans = new int[2];
        // for(int i = 0; i < nums.length; i++) {
        //     for(int j = i + 1; j < nums.length; j++) {
        //         if(nums[i] + nums[j] == target) {
        //             ans[0] = i + 1;
        //             ans[1] = j + 1;
        //             return ans;
        //         }
        //     }
        // }
        // return new int[] {-1, -1};

        int start = 0;
        int end = nums.length - 1;

        while (true) {
            int currentSum = nums[start] + nums[end];

            if (currentSum == target) {
                return new int[] {start + 1, end + 1}; 
            }

            int middle = (start + end) / 2;

            if (currentSum < target) {
                if (nums[middle] + nums[end] < target) {
                    start = middle;
                } else {
                    ++start;
                }
            } else {
                if (nums[middle] + nums[start] > target) {
                    end = middle;
                } else {
                    --end;
                }
            }
        }
    }
}
