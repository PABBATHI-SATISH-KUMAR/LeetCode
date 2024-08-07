class Solution {
    public void moveZeroes(int[] nums) {
        int nonZeroIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[nonZeroIndex] = nums[i];
                nonZeroIndex++;
            }
        }
        for (int i = nonZeroIndex; i < nums.length; i++) {
            nums[i] = 0;
        }
        
        // int j = -1;
        // // Find the first zero element
        // for (int i = 0; i < nums.length; i++) {
        //     if (nums[i] == 0) {
        //         j = i;
        //         break;
        //     }
        // }
        // if (j == -1) {
        //     return;
        // }
        // for (int i = j + 1; i < nums.length; i++) {
        //     if (nums[i] != 0) {
        //         // Swap non-zero element with zero at index j
        //         int temp = nums[i];
        //         nums[i] = nums[j];
        //         nums[j] = temp;
        //         j++; // Increment j to point to the next zero
        //     }
        // }
        //  for (int num : nums) {
        //     System.out.print(num + " ");
        // }
    }
}
