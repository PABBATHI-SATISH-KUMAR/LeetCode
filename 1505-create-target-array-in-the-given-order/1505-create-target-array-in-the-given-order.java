class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int[] target = new int[nums.length];
        int currentIdx = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = currentIdx; j > index[i]; j--) {
                target[j] = target[j - 1];
            }
            target[index[i]] = nums[i];
            currentIdx++;
        }

        return target;
    }
}