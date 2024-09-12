class Solution {
    public void rotate(int[] nums, int k) {
    //     int n = a.length;
    //     k = k % n; 
    //     reverse(a, 0, n - 1);
    //     reverse(a, 0, k - 1);
    //     reverse(a, k, n - 1); 
    // }
    // private void reverse(int[] a, int start, int end) {
    //     while (start < end) {
    //         int temp = a[start];
    //         a[start] = a[end];
    //         a[end] = temp;
    //         start++;
    //         end--;
    //     }
    k = k % nums.length;
        int[] rotatedNums = new int[nums.length];
        System.arraycopy(nums, nums.length - k, rotatedNums, 0, k);
        System.arraycopy(nums, 0, rotatedNums, k, nums.length - k);
        System.arraycopy(rotatedNums, 0, nums, 0, nums.length);
    }
}