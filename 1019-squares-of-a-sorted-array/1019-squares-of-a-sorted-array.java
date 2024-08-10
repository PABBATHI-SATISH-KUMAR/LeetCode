class Solution {
    public int[] sortedSquares(int[] nums) {
        // int n = nums.length;
        // int[] res = new int[n];
        // int left = 0, right = n - 1;
        // int index = n - 1;
        // while (left <= right) {
        //     int leftSquare = nums[left] * nums[left];
        //     int rightSquare = nums[right] * nums[right];
        //     if (leftSquare > rightSquare) {
        //         res[index] = leftSquare;
        //         left++;
        //     } else {
        //         res[index] = rightSquare;
        //         right--;
        //     }
        //     index--;
        // }
        // return res;


        int[] res = new int[nums.length];
        for(int i = 0; i < nums.length; i++) {
            res[i] = nums[i] * nums[i];
        }
        Arrays.sort(res);
        
        return res;
    }
}
